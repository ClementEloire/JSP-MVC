/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp;

/**
 *
 * @author pedago
 */
public class CodeDiscount {
    
    private String code;
    private float taux;
    
    public CodeDiscount(String code,float taux){
        this.code = code;
        this.taux = taux;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public float getTaux(){
        return this.taux;
    }
    
}
