package com.learning_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningApiApplication.class, args);
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9091");
    }
}
