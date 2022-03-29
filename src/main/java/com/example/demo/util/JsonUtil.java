package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonUtil {
	public String toJson(StockQuote quote) {
		try {
			return new ObjectMapper().writeValueAsString(quote);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public StockQuote fromJson(String json) {
		try {
			return new ObjectMapper().readValue(json, StockQuote.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
