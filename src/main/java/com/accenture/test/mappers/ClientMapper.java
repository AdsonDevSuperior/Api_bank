package com.accenture.test.mappers;

import com.accenture.test.dto.users.ClientDTO;
import com.accenture.test.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client toModel(ClientDTO clientDTO);

    ClientDTO toDTO(Client client);

    }
