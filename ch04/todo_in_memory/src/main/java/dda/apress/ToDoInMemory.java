package dda.apress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoInMemory
{
    public static void main( String[] args )
    {
        SpringApplication.run(ToDoInMemory.class, args);
        System.out.println( "Hello World!" );
    }
}
