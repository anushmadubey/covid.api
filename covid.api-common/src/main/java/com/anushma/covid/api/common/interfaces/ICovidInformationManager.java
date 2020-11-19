package com.anushma.covid.api.common.interfaces;

import com.anushma.covid.api.common.model.CovidDetailResponse;

public interface ICovidInformationManager {

	CovidDetailResponse getCovidInformation(String countryCode, String status);
	
	String getTotalCovidInformation(String status);
}
