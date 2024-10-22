package ua.edu.ucu.apps.flowerstore.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor
public class Flower extends Item{
    private String color;
    private int sepalLength;
    private double price;
    private FlowerType type;
    public Flower() {
        sepalLength = 0;
        price = 0;
    }
    public Flower(Flower flower) {
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }
    public String getColor() {
        return color.toString();
    }

}
