package com.ms.email.dtos;

import java.util.UUID;


public record EmailRecordDto(UUID UserId,
                             String emailTo,
                             String subject,
                             String text) {

}
