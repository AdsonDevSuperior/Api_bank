package com.accenture.test.controller;


import com.accenture.test.dto.users.AgencyDTO;
import com.accenture.test.entity.Agency;
import com.accenture.test.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agency")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAgency(@RequestBody Agency agency) {
        agencyService.createAgency(agency);
   }

   @GetMapping
    public List<Agency> listAll() {
        return agencyService.listAll();
   }


    }

