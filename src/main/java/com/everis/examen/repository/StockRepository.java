package com.everis.examen.repository;

import org.springframework.data.repository.CrudRepository;

import com.everis.examen.entity.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer>{

}