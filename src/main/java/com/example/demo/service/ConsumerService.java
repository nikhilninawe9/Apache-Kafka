package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.store.MessageStore;
import com.example.demo.util.JsonUtil;

@Component
public class ConsumerService {
	@Autowired
	private MessageStore store;
	@Autowired
	private JsonUtil jsonUtil;

	@KafkaListener(topics = "${my.topic.name}")
	public void readData(String message) {
		StockQuote quote = jsonUtil.fromJson(message);
		store.create(quote);
	}
}
