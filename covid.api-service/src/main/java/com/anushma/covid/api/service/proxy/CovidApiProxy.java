package com.anushma.covid.api.service.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anushma.covid.api.common.model.CovidDetailRequest;
import com.anushma.covid.api.common.model.CovidDetailResponse;
import com.anushma.covid.api.service.rest.calls.CovidRestApis;

@Service
public class CovidApiProxy {

	@Autowired
	private CovidRestApis restApis;

	public CovidDetailResponse getCountrySpecificInfo(CovidDetailRequest request) {
		return restApis.getCountrySpecificData(request);

	}
}
