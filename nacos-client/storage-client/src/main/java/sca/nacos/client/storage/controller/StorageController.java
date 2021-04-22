package sca.nacos.client.storage.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xiaoxiaoxiang
 * @date: 2021/4/21 16:11
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    public String storage(@PathVariable("pid") String productId) {
        // 减库存逻辑  Thread.sleep 代替
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
