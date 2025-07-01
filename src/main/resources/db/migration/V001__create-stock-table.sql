CREATE TABLE stock (
    id CHAR(36) PRIMARY KEY DEFAULT (UUID()),
    sku_code VARCHAR(60) ,
    quantity INT
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
