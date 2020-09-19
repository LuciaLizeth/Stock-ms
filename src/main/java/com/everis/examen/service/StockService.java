package com.everis.examen.service;

import java.util.List;

import com.everis.examen.entity.Stock;
import com.everis.examen.exception.BusinessException;
import com.everis.examen.exception.ResourceNotFoundException;

public interface StockService {
	
	public List<Stock> listAll();
	public Stock findById(Integer id) throws ResourceNotFoundException;
	public Stock save(Stock stocks) ;
	public List<Stock> saveCollection(List<Stock> stocks) throws BusinessException;
}