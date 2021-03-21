/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.neuroevolution.near.master;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Christian Lins
 */
@RestController
public class WebInterface {
    @GetMapping("/")
    public String getIndex() {
        return "Hello World";
    }
    
    @GetMapping("/api/v1/web/workerstates") 
    public String getWorkerStates() {
        return "Null";
    }
}
