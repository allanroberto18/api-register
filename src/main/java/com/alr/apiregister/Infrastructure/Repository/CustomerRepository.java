package com.alr.apiregister.Infrastructure.Repository;

import com.alr.apiregister.Domain.Models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
