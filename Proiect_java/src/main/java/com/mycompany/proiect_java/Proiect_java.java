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
        
          Object[] lampi = new Object[10];
        for (int i = 0; i < lampi.length; i++) {
            lampi[i] = new Lampa(); 
            System.out.println(lampi[i]);
           
        }
        Object[] lampiExterioare = new Object[10];
        for (int i = 0; i < lampiExterioare.length; i++) {
            lampiExterioare[i] = new LampaExterioara();
            System.out.println(lampiExterioare[i]);
        }
        Object[] optiuniLampa = new Object[10];
        for (int i = 0; i < optiuniLampa.length; i++) {
            optiuniLampa[i] = new OptiuniLampa() {
                @Override
                public void porneste() {
                    System.out.println("Pornește opțiunea lămpii.");
                }

                @Override
                public void opreste() {
                    System.out.println("Oprește opțiunea lămpii.");
                    
                }
            };
            System.out.println(optiuniLampa[i]);
        }
        
        Object[] surselumina=new Object[10];
        for(int i=0;i < surselumina.length ;i++){
            surselumina[i]=new SursaIluminat();
            System.out.println(surselumina[i]);
        }
        
    }
}
