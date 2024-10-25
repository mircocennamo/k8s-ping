package it.k8s.ping.service;

/**
 * @author mirco.cennamo on 11/10/2024
 * @project ping
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//, url = "http://pong-service:8090"
@FeignClient(name = "pong-service", url = "http://pong-service:8090")
public interface PongServiceReceiver {

    @GetMapping(value = "/api/data")
    String getDataFromServicePong();
}
