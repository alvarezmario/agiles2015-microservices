package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class UIApplication {
    public static void main(String[] args) {
        SpringApplication.run(UIApplication.class, args);
    }
}