package tacos.data.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tacos.data.entitys.Taco;

@RepositoryRestResource(path = "tacos")
public interface TacoRepository
        extends JpaRepository<Taco, Long> {
}
