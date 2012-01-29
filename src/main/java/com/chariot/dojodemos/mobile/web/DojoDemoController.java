package com.chariot.dojodemos.mobile.web;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

@RequestMapping("/dojodemo")
@Controller
public class DojoDemoController {

  private static final String TAX_AMOUNT = "0.06";

  @RequestMapping(method = RequestMethod.GET)
  public String index() {
    return "dojodemo/index";
  }

  @RequestMapping(value = "/generateCustomer", method = RequestMethod.POST)
  @ResponseBody
  String generateCustomer() {

    CustomerModel customer = new CustomerModel();
    customer.setFirstName("Joe");
    customer.setLastName("Fred");
    customer.setAge(0);
    customer.setBirthDate(new Date());
    customer.setSalary(new BigDecimal("23333.05"));
    return customer.toJson();
  }

  @RequestMapping(value = "/calculateTax", method = RequestMethod.GET)
  @ResponseBody
  String calculateTax(
      @RequestBody String customerJson) {

    CustomerModel customer = CustomerModel.fromJsonToCustomerModel(customerJson);

    Date birthDate = customer.getBirthDate();

    DateTime dateTime = new DateTime(birthDate);
    Years age = Years.yearsBetween(dateTime, new DateTime(new Date()));
    customer.setAge(age.getYears());

    return customer.toJson();
  }
}
