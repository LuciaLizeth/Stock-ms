package com.everis.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.examen.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer>{
	
	public Stock findByProductId(Integer productId);
	
}