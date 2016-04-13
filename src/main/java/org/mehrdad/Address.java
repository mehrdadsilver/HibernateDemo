package org.mehrdad;

import org.springframework.beans.factory.annotation.Required;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;


@Builder(builderClassName="Builder")
@ToString
public class Address {

	@NonNull
	private String postalCode;
	
	private String country;
	
	private String province;
	private String city;
	private String street;
	private String block;
	private String unit;


}
