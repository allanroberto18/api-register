package com.alr.apiregister.Infrastructure.Controllers;

import com.alr.apiregister.Application.Requests.CustomerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @PostMapping("/")
  @ResponseBody
  public ResponseEntity addCustomer(@RequestBody CustomerRequest request) {
    return new ResponseEntity(request, HttpStatus.CREATED);
  }
}
