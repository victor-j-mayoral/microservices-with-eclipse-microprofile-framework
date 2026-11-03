package io.microprofile.tutorial.store.payment.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @AllArgsConstructor
// @NoArgsConstructor
public class PaymentDetails {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate; // Format MM/YY
    private String securityCode;
    private BigDecimal amount;
    
    
    public PaymentDetails() {}
    
	public PaymentDetails(String cardNumber, String cardHolderName, String expiryDate, String securityCode,
			BigDecimal amount) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.securityCode = securityCode;
		this.amount = amount;
	}    
    
}
