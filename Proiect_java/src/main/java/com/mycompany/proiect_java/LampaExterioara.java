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
    
   public LampaExterioara(){
        super();
        this.conectata=false;
        this.pornita=false;
    }
    public LampaExterioara(boolean pornita , boolean conectata,String serie,int marime_bec ){
        super(marime_bec ,serie);
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
 @Override
    public String toString() {
        return "LampaExterioara{" +
                "conectata=" + conectata +
                ", pornita=" + pornita +
                ", " + super.toString() +
                '}';
    }
   
}
