package com.arjun.stockprice.application.mapper;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.arjun.stockprice.application.dto.StockPriceDto;
import com.arjun.stockprice.application.model.StockPrice;

@Component
public class StockPriceMapper 
{
	public StockPriceDto toStockPriceDto(StockPrice stockPrice)
	{
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		StockPriceDto stockPriceDto = mapper.map(stockPrice, StockPriceDto.class);
		return stockPriceDto;
	}
	
	public StockPrice toStockPrice(StockPriceDto stockPriceDto)
	{
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		StockPrice stockPrice = mapper.map(stockPriceDto, StockPrice.class);
		return stockPrice;
	}
	
	public List<StockPriceDto> toStockPriceDtos(List<StockPrice> stockPrices)
	{
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<StockPriceDto> stockPriceDtos = Arrays.asList(mapper.map(stockPrices, StockPriceDto[].class));
		return stockPriceDtos;
	}
	
	public List<StockPrice> toStockPrices(List<StockPriceDto> stockPriceDtos)
	{
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<StockPrice> stockPrices = Arrays.asList(mapper.map(stockPriceDtos, StockPrice[].class));
		return stockPrices;
	}
}
