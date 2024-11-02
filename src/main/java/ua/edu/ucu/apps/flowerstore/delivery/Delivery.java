package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.flower.Item;

public interface Delivery {
    public void deliver(List<Item> items);
    String getDescription();
}
