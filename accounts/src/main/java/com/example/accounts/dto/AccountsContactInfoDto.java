package com.example.accounts.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountsContactInfoDto {
    private String buildVersion;
    private String message;
    private String contactDetailsName;
    private String contactDetailsEmail;
    private String onCallSupport;
}

