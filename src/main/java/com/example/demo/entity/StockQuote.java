package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "stock-quote")
public class StockQuote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock-id")
	private Long id;
	@Column(name = "stock-code")
	private String code;
	@Column(name = "unit-price")
	private Double unitPrice;
	@Column(name = "date-time")
	private Date dateTime;
}
