package ru.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AddOrderRequest {
    private UUID productId;
    private UUID customerId;
    private int count;
}
