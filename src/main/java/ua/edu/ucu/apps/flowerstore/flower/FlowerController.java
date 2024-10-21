package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlowerController {
    @GetMapping("/flower")
    public List<Flower> helloWorld() {
        return List.of(new Flower("blue", 3, 3, FlowerType.ROSE));
    }
}
