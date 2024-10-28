package ua.edu.ucu.apps.flowerstore.flower;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor
@Entity
@Table
public class Flower {
    @Id
    private Long id;
    private String color;
    private int sepalLength;
    private double price;
    private FlowerType type;

    public Flower(String blue, int i, int i1, FlowerType flowerType) {
    }
}
