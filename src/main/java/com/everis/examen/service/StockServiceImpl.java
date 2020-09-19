package com.everis.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.examen.entity.Stock;
import com.everis.examen.exception.BusinessException;
import com.everis.examen.exception.ResourceNotFoundException;
import com.everis.examen.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> listAll() {
		return (List<Stock>) stockRepository.findAll();
	}
	
	@Override
	public Stock findById(Integer id) throws ResourceNotFoundException {
		return stockRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
	}
	
	@Override
	public Stock save(Stock stock){
		return stockRepository.save(stock);
	}
	
	@Override
	public List<Stock> saveCollection(List<Stock> stocks) throws BusinessException {
		for (Stock stock : stocks) {
			if(stock.getQuantity() == 0) {
				throw new BusinessException("Quantity of product cannot be 0");
			}
			else if (stock.getQuantity() < 0) {
				throw new BusinessException("Quantity of product cannot be less than 0");
			}
			stockRepository.save(stock);
		}
		return stocks;
	}
	
}