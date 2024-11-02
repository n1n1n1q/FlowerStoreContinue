package ua.edu.ucu.apps.flowerstore.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    private String description;
    public DHLDeliveryStrategy() {
        this.description = "DHL delivery";
    }
    public void deliver(List<Item> items){
        System.out.println("Delivering "+items.size()+" items via DHL");
    }

    public String getDescription() {
        return description;
    }
}
