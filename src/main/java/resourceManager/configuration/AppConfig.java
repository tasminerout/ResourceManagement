package resourceManager.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages = "resourceManager")
@SpringBootApplication
public class AppConfig {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AppConfig.class, args);
    }


}
