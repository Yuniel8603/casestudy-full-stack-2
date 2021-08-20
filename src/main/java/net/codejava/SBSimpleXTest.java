package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"net.codejava.user_module"})
@Configuration
@EnableJpaRepositories
public class SBSimpleXTest {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SBSimpleXTest.class, args);
    }
}
