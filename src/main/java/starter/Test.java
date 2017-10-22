package starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class Test {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Test.class, args);

    }
}