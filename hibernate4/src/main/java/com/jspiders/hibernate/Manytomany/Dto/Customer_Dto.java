package com.jspiders.hibernate.Manytomany.Dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="customer_details")
public class Customer_Dto {
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="customer_name")
	private String name;
	@Column(name="customer_email")
	private String email;
	@Column(name="customer_cont")
	private long cont;
	
	@ManyToMany
	@JoinTable(name="customers_products",
						joinColumns = @JoinColumn(referencedColumnName = "customer_id"),
						inverseJoinColumns = @JoinColumn(referencedColumnName = "product_id"))
	private List<Product_Dto> products;
	

}
