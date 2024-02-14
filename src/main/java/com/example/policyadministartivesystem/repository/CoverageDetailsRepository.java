package com.example.policyadministartivesystem.repository;

import com.example.policyadministartivesystem.entity.CoverageDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverageDetailsRepository extends JpaRepository<CoverageDetails,Integer> {
}
