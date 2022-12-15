package com.jspiders.hibernate.Onetoone.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WifeDto {

@Id
 private int id;
 private String name;
 private String email;
 private int age;
 private long contact;
}
