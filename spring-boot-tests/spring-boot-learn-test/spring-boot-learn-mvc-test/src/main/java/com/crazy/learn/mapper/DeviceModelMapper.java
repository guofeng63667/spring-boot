package com.crazy.learn.mapper;

import com.crazy.learn.model.DeviceModel;

/**
 *
 * @Author guofeng@picooc.com
 * @Date 2020-04-14 
 * @Version V1.0
**/
public interface DeviceModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceModel record);

    int insertSelective(DeviceModel record);

    DeviceModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceModel record);

    int updateByPrimaryKey(DeviceModel record);
}