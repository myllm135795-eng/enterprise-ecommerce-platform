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
public class PaymentCompletedEvent {
    private String paymentId;
    private String orderId;
    private String userId;
    private Double amount;
    private String paymentMethod;
    private String status;
    private LocalDateTime completedAt;
}
