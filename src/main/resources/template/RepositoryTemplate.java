package

{{packageName}}.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import {{packageName}}.entity.{{className}}Entity;

@Repository
public interface {{className}}Repository extends JpaRepository<{{className}}Entity,Integer>{

        }
