package Structural.Adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private String name;
    private String phone;
    private String email;
    private int amount;

}
