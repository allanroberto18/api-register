package com.alr.apiregister.Domain.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@RequiredArgsConstructor
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "firstName", length = 125, nullable = false)
  @NotEmpty(message = "First name may not be empty")
  @Size(min = 2, max = 125, message = "Name must be between 2 and 125 characters long")
  private String fistName;

  @NotEmpty(message = "Last name may not be empty")
  @Size(min = 2, max = 125, message = "Name must be between 2 and 125 characters long")
  private String lastName;

  @Email(message = "Email invalid")
  @NotEmpty(message = "Email may not be empty")
  private String email;
}
