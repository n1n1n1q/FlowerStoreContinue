package ua.edu.ucu.apps.flowerstore.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor
public class Flower {
    private String color;
    private int sepalLength;
    private double price;
    private FlowerType type;
}
