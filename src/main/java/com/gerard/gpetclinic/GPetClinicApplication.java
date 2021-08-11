package com.gerard.gpetclinic;

import com.gerard.gpetclinic.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(GPetClinicApplication.class, args);

        TestConfig testConfig = ctx.getBean(TestConfig.class);
        System.out.println("GPetClinicApplication ------");
        System.out.println("TestConfig value1");
        System.out.println(testConfig.getValue1());
        System.out.println("TestConfig value2");
        System.out.println(testConfig.getValue2());
    }

}
