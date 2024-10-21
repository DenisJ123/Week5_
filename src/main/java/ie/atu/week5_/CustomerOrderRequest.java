package ie.atu.week5_;


import lombok.Data;
import java.util.List;

@Data
public class CustomerOrderRequest {
    private Customer customer;
    private List<Order> orders;
}

