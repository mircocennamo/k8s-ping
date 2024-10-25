package it.k8s.ping.rest;

import it.k8s.ping.entity.User;
import it.k8s.ping.service.UserService;
import it.k8s.ping.service.PongServiceReceiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class MyRestController {

    @Autowired
    private PongServiceReceiver pongServiceReceiver;

    @Autowired
    private UserService userService;

   // @Autowired
   // private ConfigMapProperties configMapProperties;

    @Value("${my.property}")
    private String myProperty;

    //@Value("${my.secret.property}")
    //private String mySecretProperty;

    @GetMapping("/invoke")
    public String invokePod() {
        log.info("invokePod myProperty  " +  myProperty);
       // String property = configMapProperties.getCustomProperty();
        return pongServiceReceiver.getDataFromServicePong();
    }

    @GetMapping("/surname/{id}")
    public String surname(@PathVariable Long id) {
        log.info("MyRestController id  " +  id);
        Optional<User> user = userService.getId(id);
        if( user.isPresent()){
            return user.get().getCognome();
        }else{
            return "UNDEFINED";
        }

    }
}
