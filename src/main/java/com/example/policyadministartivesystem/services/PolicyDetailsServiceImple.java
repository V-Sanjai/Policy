package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.PolicyDetails;
import com.example.policyadministartivesystem.repository.PolicyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyDetailsServiceImple implements PolicyDetailsService {

    @Autowired
    PolicyDetailsRepository policyDetailsRepository;
    @Override
    public List<PolicyDetails> getall() {
        return policyDetailsRepository.findAll();
    }

    @Override
    public PolicyDetails add(PolicyDetails policyDetails) {
        return policyDetailsRepository.save(policyDetails);
    }

    @Override
    public PolicyDetails findbyid(int id) {
        return policyDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public void deletebyid(int id) {
        policyDetailsRepository.deleteById(id);
    }

    @Override
    public PolicyDetails update(PolicyDetails policyDetails) {
        return policyDetailsRepository.save(policyDetails);
    }
}
