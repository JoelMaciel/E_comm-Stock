package com.stock.application.adpaters;

import com.stock.application.ports.usecase.StockUseCase;
import com.stock.domain.model.Stock;
import com.stock.domain.repositories.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockUseCaseImpl implements StockUseCase {

    private final StockRepository stockRepository;

    @Override
    public List<Stock> execute(List<String> skuCode) {
        return stockRepository.findBySkuCode(skuCode);
    }
}
