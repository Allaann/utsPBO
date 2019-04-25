/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author ACER
 */
public class MAIN {
    
    public static void main(String[] args){
        INTEL intel1 = new INTEL(2);
        AMD amd1 = new AMD(3);
        COMPUTER computer1 = new COMPUTER(intel1);
        
        computer1.cetakinfo();
        computer1.mencabut(intel1);
        computer1.memasang(amd1);
        computer1.cetakinfo();
    }
    
}
