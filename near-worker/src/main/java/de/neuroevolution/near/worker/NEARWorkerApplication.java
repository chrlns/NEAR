/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.neuroevolution.near.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Christian Lins
 */
@SpringBootApplication
public class NEARWorkerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NEARWorkerApplication.class, args);

        // Register worker at master process

        // Start the loop

        // Fetch work

        // Do the work

        // Submit result
    }
}
