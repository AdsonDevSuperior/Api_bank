package com.accenture.test.mappers;


import com.accenture.test.dto.users.AgencyDTO;
import com.accenture.test.entity.Agency;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AgencyMapper {

    AgencyMapper INSTANCE = Mappers.getMapper(AgencyMapper.class);

    Agency toModel(AgencyDTO agencyDTO);

    AgencyDTO toDTO(Agency agency);

}
