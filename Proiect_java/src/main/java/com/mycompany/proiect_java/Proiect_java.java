/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class Proiect_java {

    public static void main(String[] args) {
        Lampa l1= new Lampa();
        LampaExterioara lampaex = new LampaExterioara("25f",23,15,"rosie",true,true,false,true,2,"Metal");
        System.out.println(l1);
        LampaExterioara e1=new LampaExterioara();
        System.out.println(e1);
        SursaIluminat s1=new SursaIluminat();
        System.out.println(s1);
         LampaExterioara lampaExterioara = new LampaExterioara();
         lampaExterioara.setrezistent_apa(true);
         System.out.println(lampaExterioara);
         lampaExterioara.porneste();
         l1.porneste();
        System.out.println("este pornita? "+l1.ONsauOFF());
        System.out.println("este pornita? "+lampaExterioara.ONsauOFF());
        
          Object[] lampi = new Object[30];
        for (int i = 0; i < 10; i++) {
            
        lampi[i] = new Lampa(10 + i, "Seria" + i,23+i,"Maro",true);
   
        }
        for(int i= 10;i<20;i++){
            lampi[i]=new LampaExterioara("25f",13+i,1+i,"rosie",true,true,false,false,2,"Metal");
        }
        for(int i =20;i<30;i++){
          lampi[i] = new SursaIluminat("26f", 5 + i, 1 + i, 30 + i, "Serie" + i, 40 - i, "rosie", false, "Priza", "calda");
        }
        for(int  i=0;i<=29;i++){
           System.out.println(lampi[i]);
        }
        
        System.out.println(lampaex);
        LampaExterioara lam1 = new LampaExterioara(lampaex);
        System.out.println(lam1);
        
        System.out.println("---------------------------------------------------------------------");
        
    for (Object obj : lampi) {
    if (obj instanceof Lampa) { 
        Lampa lampa = (Lampa) obj; 
        if (lampa.getInaltime() > 10 && lampa.getcuBaterie()) {
            System.out.println("Lampa: " + lampa);
        }
    } else if (obj instanceof LampaExterioara) { 
        LampaExterioara lampaExterioa = (LampaExterioara) obj; 
        if (lampaExterioara.getpornita() && lampaExterioa.getconectata()) {
            System.out.println("LampaExterioara: " + lampaExterioa);
        }
    } else if (obj instanceof SursaIluminat) { 
        SursaIluminat sursaIluminat = (SursaIluminat) obj; 
        if (sursaIluminat.getputere() > 50 && sursaIluminat.getdurata_lumina() > 100) {
            System.out.println("SursaIluminat: " + sursaIluminat);
        }
    }
}

        
    }
}
