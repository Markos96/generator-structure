package

com.ejemplo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pruebaEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

}