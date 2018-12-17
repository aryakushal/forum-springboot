package test.ironman.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"test.ironman.platform"})
public class Application
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    }
}
