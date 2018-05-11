
package lab3_joseluispereira;

import java.util.Random;
/*
Bruja:
HP: 60-80.
AP: 20-40
AD: 5-10
Eficacia: 10-30
Probabilidad de Critico: 1 
Velocidad: 3-7

*/

public class Bruja_enemiga extends Per_enemigo{

    Random r= new Random();

    public Bruja_enemiga(int hp, int ap, int ad, int efi, int PdC, int vel, String nom, int ed, int est, int peso, Arma arm) {
        super(hp, ap, ad, efi, PdC, vel, nom, ed, est, peso, arm);
        this.setHp(60+r.nextInt(80));
        this.setAp(20+r.nextInt(40));
        this.setAd(5+r.nextInt(10));
        this.setEfi(10+r.nextInt(30));       
        this.setPdC(1);
        this.setVel(3 + r.nextInt(7));
        this.setNom("bruja");
        this.setEd(18 + r.nextInt(100));
        this.setEst(80 + r.nextInt(200));
        this.setPeso(5 + r.nextInt(55));
    }
    
    
    
}

