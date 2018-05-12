
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

    public elfo_oscuro() {
        super.setHp(60+r.nextInt(120));
        super.setAp(0);
        super.setAd(30+r.nextInt(50));
        super.setEfi(50+r.nextInt(70));       
        super.setPdC(60);
        super.setVel(20);
        super.setNom("Elfo Oscuro");
        super.setEd(10 + r.nextInt(110));
        super.setEst(1 + r.nextInt(120));
        super.setPeso(20 + r.nextInt(80));
        Arma a22=new Arma(0,34,16,12,"inusual","Diabolic");
        super.setArm(a22);
        Arma a223=new Arma(0,31,12,9,"inusual","Diabolics 2");
        super.setArm(a223);
        
    }
 
    

    
}
