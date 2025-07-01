package com.stock.domain.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ProductNotInStockException extends EntityNotFoundException {

    public ProductNotInStockException() {
        super("Product not in stock");
    }
}
