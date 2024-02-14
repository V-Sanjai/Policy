package com.example.policyadministartivesystem.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class PolicyHolderLocation {
    @Id

    private int id;
    private String state;


    @ManyToMany(cascade = CascadeType.ALL)
    List<PolicyDetails> policyDetailsList;

    public PolicyHolderLocation() {
    }

    public PolicyHolderLocation(int id, String state) {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PolicyDetails> getCustomerDetailsList() {
        return policyDetailsList;
    }

    public void setCustomerDetailsList(List<PolicyDetails> policyDetailsList) {
        this.policyDetailsList = policyDetailsList;
    }

    @Override
    public String toString() {
        return "PolicyHolderLocation{" +
                "id=" + id +
                ", state='" + state + '\'' +
                '}';
    }
}
