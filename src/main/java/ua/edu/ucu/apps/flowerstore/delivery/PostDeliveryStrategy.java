package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    public void deliver(List<Item> items){
        System.out.println("Delivering "+items.size()+" items via post delivery");
    }
}
