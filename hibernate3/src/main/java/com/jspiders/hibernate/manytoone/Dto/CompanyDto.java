package com.jspiders.hibernate.manytoone.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CompanyDto {
@Id
  private int id;
  private String name;
  private String city;
  
}
