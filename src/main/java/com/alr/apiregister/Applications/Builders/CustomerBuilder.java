package com.alr.apiregister.Applications.Builders;

import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.alr.apiregister.Domain.Models.Customer;

public class CustomerBuilder {

  /**
   * @param dto CustomerDTO
   * @return Customer
   */
  public static Customer mountCustomerFromDTOToCreateNew(CustomerDTO dto) {
    Customer model = new Customer();

    model.setFistName(dto.getFirstName());
    model.setLastName(dto.getLastName());
    model.setEmail(dto.getEmail());

    return model;
  }
}
