package com.stock.domain.repositories;

import com.stock.domain.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockRepository {

    List<Stock> findBySkuCode(List<String> codeSku);
}
