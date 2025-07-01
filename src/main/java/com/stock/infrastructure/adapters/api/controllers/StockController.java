package com.stock.infrastructure.adapters.api.controllers;

import com.stock.application.dtos.response.StockDTO;
import com.stock.application.mapper.StockMapper;
import com.stock.application.ports.usecase.StockUseCase;
import com.stock.domain.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/stock")
public class StockController {

    private final StockUseCase stockUseCase;
    private final StockMapper mapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StockDTO>  isInStock(@RequestParam List<String> skuCode) {
        List<Stock> stockList = stockUseCase.execute(skuCode);
        return mapper.toDTOList(stockList);
    }
}
