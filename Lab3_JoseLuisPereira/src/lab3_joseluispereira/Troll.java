/*
 Troll:
HP: 50-80.
AD: 30-50
Eficacia: 50-65
Probabilidad de Critico: 15-20
Velocidad: 10
int bonAP, int bonAD, int bonHP, int bonSU, String tipo, String nom
 */
package lab3_joseluispereira;

import java.util.Random;


public class Troll extends Per_enemigo{
    
    Random r= new Random();

    public Troll(int hp, int ap, int ad, int efi, int PdC, int vel, String nom, int ed, int est, int peso, Arma arm) {
        super(hp, ap, ad, efi, PdC, vel, nom, ed, est, peso, arm);
        this.setHp(50+r.nextInt(80));
        this.setAp(0);
        this.setAd(30+r.nextInt(50));
        this.setEfi(50+r.nextInt(65));       
        this.setPdC(15+r.nextInt(20));
        this.setVel(10);
        this.setNom("Troll");
        this.setEd(100 + r.nextInt(1100));
        this.setEst(100 + r.nextInt(200));
        this.setPeso(200 + r.nextInt(550));

        
    }

    

    
    
    
}
