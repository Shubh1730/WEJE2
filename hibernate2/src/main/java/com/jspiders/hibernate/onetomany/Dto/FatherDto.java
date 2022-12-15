package com.jspiders.hibernate.onetomany.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FatherDto {
@Id
  	private int id;
	private String name;
	private int age;
	
	@OneToMany
	private List<ChildDto> children;
}
