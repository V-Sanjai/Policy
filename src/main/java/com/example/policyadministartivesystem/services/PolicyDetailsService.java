package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.PolicyDetails;

import java.util.List;

public interface PolicyDetailsService {
    public List<PolicyDetails> getall();
    public PolicyDetails add(PolicyDetails policyDetails);
    public PolicyDetails findbyid(int id);
    public void deletebyid(int id);

    public PolicyDetails update(PolicyDetails policyDetails);

}
