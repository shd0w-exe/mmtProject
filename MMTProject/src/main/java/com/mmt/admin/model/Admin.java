package com.mmt.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "admin_seq")
	@GenericGenerator(name="admin_seq",
	            strategy = "com.example.demo.sequencegenerator.StringPrefixedSequenceIdGenerator",
	            parameters = {
	                    @Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value="1"),
	                  @Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="Admin_"),
	                    @Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%02d")
	            }
	            )
	private String adminId;
	private String firstName;
	private String lastName;
	private String password;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
