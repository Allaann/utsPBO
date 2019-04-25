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
public class COMPUTER {
    
    private CPU cpu;
    public COMPUTER(CPU cpu){
        this.cpu = cpu;
    }
    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU "+this.cpu.getCPUData()+" GHz dipasang");
    }
    public void mencabut(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU "+this.cpu.getCPUData()+" GHz dicabut");
    }
    public void cetakinfo(){
        System.out.println("Spesifikasi : "+this.cpu.getCPUData()+" GHz");
    }
    
}
