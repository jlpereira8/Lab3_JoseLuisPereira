
package lab3_joseluispereira;

/**
 *Bruja:
HP: 60-80.
AP: 20-40
AD: 5-10
Eficacia: 10-30
Probabilidad de Critico: 1 
Velocidad: 3-7
* 
* Edad, Nombre (Que será el mismo que el de su clase), Estatura, Peso. 
 */
public class Per_enemigo {
    private int hp;
    private int ap;
    private int ad;
    private int efi;
    private int PdC;
    private int vel;
    private String nom;
    private int ed;
    private int est;
    private int peso;
    private Arma arm;

    public Per_enemigo(int hp, int ap, int ad, int efi, int PdC, int vel, String nom, int ed, int est, int peso, Arma arm) {
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.efi = efi;
        this.PdC = PdC;
        this.vel = vel;
        this.nom = nom;
        this.ed = ed;
        this.est = est;
        this.peso = peso;
        this.arm = arm;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEfi() {
        return efi;
    }

    public void setEfi(int efi) {
        this.efi = efi;
    }

    public int getPdC() {
        return PdC;
    }

    public void setPdC(int PdC) {
        this.PdC = PdC;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public int getEst() {
        return est;
    }

    public void setEst(int est) {
        this.est = est;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Arma getArm() {
        return arm;
    }

    public void setArm(Arma arm) {
        this.arm = arm;
    }

    @Override
    public String toString() {
        return "Per_enemigo{" + "hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", efi=" + efi + ", PdC=" + PdC + ", vel=" + vel + ", nom=" + nom + ", ed=" + ed + ", est=" + est + ", peso=" + peso + ", arm=" + arm + '}';
    }
    
    
   
    
}
