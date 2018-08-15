package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.po.Phone;
import com.offcn.service.PhoneService;

@Controller
public class PhoneController {

	@Autowired
	PhoneService phoneService;
	@RequestMapping("phonesearch")
	public String search(String number,Model model){
		Phone phone = phoneService.search(number);
		if(phone!=null){
			model.addAttribute("msg", "号码:"+number+" 归属地:"+phone.getArea()+" 所属运营商:"+phone.getType());
		}else{
			model.addAttribute("msg", "号码:"+number+"在号段库中不存在!");
		}
		
		return "phone";
	}
}
