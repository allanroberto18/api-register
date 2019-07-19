package com.alr.apiregister.Infrastructure.Controllers;

import com.alr.apiregister.Applications.DTOs.CustomerDTOImpl;
import com.alr.apiregister.Applications.Interfaces.Actions.CustomerAction;
import com.alr.apiregister.Domain.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private CustomerAction customerAction;

  public CustomerController(@Autowired CustomerAction customerAction) {
    this.customerAction = customerAction;
  }

  @PostMapping("/")
  @ResponseBody
  public ResponseEntity addCustomer(@RequestBody CustomerDTOImpl dto) {
    Customer customer = this.customerAction.callServiceToCreateNewCustomer(dto);

    return new ResponseEntity(customer, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  @ResponseBody
  public ResponseEntity updateCustomer(@PathVariable(value = "id") Long id, @RequestBody CustomerDTOImpl dto) {
    Customer customer = this.customerAction.callServiceToUpdateCustomerById(id, dto);

    return new ResponseEntity(customer, HttpStatus.ACCEPTED);
  }

  @GetMapping("/{id}")
  @ResponseBody
  public ResponseEntity loadCustomer(@PathVariable(value = "id") Long id) {
    Optional<Customer> customer = this.customerAction.callServiceToLoadCustomerById(id);
    if (customer.isEmpty()) {
      return new ResponseEntity(null, HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity(customer.get(), HttpStatus.OK);
  }

  @GetMapping("/")
  @ResponseBody
  public ResponseEntity listCustomer() {
    Iterable<Customer> customers = this.customerAction.callServiceToListCustomers();

    return new ResponseEntity(customers, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity deleteCustomer(@PathVariable(value = "id") Long id) {
    this.customerAction.callServiceToRemoveCustomerById(id);

    return new ResponseEntity(null, HttpStatus.NO_CONTENT);
  }
}
