package de.neuroevolution.near.worker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuntimeInterface {
    
    @GetMapping("/v1/status")
    public String taskStatus() {
        return "Everything is awesome";
    }

}
