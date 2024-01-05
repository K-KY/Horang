package com.Horang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Map;

@SpringBootApplication
public class HorangApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder()
                .properties(Map.of(
                                "spring.application.name", "horang-api",
                                "spring.profiles.active", "local",
                                "logging.level.root", "info"
                        )
                ).sources(HorangApplication.class);

        builder.run(args);
    }
}
