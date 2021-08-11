package com.gerard.gpetclinic.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("g.petclinic")
@Getter
public class TestConfig {
    private final String value1;
    private final String value2;

    public TestConfig(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
