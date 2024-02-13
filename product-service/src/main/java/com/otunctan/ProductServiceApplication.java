package com.otunctan;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableFeignClients
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class,args);
    }


    @Value("${jenkis.build.number}")
    private String buildNumber;
    @Bean
    public CommandLineRunner jenkinsBuildNumber(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println(buildNumber);
            }
        };
    }
}
