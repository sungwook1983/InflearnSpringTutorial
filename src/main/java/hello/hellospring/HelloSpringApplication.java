package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
}

