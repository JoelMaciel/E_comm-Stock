package com.stock.application.ports.usecase;

import com.stock.domain.model.Stock;

import java.util.List;

public interface StockUseCase {

    List<Stock> execute(List<String> skuCode);
}
