package io.microprofile.tutorial.store.order.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

/**
 * Order class for the microprofile tutorial store application.
 * This class represents an order in the system with its details.
 */
@Data
// @NoArgsConstructor
// @AllArgsConstructor
@Builder
public class Order {

    private Long orderId;

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Total price cannot be null")
    @Min(value = 0, message = "Total price must be greater than or equal to 0")
    private BigDecimal totalPrice;

    @NotNull(message = "Status cannot be null")
    private OrderStatus status;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;
    
    @Builder.Default
    private List<OrderItem> orderItems = new ArrayList<>();

    
	public Order() {}
    
	public Order(Long orderId, @NotNull(message = "User ID cannot be null") Long userId,
			@NotNull(message = "Total price cannot be null") @Min(value = 0, message = "Total price must be greater than or equal to 0") BigDecimal totalPrice,
			@NotNull(message = "Status cannot be null") OrderStatus status, LocalDateTime createdAt,
			LocalDateTime updatedAt, List<OrderItem> orderItems) {
		this.orderId = orderId;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.orderItems = orderItems;
	}
	
}
