package com.stock.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
public class Stock {

    private UUID id;
    private String skuCode;
    private Integer quantity;
}
