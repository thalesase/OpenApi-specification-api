package com.openapispecification.api.controller;

import com.openapispecification.api.model.Corporation;
import com.openapispecification.api.service.api.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CorporationController {

    @Autowired
    CorporationService corporationService;

    @RequestMapping(value = "/corporation", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResponseEntity<Corporation> helloWorld(@RequestBody Corporation corporation) {
        try {
            return ResponseEntity.ok().body(corporationService.save(corporation));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
