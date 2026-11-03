package io.microprofile.tutorial.store.payment.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate; // Format MM/YY
    private String securityCode;
    private BigDecimal amount;
    
}
