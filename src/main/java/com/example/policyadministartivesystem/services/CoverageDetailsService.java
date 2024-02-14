package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.CoverageDetails;

import java.util.List;

public interface CoverageDetailsService {
    public List<CoverageDetails> getallcoveragedetails();
    public CoverageDetails findbyid(int id);
}
