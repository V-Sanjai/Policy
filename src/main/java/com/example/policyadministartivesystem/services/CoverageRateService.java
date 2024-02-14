package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.CoverageRate;

import java.util.List;

public interface CoverageRateService {
    public List<CoverageRate> getallcoveragerate();
    public CoverageRate findbyid(int id);

}
