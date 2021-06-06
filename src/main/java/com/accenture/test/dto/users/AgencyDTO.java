package com.accenture.test.dto.users;

import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgencyDTO {

    private long id;


    private String name;

    private String address;


    private String agencyNumber;
}
