package com.ntt.nttsocialmedia.repositories;

import com.ntt.nttsocialmedia.beans.Employee;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long>, ReactiveQueryByExampleExecutor {
//    Flux<Employee> findByFirstName(Mono<String> name);
//    ArrayList<Integer> arrayList = new ArrayList<>();
}
