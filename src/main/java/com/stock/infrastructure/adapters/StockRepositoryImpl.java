package com.stock.infrastructure.adapters;

import com.stock.application.mapper.StockMapper;
import com.stock.domain.model.Stock;
import com.stock.domain.repositories.StockRepository;
import com.stock.infrastructure.adapters.jpa.StockJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StockRepositoryImpl implements StockRepository {

    private final StockJpaRepository stockJpaRepository;

    private final StockMapper stockMapper;

    @Override
    public List<Stock> findBySkuCode(List<String> codeSku) {
        return stockJpaRepository.findBySkuCodeIn(codeSku).stream()
                .filter(stockEntity -> stockEntity.getQuantity() > 0)
                .map(stockMapper::toDomainFromEntity)
                .toList();

    }
}
