
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
int bonAP, int bonAD, int bonHP, int bonSU, String tipo, String nom
*/

public class Bruja_enemiga extends Per_enemigo{

    Random r= new Random();

    public Bruja_enemiga() {
        super.setHp(60+r.nextInt(80));
        super.setAp(20+r.nextInt(40));
        super.setAd(5+r.nextInt(10));
        super.setEfi(10+r.nextInt(30));       
        super.setPdC(1);
        super.setVel(3 + r.nextInt(7));
        super.setNom("bruja");
        super.setEd(18 + r.nextInt(100));
        super.setEst(80 + r.nextInt(200));
        super.setPeso(5 + r.nextInt(55));
        Arma a=new Arma(3,12,32,14,"inusual","Dilaoic");
        super.setArm(a);
    }

   

      
    
}

