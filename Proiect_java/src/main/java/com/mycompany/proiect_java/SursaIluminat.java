/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class SursaIluminat extends Lampa{
    public String tip_bec;
    public int putere;
    public int durata_lumina;
    private String alimentare;
    private String tip_lumina;
    
    public  SursaIluminat(){
        super();
        this.tip_bec="necunoscut";
        this.putere=0;
        this.durata_lumina=0;
    }
    public SursaIluminat(String tip_bec,int putere,int durata_lumina,int marime_bec,String serie,int inaltime , String culoare ,boolean cuBaterie){
        super(marime_bec ,serie,inaltime ,culoare,cuBaterie);
        this.tip_bec=tip_bec;
        this.durata_lumina=durata_lumina;
        this.putere=putere;
    }
   public SursaIluminat(SursaIluminat obj){
       super(obj);
        this.durata_lumina=obj.durata_lumina;
        this.putere=obj.putere;
        this.tip_bec=obj.tip_bec;
    }
   
   public void setalimentare(String alimentare){
       this.alimentare=alimentare;
   }
   public String getalimentare(){
       return this.alimentare;
   }
   public void settip_lumina(String tip_lumina){
       this.tip_lumina=tip_lumina;
   }
   public String gettip_lumina(){
       return this.tip_lumina;
       }
   
   
    @Override
    public String toString() {
        return "SursaIluminat{" +
                "tip_bec='" + tip_bec + '\'' +
                ", putere=" + putere +
                ", durata_lumina=" + durata_lumina +
                ", " + super.toString() +
                '}';
    }
}