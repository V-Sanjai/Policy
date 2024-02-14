package com.example.policyadministartivesystem.controller;

import com.example.policyadministartivesystem.entity.CoverageDetails;
import com.example.policyadministartivesystem.entity.CoverageRate;
import com.example.policyadministartivesystem.entity.PolicyDetails;
import com.example.policyadministartivesystem.entity.PolicyHolderLocation;
import com.example.policyadministartivesystem.services.CoverageDetailsServiceImple;
import com.example.policyadministartivesystem.services.CoverageRateServiceImple;
import com.example.policyadministartivesystem.services.PolicyDetailsServiceImple;
import com.example.policyadministartivesystem.services.PolicyHolderLocationServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/policy")
public class PolicyDetailsController {

    @Autowired
    private PolicyDetailsServiceImple policyDetailsServiceImple;
    @Autowired
    private PolicyHolderLocationServiceImple policyHolderLocationServiceImple;
    @Autowired
    private CoverageDetailsServiceImple coverageDetailsServiceImple;
    @Autowired
    private CoverageRateServiceImple coverageRateServiceImple;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("addholder")
    public String addholder(Model model) {
        model.addAttribute("details", new PolicyDetails());
        model.addAttribute("locations", policyHolderLocationServiceImple.getalllocation());
        model.addAttribute("coverages", coverageDetailsServiceImple.getallcoveragedetails());
        model.addAttribute("amounts", coverageRateServiceImple.getallcoveragerate());
        return "addholder";
    }


    @PostMapping("/submit")
    public String submit(@ModelAttribute("details") PolicyDetails policyDetails, @RequestParam("locations") List<Integer> id, @RequestParam("coverages") List<Integer> cid, @RequestParam("amounts") List<Integer> rid) {

        List<CoverageDetails> coverageDetails = new ArrayList<>();
        for (Integer coverageId : cid) {
            CoverageDetails details = coverageDetailsServiceImple.findbyid(coverageId);
            coverageDetails.add(details);
        }
        policyDetails.setCoverageDetails(coverageDetails);


        List<PolicyHolderLocation> locations = new ArrayList<>();
        for (Integer locationId : id) {
            PolicyHolderLocation location = policyHolderLocationServiceImple.findbyid(locationId);
            locations.add(location);
        }
        policyDetails.setPolicyHolderLocations(locations);


        List<CoverageRate> coverageRates = new ArrayList<>();
        for (Integer rateId : rid) {
            CoverageRate coverageRate = coverageRateServiceImple.findbyid(rateId);
            coverageRates.add(coverageRate);
        }
        policyDetails.setCoverageRates(coverageRates);


        policyDetailsServiceImple.add(policyDetails);
        return "list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<PolicyDetails> policyDetailsList = policyDetailsServiceImple.getall();
        model.addAttribute("details", policyDetailsList);
        return "list";
    }


}
