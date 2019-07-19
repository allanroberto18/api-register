package com.alr.apiregister.Domain.Interfaces.Services;

import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.alr.apiregister.Domain.Models.Customer;

import java.util.Optional;

public interface CustomerService {

  /**
   * @param dto CustomerDTO
   * @return Customer
   */
  Customer addNewCustomer(CustomerDTO dto);

  /**
   * @param id Long
   * @param dto Customer
   * @return Customer
   */
  Customer updateCustomerById(Long id, CustomerDTO dto);

  /**
   * @param id Long
   * @return Optional<Customer>
   */
  Optional<Customer> loadCustomerById(Long id);

  /**
   * @return Iterable<Customer>
   */
  Iterable<Customer> listCustomers();

  /**
   * @param id Long
   */
  void deleteCustomerById(Long id);
}
