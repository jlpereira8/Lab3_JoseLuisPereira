
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

    public Orco() {
        
        super.setHp(70+r.nextInt(90));
        super.setAp(0);
        super.setAd(30+r.nextInt(45));
        super.setEfi(20+r.nextInt(50));       
        super.setPdC(60);
        super.setVel(20);
        super.setNom("Orco");
        super.setEd(10 + r.nextInt(110));
        super.setEst(1 + r.nextInt(120));
        super.setPeso(20 + r.nextInt(80));
        Arma a21=new Arma(0,19,46,12,"usual","nelper");
        super.setArm(a21);
    }

    

    
    
    
    
}
