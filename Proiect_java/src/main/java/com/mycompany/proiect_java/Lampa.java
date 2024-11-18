/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class Lampa {
     public   String serie;
  public  int marime_bec;
    
   public Lampa (){
        this.serie="necunoscita";
        this.marime_bec=0;
    }
   public Lampa(int marime_bec,String serie){
       this.marime_bec=marime_bec;
       this.serie=serie;
       
}
    public Lampa(Lampa obj){
        this.marime_bec=obj.marime_bec;
        this.serie=obj.serie;
    }
     @Override
    public String toString() {
        return "Lampa are seria "+this.serie+" si marimea becului de "+this.marime_bec+" cm";
    }
}
