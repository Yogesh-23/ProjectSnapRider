package com.alighthub.snapRider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.snapRider.model.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer>{

}
