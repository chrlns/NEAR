/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.neuroevolution.near.master;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Christian Lins
 */
public class WorkerPool {
    @Autowired
    private List<Worker> pool;
}
