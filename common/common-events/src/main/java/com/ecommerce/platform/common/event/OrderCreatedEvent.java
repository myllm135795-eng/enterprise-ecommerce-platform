package com.ecommerce.platform.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private String orderId;
    private String userId;
    private Double totalAmount;
    private String status;
    private LocalDateTime createdAt;
    private java.util.List<OrderItemEvent> items;
}
