package com.alr.apiregister.Application.Requests;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CustomerRequest {
  private String firstName;
  private String lastName;
  private String email;
}
