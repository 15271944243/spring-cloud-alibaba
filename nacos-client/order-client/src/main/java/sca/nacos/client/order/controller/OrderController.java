package sca.nacos.client.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: xiaoxiaoxiang
 * @date: 2021/4/21 16:11
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String STORAGE_CLIENT_NAME = "nacos-storage-client";

    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    public String createOrder(@PathVariable("pid") String productId) {
        // 下单逻辑  Thread.sleep 代替
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 减库存
        String url = "http://" + STORAGE_CLIENT_NAME + "/storage/" + productId;
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
