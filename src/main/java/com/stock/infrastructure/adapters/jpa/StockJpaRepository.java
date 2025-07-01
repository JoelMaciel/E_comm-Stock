package com.stock.infrastructure.adapters.jpa;

import com.stock.infrastructure.adapters.entities.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StockJpaRepository extends JpaRepository<StockEntity, UUID> {

    List<StockEntity> findBySkuCodeIn(List<String> skuCode);
}
