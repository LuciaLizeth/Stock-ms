package com.everis.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.examen.dto.SaveStockRequestDto;
import com.everis.examen.dto.SaveStockResponseDto;
import com.everis.examen.dto.StockDto;
import com.everis.examen.entity.Stock;
import com.everis.examen.exception.BusinessException;
import com.everis.examen.exception.ResourceNotFoundException;
import com.everis.examen.mapper.StockMapper;
import com.everis.examen.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping("stock/list")
	public List<StockDto> list(){
		return StockMapper.INSTANCE.map(stockService.listAll());
	}
	
	@PostMapping("stock/save")
	public SaveStockResponseDto save(@RequestBody SaveStockRequestDto saveStockRequestDto) throws BusinessException {
		return StockMapper.INSTANCE
				.toStockSaveResponseDto(stockService.save(StockMapper.INSTANCE.toEntity(saveStockRequestDto)));
	}
	
	@PostMapping("stock/save2")
	public Stock save2(@RequestBody Stock saveStockRequestDto) throws BusinessException {
		return stockService.save(saveStockRequestDto);
	}
}