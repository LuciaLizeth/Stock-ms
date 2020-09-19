package com.everis.examen.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDto {
	
	private Integer id;
	private Integer productId;
	private Integer wareHouseId;
	private Integer quantity;
	
}