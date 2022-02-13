package com.openapispecification.api.service.impl;

import com.openapispecification.api.model.Corporation;
import com.openapispecification.api.repository.CorporationRepository;
import com.openapispecification.api.service.api.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CorporationServiceImpl implements CorporationService {

    @Autowired
    CorporationRepository corporationRepository;

    @Override
    public Corporation save(Corporation corporation) throws Exception{
        if (corporation == null || ObjectUtils.isEmpty(corporation.getName()))
            throw new Exception("Object cannot be null");

        Corporation corporationFromDatabase = corporationRepository.findByName(corporation.getName());

        if (corporationFromDatabase != null) {
            throw new Exception("Object already exists");
        }

        return corporationRepository.save(corporation);
    }
}
