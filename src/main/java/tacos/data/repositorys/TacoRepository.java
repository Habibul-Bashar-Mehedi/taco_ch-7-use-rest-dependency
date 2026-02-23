package tacos.data.repositorys;

import tacos.data.entitys.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {

}
