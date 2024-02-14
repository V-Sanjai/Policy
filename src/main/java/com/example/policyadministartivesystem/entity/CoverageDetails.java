package com.example.policyadministartivesystem.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class CoverageDetails {
    @Id
    private int id;
    private String coveragename;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<PolicyDetails> policyDetailsList;

    public CoverageDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoveragename() {
        return coveragename;
    }

    public void setCoveragename(String coveragename) {
        this.coveragename = coveragename;
    }

    public CoverageDetails(int id, String coveragename) {
        this.id = id;
        this.coveragename = coveragename;
    }

    public List<PolicyDetails> getCustomerDetailsList() {
        return policyDetailsList;
    }

    public void setCustomerDetailsList(List<PolicyDetails> policyDetailsList) {
        this.policyDetailsList = policyDetailsList;
    }

    @Override
    public String toString() {
        return "CoverageDetails{" +
                "id=" + id +
                ", coveragename='" + coveragename + '\'' +
                '}';
    }
}
