package com.ntt.nttsocialmedia.db;

import com.ntt.nttsocialmedia.beans.Employee;
import com.ntt.nttsocialmedia.beans.Image;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author leetHuam
 * @version 1.0
 */
@Component
public class InitDatabase {
    @Bean
    CommandLineRunner init(MongoOperations operations) {
        return args -> {
            operations.dropCollection(Image.class);
            operations.insert(new Image("1",
                    "learning-spring-boot-cover.jpg"));
            operations.insert(new Image("2",
                    "learning-spring-boot-2nd-edition-cover.jpg"));
            operations.insert(new Image("3",
                    "bazinga.png"));
            operations.findAll(Image.class).forEach(image -> {
                System.out.println(image.toString());
            });
            operations.dropCollection(Employee.class);
            Employee employee1 = new Employee();
            employee1.setId(UUID.randomUUID().toString());
            employee1.setFirstName("Bilbo");
            employee1.setLastName("Baggins");
            employee1.setRole("burglar");
            operations.insert(employee1);
            Employee employee2 = new Employee();
            employee2.setId(UUID.randomUUID().toString());
            employee2.setFirstName("Frodo");
            employee2.setLastName("Baggins");
            employee2.setRole("ring bearer");
            operations.insert(employee2);
            operations.findAll(Employee.class).forEach(employee -> {
                System.out.println(employee.toString());
            });
        };
    }
}
