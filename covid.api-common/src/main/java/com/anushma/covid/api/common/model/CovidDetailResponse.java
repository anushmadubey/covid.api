package com.anushma.covid.api.common.model;

public class CovidDetailResponse {

	private String status;
	private String value;
	private Boolean isSuccess;
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CovidDetailResponse [status=" + status + ", value=" + value + ", isSuccess=" + isSuccess + ", message="
				+ message + "]";
	}

}
