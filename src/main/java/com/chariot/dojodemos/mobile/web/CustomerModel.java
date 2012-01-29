package com.chariot.dojodemos.mobile.web;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

import java.math.BigDecimal;
import java.util.Date;

@RooJson
@RooToString
@RooJavaBean 
public class CustomerModel {
  
  private String firstName;
  
  private String lastName;

  private int age;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date birthDate;

  @NumberFormat(style = NumberFormat.Style.CURRENCY)
  private BigDecimal salary;

}
