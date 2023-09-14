package

{{packageName}}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import {{packageName}}.repository.{{className}}Repository;

@Service
public class {{className}}Service{

private {{className}}Repository {{className}}Repository;

@Autowired
public void set{{className}}Repository({{className}}Repository {{className}}Repository){
        this.{{className}}Repository={{className}}Repository;
        }

        }