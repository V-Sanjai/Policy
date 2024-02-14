package com.example.policyadministartivesystem.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PolicyDetails {

    @Id
    private int policynumber;
    private String holdername;
    private String address1;
    private String address2;

    @ManyToMany(cascade = CascadeType.ALL)
    List<PolicyHolderLocation> policyHolderLocations= new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    List<CoverageDetails> coverageDetails = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    List<CoverageRate> coverageRates = new ArrayList<>();

    public PolicyDetails() {
    }

    public PolicyDetails(int policynumber, String holdername, String address1, String address2) {
        this.policynumber = policynumber;
        this.holdername = holdername;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(int policynumber) {
        this.policynumber = policynumber;
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public List<PolicyHolderLocation> getPolicyHolderLocations() {
        return policyHolderLocations;
    }

    public void setPolicyHolderLocations(List<PolicyHolderLocation> policyHolderLocations) {
        this.policyHolderLocations = policyHolderLocations;
    }

    public List<CoverageDetails> getCoverageDetails() {
        return coverageDetails;
    }

    public void setCoverageDetails(List<CoverageDetails> coverageDetails) {
        this.coverageDetails = coverageDetails;
    }

    public List<CoverageRate> getCoverageRates() {
        return coverageRates;
    }

    public void setCoverageRates(List<CoverageRate> coverageRates) {
        this.coverageRates = coverageRates;
    }

    @Override
    public String toString() {
        return "PolicyDetails{" +
                "policynumber=" + policynumber +
                ", holdername='" + holdername + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                '}';
    }
}
