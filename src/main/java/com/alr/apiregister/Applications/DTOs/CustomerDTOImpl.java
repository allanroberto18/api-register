package com.alr.apiregister.Applications.DTOs;

import com.alr.apiregister.Applications.Interfaces.DTOs.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;

@Getter
@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDTOImpl implements CustomerDTO {

  private String firstName;
  private String lastName;
  private String email;

  private CustomerDTOImpl(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public static CustomerDTOImpl mountObjectToPersist(String firstName, String lastName, String email) {
    return new CustomerDTOImpl(firstName, lastName, email);
  }
}
