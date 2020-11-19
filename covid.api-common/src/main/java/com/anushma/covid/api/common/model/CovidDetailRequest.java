package com.anushma.covid.api.common.model;

public class CovidDetailRequest {

	private String status;
	private String country;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "StatusDetailRequest [status=" + status + ", country=" + country + "]";
	}

}
