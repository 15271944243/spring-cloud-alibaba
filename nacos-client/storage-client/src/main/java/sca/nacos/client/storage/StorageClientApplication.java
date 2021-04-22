package sca.nacos.client.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xiaoxiaoxiang
 * @date: 2021/4/21 16:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StorageClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageClientApplication.class, args);
    }
}
