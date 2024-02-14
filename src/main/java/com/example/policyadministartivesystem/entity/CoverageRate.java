package com.example.policyadministartivesystem.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CoverageRate {
    @Id

    private int id;
    private int rate;
    private String coverage;
    private String state;
    @ManyToMany(cascade = CascadeType.ALL)
    List<CoverageRate> coverageRateList = new ArrayList<>();

    public CoverageRate() {
    }

    public CoverageRate(int id, int rate, String coverage, String state) {
        this.id = id;
        this.rate = rate;
        this.coverage = coverage;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<CoverageRate> getCoverageRateList() {
        return coverageRateList;
    }

    public void setCoverageRateList(List<CoverageRate> coverageRateList) {
        this.coverageRateList = coverageRateList;
    }

    @Override
    public String toString() {
        return "CoverageRate{" +
                "id=" + id +
                ", rate=" + rate +
                ", coverage='" + coverage + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
