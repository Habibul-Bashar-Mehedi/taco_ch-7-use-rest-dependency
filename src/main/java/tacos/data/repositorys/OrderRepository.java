package tacos.data.repositorys;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.User;
import tacos.data.entitys.TacoOrder;


public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);

}
