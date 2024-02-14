package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.PolicyHolderLocation;
import com.example.policyadministartivesystem.repository.PolicyHolderLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyHolderLocationServiceImple implements PolicyHolderLocationService {

    @Autowired
    PolicyHolderLocationRepository policyHolderLocationRepository;
    @Override
    public List<PolicyHolderLocation> getalllocation() {
        return policyHolderLocationRepository.findAll();
    }

    @Override
    public PolicyHolderLocation findbyid(int id) {
        return policyHolderLocationRepository.findById(id).orElse(null);
    }
}
