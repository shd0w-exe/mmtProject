package com.mmt.address.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmt.address.model.Address;

public interface AddressDao extends JpaRepository<Address,String> {
	Address findByUserdUserId(String userId);
}
