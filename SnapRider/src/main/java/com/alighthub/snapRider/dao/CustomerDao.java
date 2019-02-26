package com.alighthub.snapRider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.snapRider.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
