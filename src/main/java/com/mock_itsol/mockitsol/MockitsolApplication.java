package com.mock_itsol.mockitsol;

import com.mock_itsol.mockitsol.util.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class MockitsolApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitsolApplication.class, args);
    }

}
