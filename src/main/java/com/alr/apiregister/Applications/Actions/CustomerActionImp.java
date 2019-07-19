package com.alr.apiregister.Applications.Actions;

import com.alr.apiregister.Applications.Interfaces.Actions.CustomerAction;
import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.alr.apiregister.Domain.Interfaces.Services.CustomerService;
import com.alr.apiregister.Domain.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerActionImp implements CustomerAction {

  private CustomerService customerService;

  public CustomerActionImp(@Autowired CustomerService customerService) {
    this.customerService = customerService;
  }

  @Override
  public Customer callServiceToCreateNewCustomer(CustomerDTO dto) {
    return this.customerService.addNewCustomer(dto);
  }

  @Override
  public Customer callServiceToUpdateCustomerById(Long id, CustomerDTO dto) {
    return this.customerService.updateCustomerById(id, dto);
  }

  @Override
  public Optional<Customer> callServiceToLoadCustomerById(Long id) {
    return this.customerService.loadCustomerById(id);
  }

  @Override
  public Iterable<Customer> callServiceToListCustomers() {
    return this.customerService.listCustomers();
  }

  @Override
  public void callServiceToRemoveCustomerById(Long id) {
    this.customerService.deleteCustomerById(id);
  }
}
