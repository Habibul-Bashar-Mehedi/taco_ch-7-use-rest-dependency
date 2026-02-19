package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.User;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user,Pageable pageable);
}
