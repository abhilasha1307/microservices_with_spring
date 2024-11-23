package com.example.accounts.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "accounts")
@Component
@Getter
@Setter
@NoArgsConstructor
public class AccountsContactInfo {
    private String buildVersion;
    private String message;
    private String contactDetailsName;
    private String contactDetailsEmail;
    private String onCallSupport;
}

