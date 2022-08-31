/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omar.calculadora.controllers;

import com.omar.calculadora.Respuesta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */

@RestController // This means that this class is a Controller
public class CalculadoraController {
    
    
    @GetMapping(path = "/sum/{a}/{b}")
    public Respuesta suma(@PathVariable int a,@PathVariable int b ){
        
        Respuesta res = new Respuesta();
        res.setA(a);
        res.setB(b);
        res.setRespuesta( a + b);
        return res;
    }
    
    @GetMapping(path = "/res/{a}/{b}")
    public Respuesta resta(@PathVariable int a,@PathVariable int b ){
        
        Respuesta res = new Respuesta();
        res.setA(a);
        res.setB(b);
        res.setRespuesta( a - b);
        return res;
    }
    
    @GetMapping(path = "/mult/{a}/{b}")
    public Respuesta multiplicar(@PathVariable int a,@PathVariable int b ){
        
        Respuesta res = new Respuesta();
        res.setA(a);
        res.setB(b);
        res.setRespuesta( a * b);
        return res;
    }
    
    @GetMapping(path = "/div/{a}/{b}")
    public Respuesta divivir(@PathVariable int a,@PathVariable int b ){
        
        Respuesta res = new Respuesta();
        
        if (b == 0) {
            res.setError("La division por cero no es posible, intentelo de nuevo");
            return res;
            
        }
        res.setA(a);
        res.setB(b);
        res.setRespuesta( a / b);
        return res;
    }
    
}
