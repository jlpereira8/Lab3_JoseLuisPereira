/*
 *Edad , Nombre , Estatura , Peso , Color de piel  ,Color de pelo (Que solo pueden ser tres Negro , Café y rubio )  , raza
Mago ,  Arquero  , Berzerk   y Pícaro  todas estas son consideradas como Personajes Aliados. Todos los Personajes tienen HP   , AD ,  
Eficacia (no puede ser mayor ni igual a 100 ni menor que 1), 
Velocidad , Probabilidad de Critico (lo mismo que la eficacia) , Velocidad y Suerte , Un grito de batalla(Que usted elegirá ) 
 */
package lab3_joseluispereira;

public class Personajes {

    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String cpiel;
    private String cpelo;
    private String raza;
    private int hp;
    private int ap;
    private int ad;
    private int eficacia;
    private int velocidad;
    private double probcri;
    private int suerte;
    private String grito;
    private String raza2;

    public Personajes(int edad, String nombre, double estatura, double peso, String cpiel, String cpelo, String raza, int hp, int ap, int ad, int eficacia, int velocidad, double probcri, int suerte, String grito, String raza2) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.cpiel = cpiel;
        this.cpelo = cpelo;
        this.raza = raza;
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.probcri = probcri;
        this.suerte = suerte;
        this.grito = grito;
        this.raza2 = raza2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCpiel() {
        return cpiel;
    }

    public void setCpiel(String cpiel) {
        this.cpiel = cpiel;
    }

    public String getCpelo() {
        return cpelo;
    }

    public void setCpelo(String cpelo) {
        this.cpelo = cpelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getProbcri() {
        return probcri;
    }

    public void setProbcri(double probcri) {
        this.probcri = probcri;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }

    public String getRaza2() {
        return raza2;
    }

    public void setRaza2(String raza2) {
        this.raza2 = raza2;
    }

    @Override
    public String toString() {
        return "Personajes{" + "edad=" + edad + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", cpiel=" + cpiel + ", cpelo=" + cpelo + ", raza=" + raza + ", hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", eficacia=" + eficacia + ", velocidad=" + velocidad + ", probcri=" + probcri + ", suerte=" + suerte + ", grito=" + grito + ", raza2=" + raza2 + '}';
    }
    
    
    
}
