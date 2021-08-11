package com.gerard.gpetclinic.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(TestConfig.class)
@Configuration
public class PetClinicConfig {
}
