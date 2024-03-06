package vsu.cs.is.infsysserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class, // remove after ISAPP-32
                LiquibaseAutoConfiguration.class,
                SecurityAutoConfiguration.class
        }
)
@ConfigurationPropertiesScan("vsu.cs.is.infsysserver.configuration.properties")
public class InfSysServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfSysServerApplication.class, args);
    }

}
