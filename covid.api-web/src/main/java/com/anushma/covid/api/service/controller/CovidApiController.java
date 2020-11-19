package com.anushma.covid.api.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anushma.covid.api.common.interfaces.ICovidInformationManager;
import com.anushma.covid.api.common.model.CovidDetailRequest;
import com.anushma.covid.api.common.model.CovidDetailResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "CovidApiController")
@RestController
@RequestMapping("api/covid")
public class CovidApiController {
	
	@Autowired
	private ICovidInformationManager covidInformationManager;
	
	

	 @ApiOperation(value = "Given a terminalId, Returns the product catalogue response.",
	      response = CovidDetailResponse.class,
	      tags = "covid - info")
	  @GetMapping("/getCountrySpecificData")
	  public @ResponseBody CovidDetailResponse getCountrySpecificInfo(CovidDetailRequest request)
	      throws Exception{
	    return covidInformationManager.getCovidInformation(request.getCountry(), "yada");
	  }

	
	
	
	
	
	
	
	

}
