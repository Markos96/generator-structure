package

{{packageName}}.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class {{className}}Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}