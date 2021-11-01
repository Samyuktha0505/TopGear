package com.wipro.springtopgear.ioc.assignment2;

import org.springframework.stereotype.Component;

/**
 *  countryId -> String -> C001
 *  countryName -> String -> ‘India’ 
 * @author SamyuTilak
 *
 */
@Component
public class Country {

	private String countryId;
	private String countryName;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	
	
}
