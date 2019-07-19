package com.alr.apiregister.Applications.Interfaces.Actions;

import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.alr.apiregister.Domain.Models.Customer;

import java.util.Optional;

public interface CustomerAction {

  /**
   * @param dto
   * @return Customer
   */
  Customer callServiceToCreateNewCustomer(CustomerDTO dto);

  /**
   * @param id Long
   * @param dto CustomerDTO
   * @return Optional<Customer>
   */
  Customer callServiceToUpdateCustomerById(Long id, CustomerDTO dto);

  /**
   * @param id Long
   * @return Optional<Customer>
   */
  Optional<Customer> callServiceToLoadCustomerById(Long id);

  /**
   * @return Iterable<Customer>
   */
  Iterable<Customer> callServiceToListCustomers();

  /**
   * @param id Long
   */
  void callServiceToRemoveCustomerById(Long id);
}
