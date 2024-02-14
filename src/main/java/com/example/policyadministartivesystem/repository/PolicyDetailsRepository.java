package com.example.policyadministartivesystem.repository;

import com.example.policyadministartivesystem.entity.PolicyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails,Integer> {
}
