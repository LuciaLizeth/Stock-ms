package com.everis.examen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "stock_table")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "PRODUCTID")
	private Integer productId;
	
	@Column(name = "WAREHOUSEID")
	private Integer wareHouseId;
	
	@Column(name = "QUANTITY")
	private Integer quantity;
}