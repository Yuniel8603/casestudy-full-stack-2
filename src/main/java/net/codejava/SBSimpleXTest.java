package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={"net.codejava.user_module"})
@Configuration
public class SBSimpleXTest {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SBSimpleXTest.class, args);
    }
}
