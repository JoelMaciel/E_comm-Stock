package com.stock.application.dtos.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StockDTO {

    private String skuCode;
    private boolean inStock;
}
