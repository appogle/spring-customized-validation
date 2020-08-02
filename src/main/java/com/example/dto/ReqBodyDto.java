package com.example.dto;

import com.example.config.validation.GreaterThan;
import com.example.config.validation.NullOrNotBlank;
import com.example.config.validation.NullOrSpecificValues;
import com.example.config.validation.SpecificValues;

public class ReqBodyDto {

	@NullOrNotBlank
	private String nullOrNotBlankParam;
	
	@GreaterThan(1)
	private Integer greaterThanParam;
	
	@NullOrSpecificValues(intValues = {1, 2, 3})
	private Integer nullOrSpecificValuesIntegerParam;
	
	@NullOrSpecificValues(strValues = {"a", "b", "c"})
	private String nullOrSpecificValuesStringParam;
	
	@SpecificValues(intValues = {1, 2, 3})
	private Integer specificValuesIntegerParam;
	
	@SpecificValues(strValues = {"a", "b", "c"})
	private String specificValuesStringParam;

	public String getNullOrNotBlankParam() {
		return nullOrNotBlankParam;
	}

	public void setNullOrNotBlankParam(String nullOrNotBlankParam) {
		this.nullOrNotBlankParam = nullOrNotBlankParam;
	}

	public Integer getGreaterThanParam() {
		return greaterThanParam;
	}

	public void setGreaterThanParam(Integer greaterThanParam) {
		this.greaterThanParam = greaterThanParam;
	}

	public Integer getNullOrSpecificValuesIntegerParam() {
		return nullOrSpecificValuesIntegerParam;
	}

	public void setNullOrSpecificValuesIntegerParam(Integer nullOrSpecificValuesIntegerParam) {
		this.nullOrSpecificValuesIntegerParam = nullOrSpecificValuesIntegerParam;
	}

	public String getNullOrSpecificValuesStringParam() {
		return nullOrSpecificValuesStringParam;
	}

	public void setNullOrSpecificValuesStringParam(String nullOrSpecificValuesStringParam) {
		this.nullOrSpecificValuesStringParam = nullOrSpecificValuesStringParam;
	}

	public Integer getSpecificValuesIntegerParam() {
		return specificValuesIntegerParam;
	}

	public void setSpecificValuesIntegerParam(Integer specificValuesIntegerParam) {
		this.specificValuesIntegerParam = specificValuesIntegerParam;
	}

	public String getSpecificValuesStringParam() {
		return specificValuesStringParam;
	}

	public void setSpecificValuesStringParam(String specificValuesStringParam) {
		this.specificValuesStringParam = specificValuesStringParam;
	}
	
}
