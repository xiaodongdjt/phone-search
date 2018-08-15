package com.offcn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Phone;

public interface PhoneService {

	 @GET
	 @Path("/search/{number}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Phone search(@PathParam("number")String number);
}
