package demo.jdbcdemo;

import org.springframework.stereotype.Component;

@Component
public class Assembler {

    private DataMapper dm = new DataMapper();
    private UseCaseController ctrl = new UseCaseController(dm);
}
