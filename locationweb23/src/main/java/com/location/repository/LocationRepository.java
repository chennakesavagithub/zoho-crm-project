package com.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entities.Locations;

public interface LocationRepository extends JpaRepository<Locations, Long> {

}
