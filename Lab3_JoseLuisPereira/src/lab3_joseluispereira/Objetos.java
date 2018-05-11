/*
 Además de estos los personajes llevan Objetos encima de ellos en una mochila, los Objetos pueden ser de tipo Arma que pueden tener una bonificación de AD y AP, 
Armaduras que dan una bonificación de vida o suerte y los 
talismanes que pueden dar una bonificación para cualquier atributo (pero solo uno) o una maldición que reduce algún atributo 
(Ningún valor puede ser menor de 5). Todos los objetos tienen estos atributos nombre y si es tipo usual, inusual o raro.
Debe crear 10 objetos predefinidos y al menos uno debe dar Bono de Vida

 */
package lab3_joseluispereira;


public class Objetos {
    private int bonAP;
    private int bonAD;
    private int bonHP;
    private int bonSU;
    private String tipo;
    private String nom;

    public Objetos(int bonAP, int bonAD, int bonHP, int bonSU, String tipo, String nom) {
        this.bonAP = bonAP;
        this.bonAD = bonAD;
        this.bonHP = bonHP;
        this.bonSU = bonSU;
        this.tipo = tipo;
        this.nom = nom;
    }

    public int getBonAP() {
        return bonAP;
    }

    public void setBonAP(int bonAP) {
        this.bonAP = bonAP;
    }

    public int getBonAD() {
        return bonAD;
    }

    public void setBonAD(int bonAD) {
        this.bonAD = bonAD;
    }

    public int getBonHP() {
        return bonHP;
    }

    public void setBonHP(int bonHP) {
        this.bonHP = bonHP;
    }

    public int getBonSU() {
        return bonSU;
    }

    public void setBonSU(int bonSU) {
        this.bonSU = bonSU;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Objetos{" + "bonAP=" + bonAP + ", bonAD=" + bonAD + ", bonHP=" + bonHP + ", bonSU=" + bonSU + ", tipo=" + tipo + ", nom=" + nom + '}';
    }
    
    
    
}
