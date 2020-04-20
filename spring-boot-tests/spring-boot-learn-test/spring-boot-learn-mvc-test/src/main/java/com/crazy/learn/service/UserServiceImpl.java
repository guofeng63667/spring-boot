package com.crazy.learn.service;

import com.crazy.learn.mapper.DeviceModelMapper;
import com.crazy.learn.model.DeviceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-12
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private DeviceModelMapper deviceModelMapper;

	@Override
	public String getMyName() {
		System.out.println("getMyName is guofeng!~");
		return "guofeng";
	}


	@Transactional(propagation = Propagation.REQUIRED)
	public void insert(){
		deviceModelMapper.insert(getNew(1000));
		deviceModelMapper.insert(getNew(1001));
	}

	private DeviceModel getNew(int id){
	    DeviceModel deviceModel = new DeviceModel();
	    deviceModel.setId(id);
	    deviceModel.setDeviceType(1);
	    deviceModel.setBrand(1);
	    deviceModel.setLevel(1);
	    deviceModel.setAttendMode(1);
	    deviceModel.setRemarkName("123");
	    deviceModel.setFrontViewUrl("123");
	    deviceModel.setFrontFiveViewUrl("123");
	    deviceModel.setMatchBalanceUrl("123");
	    deviceModel.setDownloadUrl("123");
	    deviceModel.setCreateTime(new Date());
	    deviceModel.setUpdateTime(new Date());
	    return deviceModel;

	}
}
