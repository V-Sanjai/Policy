package com.example.policyadministartivesystem.repository;

import com.example.policyadministartivesystem.entity.PolicyHolderLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyHolderLocationRepository extends JpaRepository<PolicyHolderLocation,Integer> {

}
