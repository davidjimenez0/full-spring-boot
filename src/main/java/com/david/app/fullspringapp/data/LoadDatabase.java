package com.david.app.fullspringapp.data;

import com.david.app.fullspringapp.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    private static Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            logger.info("Preloading " + repository.save(new Employee("David the J", "burglar")));
            logger.info("Preloading " + repository.save(new Employee("Meow the cat", "thief")));
        };
    }
}
