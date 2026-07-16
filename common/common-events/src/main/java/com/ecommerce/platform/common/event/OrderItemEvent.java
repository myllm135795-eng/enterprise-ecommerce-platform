package com.ecommerce.platform.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemEvent {
    private String productId;
    private Integer quantity;
    private Double unitPrice;
}
