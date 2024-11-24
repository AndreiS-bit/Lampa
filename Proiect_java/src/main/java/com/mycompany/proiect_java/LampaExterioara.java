/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class LampaExterioara extends Lampa {
    public boolean  pornita;
    public boolean conectata;
    private boolean rezistent_apa;
    private int nivel_iluminare;
    private String tip_MaterialCarcasa;
    
   public LampaExterioara(){
        super();
        this.conectata=false;
        this.pornita=false;
        this.rezistent_apa=false;
        this.nivel_iluminare=0;
        this.tip_MaterialCarcasa="necunoscut";
    }
    public LampaExterioara(boolean pornita , boolean conectata,String serie,int marime_bec,int inaltime,String culoare,boolean cuBaterie ){
        super(marime_bec ,serie,inaltime,culoare,cuBaterie);
        this.conectata=conectata;
        this.pornita=pornita;
    }
     public LampaExterioara(LampaExterioara obj) {
        super(obj); 
        if (obj != null) {
            this.conectata = obj.conectata;
            this.pornita = obj.pornita;
        }
    }
     
     public void setrezistent_apa(boolean rezistent_apa){
         this.rezistent_apa=rezistent_apa;
     }
     public boolean getrezistent_apa(){
         return this.rezistent_apa;
     }
     public void setnivel_iluminare(int nivel_luminare){
         this.nivel_iluminare=nivel_luminare;
     }
     public int getnivel_iluminare(){
         return this.nivel_iluminare;
     }
     public void settip_MaterialCarcasa(String tip_MaterialCarcasa){
         this.tip_MaterialCarcasa=tip_MaterialCarcasa;
     }
     public String gettip_MaterialCarcasa(){
         return this.tip_MaterialCarcasa;
     }
     
     
 @Override
    public String toString() {
        return "LampaExterioara{" +
                "conectata=" + conectata +
                ", pornita=" + pornita +
                "rezistent_apa"+rezistent_apa+
                ", " + super.toString() +
                '}';
    }

    
   
}
