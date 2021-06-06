package com.accenture.test.mappers;

import com.accenture.test.dto.users.CurrentAccountDTO;
import com.accenture.test.entity.CurrentAccount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CurrentAccountMapper {

    CurrentAccountMapper currentAccountMapper = Mappers.getMapper(CurrentAccountMapper.class);

    CurrentAccount toModel(CurrentAccountDTO currentaccountDTO);

    CurrentAccountDTO toDTO(CurrentAccount currentAccount);

}
