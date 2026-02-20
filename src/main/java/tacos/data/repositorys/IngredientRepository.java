package tacos.data.repositorys;

import org.springframework.data.repository.CrudRepository;
import tacos.data.entitys.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
