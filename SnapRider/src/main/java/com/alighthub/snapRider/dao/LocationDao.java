package com.alighthub.snapRider.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alighthub.snapRider.model.Location;


public interface LocationDao extends JpaRepository <Location, Integer>{

}
