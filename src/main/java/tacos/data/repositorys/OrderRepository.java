package tacos.data.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tacos.User;

import org.springframework.data.domain.Pageable;
import tacos.data.entitys.TacoOrder;

import java.util.List;

@RepositoryRestResource(path = "orders")
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user,Pageable pageable);
}
