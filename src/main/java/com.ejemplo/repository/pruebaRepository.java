package

com.ejemplo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ejemplo.entity.pruebaEntity;

@Repository
public interface pruebaRepository extends JpaRepository<pruebaEntity,Integer>{

        }
