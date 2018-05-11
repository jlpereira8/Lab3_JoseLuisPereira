
package lab3_joseluispereira;

import java.util.Random;
/*
Elfo Oscuro:
HP: 60-120.
AD: 30-50
Eficacia: 50-70
Probabilidad de Critico: 0-100
Velocidad: 20

*/

public class elfo_oscuro extends Per_enemigo{
    
 Random r= new Random();

    public elfo_oscuro(int hp, int ap, int ad, int efi, int PdC, int vel, String nom, int ed, int est, int peso, Arma arm) {
        super(hp, ap, ad, efi, PdC, vel, nom, ed, est, peso, arm);
        this.setHp(60+r.nextInt(120));
        this.setAp(0);
        this.setAd(30+r.nextInt(50));
        this.setEfi(50+r.nextInt(70));       
        this.setPdC(60);
        this.setVel(20);
        this.setNom("Elfo Oscuro");
        this.setEd(10 + r.nextInt(110));
        this.setEst(1 + r.nextInt(120));
        this.setPeso(20 + r.nextInt(80));
        
    }
 
    

    
}
