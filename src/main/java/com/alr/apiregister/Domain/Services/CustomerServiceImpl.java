package com.alr.apiregister.Domain.Services;

import com.alr.apiregister.Applications.Builders.CustomerBuilder;
import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.alr.apiregister.Domain.Interfaces.Services.CustomerService;
import com.alr.apiregister.Domain.Models.Customer;
import com.alr.apiregister.Infrastructure.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

@Component
public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository;

  public CustomerServiceImpl(
      @Autowired CustomerRepository customerRepository
  ) {
    this.customerRepository = customerRepository;
  }

  @Override
  public Customer addNewCustomer(CustomerDTO dto) {
    Customer customer = new Customer();

    customer.setFistName(dto.getFirstName());
    customer.setLastName(dto.getLastName());
    customer.setEmail(dto.getEmail());

    return this.customerRepository.save(customer);
  }

  @Override
  public Customer updateCustomerById(Long id, CustomerDTO dto) {
    Optional<Customer> optCustomer = this.loadCustomerById(id);
    if (optCustomer.isEmpty()) {
      return addNewCustomer(dto);
    }

    Customer customer = optCustomer.get();
    customer.setFistName(dto.getFirstName());
    customer.setLastName(dto.getLastName());
    customer.setEmail(dto.getEmail());

    return this.customerRepository.save(customer);
  }

  @Override
  public Optional<Customer> loadCustomerById(Long id) {
    return this.customerRepository.findById(id);
  }

  @Override
  public Iterable<Customer> listCustomers() {
    return this.customerRepository.findAll();
  }

  @Override
  public void deleteCustomerById(Long id) {
    Optional<Customer> optCustomer = this.loadCustomerById(id);
    if (optCustomer.isEmpty() == false) {
      this.customerRepository.delete(optCustomer.get());
    }
  }
}
