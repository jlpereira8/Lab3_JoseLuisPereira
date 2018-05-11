
package lab3_joseluispereira;

import java.util.Random;

/*
Orco:
HP: 70-90.
AD: 30-45
Eficacia: 20-50
Probabilidad de Critico: 60 
Velocidad: 20

*/
public class Orco extends Per_enemigo {
    
    Random r= new Random();

    public Orco(int hp, int ap, int ad, int efi, int PdC, int vel, String nom, int ed, int est, int peso, Arma arm) {
        super(hp, ap, ad, efi, PdC, vel, nom, ed, est, peso, arm);
        this.setHp(70+r.nextInt(90));
        this.setAp(0);
        this.setAd(30+r.nextInt(45));
        this.setEfi(20+r.nextInt(50));       
        this.setPdC(60);
        this.setVel(20);
        this.setNom("Orco");
        this.setEd(10 + r.nextInt(110));
        this.setEst(1 + r.nextInt(120));
        this.setPeso(20 + r.nextInt(80));
    }

    

    
    
    
    
}
