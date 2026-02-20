package tacos.web.api;

import org.springframework.web.bind.annotation.*;
import tacos.data.entitys.Ingredient;
import tacos.data.entitys.TacoOrder;
import tacos.data.repositorys.IngredientRepository;

@RestController
@RequestMapping(path = "/api/ingredients", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class IngredientController {
    private IngredientRepository ingredientRepo;

    public IngredientController(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @GetMapping(produces = "application/json")
    public Iterable<Ingredient> allIngredients() {
        return ingredientRepo.findAll();
    }



}
