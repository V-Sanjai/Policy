package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.CoverageRate;
import com.example.policyadministartivesystem.repository.CoverageRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverageRateServiceImple implements CoverageRateService{
    @Autowired
    CoverageRateRepository coverageRateRepository;
    @Override
    public List<CoverageRate> getallcoveragerate() {
        return coverageRateRepository.findAll();
    }

    @Override
    public CoverageRate findbyid(int id) {
        return coverageRateRepository.findById(id).orElse(null);
    }
}
