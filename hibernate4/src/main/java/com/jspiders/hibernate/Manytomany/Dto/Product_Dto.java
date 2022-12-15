package com.jspiders.hibernate.Manytomany.Dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="product_details")
public class Product_Dto {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="product_name")
	private String name;
	@Column(name="product_price")
	private double price;
	@Column(name="product_category")
	private String category;
	
	@ManyToMany(mappedBy = "products")
	private List<Customer_Dto> customers;
	

}
