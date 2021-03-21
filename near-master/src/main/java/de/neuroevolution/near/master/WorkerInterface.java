/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.neuroevolution.near.master;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Christian Lins
 */
@RestController
public class WorkerInterface {
    @GetMapping("/api/v1/worker/register")
    public void register() {
        
    }
    
    @PutMapping("/api/v1/worker/{id}/status")
    public void status(@PathVariable String id) {
        
    }
}
