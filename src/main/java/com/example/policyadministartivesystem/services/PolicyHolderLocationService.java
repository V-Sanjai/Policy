package com.example.policyadministartivesystem.services;

import com.example.policyadministartivesystem.entity.PolicyHolderLocation;

import java.util.List;

public interface PolicyHolderLocationService {
    public List<PolicyHolderLocation> getalllocation();
    public PolicyHolderLocation findbyid(int id);
}
