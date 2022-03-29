package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockQuote;

@Repository
public interface StockQuoteRepository extends JpaRepository<StockQuote, Long> {

}
