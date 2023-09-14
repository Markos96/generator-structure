package

com.ejemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplo.repository.pruebaRepository;

@Service
public class pruebaService{

private pruebaRepository pruebaRepository;

@Autowired
public void setpruebaRepository(pruebaRepository pruebaRepository){
        this.pruebaRepository=pruebaRepository;
        }

        }