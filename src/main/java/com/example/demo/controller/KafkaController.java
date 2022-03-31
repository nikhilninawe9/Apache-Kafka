package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StockQuote;
import com.example.demo.service.ProducerService;
import com.example.demo.store.MessageStore;

@RestController
public class KafkaController {
	@Autowired
	private MessageStore store;
	@Autowired
	private ProducerService producerService;

	/* Send data */
	@GetMapping("/send")
	public ResponseEntity<String> send(@RequestParam String code, @RequestParam Double up) {
		StockQuote quote = new StockQuote();
		quote.setCode(code);
		quote.setUnitPrice(up);
		quote.setDateTime(new Date());
		producerService.sendData(quote);
		return ResponseEntity.ok("Data is sent!..");
	}
}
