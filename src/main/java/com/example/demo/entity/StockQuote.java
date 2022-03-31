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
@Table(name = "stock_quote")
public class StockQuote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_id")
	private Long id;
	@Column(name = "stock_code")
	private String code;
	@Column(name = "unit_price")
	private Double unitPrice;
	@Column(name = "date_time")
	private Date dateTime;
}
