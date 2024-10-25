package it.k8s.ping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8sPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sPingApplication.class, args);
    }

}
