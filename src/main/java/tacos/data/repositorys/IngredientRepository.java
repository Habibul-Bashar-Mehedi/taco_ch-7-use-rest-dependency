package tacos.data.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import tacos.data.entitys.Ingredient;

@CrossOrigin(origins="http://tacocloud:8080")
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
