package com.offcn.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.PhoneDao;
import com.offcn.po.Phone;
import com.offcn.service.PhoneService;
@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	PhoneDao phoneDao;
	@Override
	public Phone search(String number) {
		
		if(number.length()>7){
			number=number.substring(0, 7);
		}
		return phoneDao.search(number);
	}

}
