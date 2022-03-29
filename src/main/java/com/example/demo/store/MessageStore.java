package com.example.demo.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.repository.StockQuoteRepository;

@Component
public class MessageStore {
	@Autowired
	private StockQuoteRepository stockRepository;

	public void create(StockQuote quote) {
		stockRepository.save(quote);
	}

	public List<StockQuote> fetchAll() {
		return stockRepository.findAll();
	}
}
