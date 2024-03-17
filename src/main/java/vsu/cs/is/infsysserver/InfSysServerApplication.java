package vsu.cs.is.infsysserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("vsu.cs.is.infsysserver.configuration.properties")
public class InfSysServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfSysServerApplication.class, args);
    }

}
