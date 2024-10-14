package com.abdtouirsi.customerservice.dao.repository;

import com.abdtouirsi.customerservice.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
