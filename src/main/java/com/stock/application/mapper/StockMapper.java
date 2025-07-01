package com.stock.application.mapper;

import com.stock.application.dtos.response.StockDTO;
import com.stock.domain.model.Stock;
import com.stock.infrastructure.adapters.entities.StockEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockMapper {

    public Stock toDomainFromEntity(StockEntity stockEntity) {
        return Stock.builder()
                .id(stockEntity.getId())
                .skuCode(stockEntity.getSkuCode())
                .quantity(stockEntity.getQuantity())
                .build();
    }

    public StockDTO toDTOFromDomain(Stock stock) {
        return StockDTO.builder()
                .skuCode(stock.getSkuCode())
                .inStock(stock.getQuantity()> 0)
                .build();
    }

    public List<StockDTO> toDTOList(List<Stock> stockList) {
        return  stockList.stream()
                .map(this::toDTOFromDomain)
                .toList();
    }
}
