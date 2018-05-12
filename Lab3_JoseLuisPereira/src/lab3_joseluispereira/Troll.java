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

    public Troll() {    
        super.setHp(50+r.nextInt(80));
        super.setAp(0);
        super.setAd(30+r.nextInt(50));
        super.setEfi(50+r.nextInt(65));       
        super.setPdC(15+r.nextInt(20));
        super.setVel(10);
        super.setNom("Troll");
        super.setEd(100 + r.nextInt(1100));
        super.setEst(100 + r.nextInt(200));
        super.setPeso(200 + r.nextInt(550));
        Arma a2=new Arma(0,14,36,32,"inusual","Mazo benevolente");
        super.setArm(a2);
        
    }

    

    
    
    
}
