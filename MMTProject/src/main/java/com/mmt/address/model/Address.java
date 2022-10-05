package com.mmt.address.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;
import com.mmt.user.model.User;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "address_seq")
	@GenericGenerator(name="address_seq",
	            strategy = "com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator",
	            parameters = {
	                    @Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value="1"),
	                    @Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="Address_"),
	                    @Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%05d")
	            }
	            )
	private String addressId;
	private String houseNo;
	private String streetName;
	private String area;
	private String city;
	private String state;
	private int pinCode =0;
	private String country;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private User userd;
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public User getUserd() {
		return userd;
	}
	public void setUserd(User userd) {
		this.userd = userd;
	}
	

}