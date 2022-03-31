package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.util.JsonUtil;

@Component
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, String> template;

	@Value("${my.topic.name}")
	private String destination;

	private JsonUtil jsonUtil;

	public void sendData(StockQuote quote) {
		String data = jsonUtil.toJson(quote);
		template.send(destination, data);
	}
}
