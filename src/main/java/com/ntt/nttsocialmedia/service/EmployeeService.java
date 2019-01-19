package com.ntt.nttsocialmedia.service;

import com.ntt.nttsocialmedia.beans.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import static org.springframework.data.mongodb.core.query.Criteria.byExample;

/**
 * @author leetHuam
 * @version 1.0
 */
@Service
public class EmployeeService {
    private ReactiveMongoOperations reactiveMongoOperations;

    public EmployeeService(ReactiveMongoOperations reactiveMongoOperations) {
        this.reactiveMongoOperations = reactiveMongoOperations;
    }

    public Mono<Employee> findOne(String args) {
        Employee employee = new Employee();
        employee.setFirstName("Bilbo");
        Example<Employee> example = Example.of(employee);
        return reactiveMongoOperations.findOne(new Query(byExample(employee)), Employee.class);
    }

    public Flux<Employee> findAll() {
        Employee employee = new Employee();
        employee.setLastName("baggins");
        ExampleMatcher mather = ExampleMatcher.matching().withIgnoreCase().withMatcher("lastName", startsWith()).withIncludeNullValues();
        Example<Employee> example = Example.of(employee);
        return reactiveMongoOperations.find(new Query(byExample(example)), Employee.class);
    }
}
