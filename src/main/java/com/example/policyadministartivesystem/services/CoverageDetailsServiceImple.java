package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.CoverageDetails;
import com.example.policyadministartivesystem.repository.CoverageDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverageDetailsServiceImple {
    @Autowired
    CoverageDetailsRepository coverageDetailsRepository;
    public List<CoverageDetails> getallcoveragedetails(){
        return coverageDetailsRepository.findAll();
    }
    public CoverageDetails findbyid(int id){
        return  coverageDetailsRepository.findById(id).orElse(null);
    }
}
