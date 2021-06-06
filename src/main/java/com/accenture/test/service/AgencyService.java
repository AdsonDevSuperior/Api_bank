package com.accenture.test.service;

import com.accenture.test.dto.message.MessageResponseDTO;
import com.accenture.test.entity.Agency;
import com.accenture.test.mappers.AgencyMapper;
import com.accenture.test.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgencyService {
    
    @Autowired
    private AgencyRepository agencyRepository;

    private final AgencyMapper agencyMapper = AgencyMapper.INSTANCE;

    public void createAgency(Agency agency) {
      agencyRepository.save(agency);
    }

    public List<Agency> listAll() {
        return agencyRepository.findAll();

    }

    private MessageResponseDTO createMessageResponse(long id, String message) {
        return MessageResponseDTO.builder()
                .message(message + id)
                .build();
    }


}
