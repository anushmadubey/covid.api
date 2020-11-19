package com.anushma.covid.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anushma.covid.api.common.interfaces.ICovidInformationManager;
import com.anushma.covid.api.common.model.CovidDetailRequest;
import com.anushma.covid.api.common.model.CovidDetailResponse;
import com.anushma.covid.api.service.proxy.CovidApiProxy;


@Service
public class CovidInformationManagerService implements ICovidInformationManager{

	@Autowired
	private CovidApiProxy proxy;
	
	
	@Override
	public CovidDetailResponse getCovidInformation(String countryCode, String status) {
		CovidDetailRequest request = new CovidDetailRequest();
		request.setCountry("India");
		request.setStatus("confirmed");
		
		return  proxy.getCountrySpecificInfo(request);
	}

	@Override
	public String getTotalCovidInformation(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
