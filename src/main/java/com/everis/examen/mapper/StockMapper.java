package com.everis.examen.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.everis.examen.dto.SaveStockRequestDto;
import com.everis.examen.dto.SaveStockResponseDto;
import com.everis.examen.dto.StockDto;
import com.everis.examen.entity.Stock;

@Mapper(componentModel = "spring")
public interface StockMapper {
	
	StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);
	
	public StockDto map(Stock stock);
	public List<StockDto> map(List<Stock> stocks);
	
	public Stock toEntity(SaveStockRequestDto saveStockRequestDto);
	public SaveStockResponseDto toStockSaveResponseDto(Stock stock);
}