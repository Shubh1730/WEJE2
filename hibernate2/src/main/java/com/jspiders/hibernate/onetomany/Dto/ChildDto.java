package com.jspiders.hibernate.onetomany.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ChildDto {

	@Id
	private int id;
	private String name;
	private int age;
}
