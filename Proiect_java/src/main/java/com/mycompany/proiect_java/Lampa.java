/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class Lampa extends OptiuniLampa {
     private   String serie;
  private  int marime_bec;
  int  inaltime; 
  private String culoare;
  private boolean cuBaterie;
    
   public Lampa (){
        this.serie="necunoscita";
        this.marime_bec=0;
        this.inaltime=0;
        this.cuBaterie=false;
        this.culoare="necunoscuta"; 
    }
   public Lampa(int marime_bec,String serie,int inaltime,String culoare,boolean cuBaterie){
       this.marime_bec=marime_bec;
       this.serie=serie;
       this.inaltime=inaltime;
       this.culoare=culoare;
       this.cuBaterie=cuBaterie;
       
}
    public Lampa(Lampa obj){
        this.marime_bec=obj.marime_bec;
        this.serie=obj.serie;
    }
    
    public void setInaltime(int inaltime){
        this.inaltime=inaltime;
   
    }
    public int getInaltime(){
        return this.inaltime;
    }
    
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    public String getCuloare(){
        return this.culoare;
    }
    public void setcuBaterie(boolean cuBaterie){
        this.cuBaterie=cuBaterie;
    }
    public boolean getcuBaterie(){
        return this.cuBaterie;
    }
    
    public void setserie(String serie){
        this.serie=serie;
    }
    public String getserie(){
        return this.serie;
    }
    public void setmarime_bec(int marime_bec){
        this.marime_bec=marime_bec;
    }
    public int getmarime_bec(){
        return this.marime_bec;
    }
    
    @Override
    public void porneste(){
        this.setPornita(true);

    }
    
    
    
    
    @Override
    public void opreste(){
        this.setPornita(false);
    }
    
     @Override
    public String toString() {
        return "Lampa are seria "+this.serie+" si marimea becului de "+this.marime_bec+" cm"+" inaltimea de "+this.inaltime+" cm "+"are culoarea "+this.culoare+" are baterie: "+this.cuBaterie;
    }
}
