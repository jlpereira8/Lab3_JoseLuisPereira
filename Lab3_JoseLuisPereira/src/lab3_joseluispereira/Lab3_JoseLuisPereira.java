package lab3_joseluispereira;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_JoseLuisPereira {

    static Scanner lea = new Scanner(System.in);
    static Personajes pop;
    static int pasos;
//int bonAP, int bonAD, int bonHP, int bonSU, String tipo, String nom

    public static void main(String[] args) {
        int opw = 0, ops = 0;
        ArrayList<Personajes> p = new ArrayList();
        ArrayList<Objetos> mochila = new ArrayList();
        mochila.add(new Objetos(0, 12, 33, 0, "usual", "El rompeorts"));
        mochila.add(new Objetos(0, 33, 12, 1, "inusual", "yungi"));
        mochila.add(new Objetos(0, 22, 3, 10, "raro", "yoglo"));
        mochila.add(new Objetos(0, 42, 32, 12, "usual", "El romelo"));
        mochila.add(new Objetos(0, 33, 12, 1, "inusual", "yuloass"));
        mochila.add(new Objetos(0, 2, 3, 40, "raro", "polera"));
        mochila.add(new Objetos(0, 42, 33, 0, "inusual", "umero"));
        mochila.add(new Objetos(0, 4, 2, 32, "raro", "deltoide"));
        mochila.add(new Objetos(0, 3, 62, 1, "inusual", "trapezius"));
        mochila.add(new Objetos(0, 23, 32, 4, "raro", "bixsa"));
        ArrayList<Objetos> empty = new ArrayList();

        while (opw != 3) {
            System.out.println("*******************Menu*******************");
            System.out.println("1) Iniciar");
            System.out.println("2) Nivel de dificultad ");
            System.out.println("3) Salir");
            ops = lea.nextInt();
            switch (ops) {
                case 1:
                    int ops2 = 0;
                    System.out.println("1) Crear Personaje");
                    System.out.println("2) Creae Personaje determinado");
                    System.out.println("3) Iniciar juego");
                    int desa = lea.nextInt();
                    switch (desa) {
                        case 1:
                            System.out.println("Ingrese la personaje");
                            String raza = lea.next();
                            System.out.println("Ingrese la edad ");
                            int edad = lea.nextInt();
                            System.out.println("Ingrese el nombre ");
                            String nom = lea.next();
                            System.out.println("Ingrese la estatura ");
                            double est = lea.nextDouble();
                            System.out.println("Ingrese el color de piel");
                            String cpiel = lea.next();
                            System.out.println("Ingrese el color de pelo");
                            String cpelo = lea.next();
                            System.out.println("Ingrese el peso ");
                            double peso = lea.nextDouble();
                            System.out.println("Ingrese la raza");
                            String raza2 = lea.next();
                            if (raza.equals("mago")) {
                                p.add(new Mago(edad, nom, est, peso, cpiel, cpelo, raza, 120, 50, 20, 70, 10, 2, 20, "hoawwww", raza2));
                                 pop = new Mago(edad, nom, est, peso, cpiel, cpelo, raza, 120, 50, 20, 70, 10, 2, 20, "hoawwww", raza2);
                            } else if (raza.equals("picaro")) {
                                p.add(new picaro(edad, nom, est, peso, cpiel, cpelo, raza, 150, 0, 55, 85, 30, 60, 50, "deraaaaaaa", raza2));
                                 pop = new picaro(edad, nom, est, peso, cpiel, cpelo, raza, 120, 50, 20, 70, 10, 2, 20, "hoawwww", raza2);
                            } else if (raza.equals("berzek")) {
                                p.add(new berzek(edad, nom, est, peso, cpiel, cpelo, raza, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", raza2));
                                 pop = new berzek(edad, nom, est, peso, cpiel, cpelo, raza, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", raza2);
                            } else if (raza.equals("arquero")) {
                                p.add(new Arquero(edad, nom, est, peso, cpiel, cpelo, raza, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", raza2));
                                 pop = new Arquero(edad, nom, est, peso, cpiel, cpelo, raza, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", raza2);
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la personaje");
                            String razas = lea.next();
                            if (razas.equals("mago")) {
                                p.add(new Mago(32, "Prozis", 1.78, 121, "azul", "verde", razas, 120, 50, 20, 70, 10, 2, 20, "hoawwww", "hobbit"));
                                 pop = new Mago(32, "Prozis", 1.78, 121, "azul", "verde", razas, 120, 50, 20, 70, 10, 2, 20, "hoawwww", "hobbit");
                            } else if (razas.equals("picaro")) {
                                p.add(new picaro(18, "Leonardo Montoya", 1.75, 170, "blanco", "negro", razas, 150, 0, 55, 85, 30, 60, 50, "deraaaaaaa", "elfo"));
                                pop = new picaro(18, "Leonardo Montoya", 1.75, 170, "blanco", "negro", razas, 150, 0, 55, 85, 30, 60, 50, "deraaaaaaa", "elfo");
                            } else if (razas.equals("berzek")) {
                                p.add(new berzek(22, "ragnar", 1.90, 155, "negro", "cafe", razas, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", "humano"));
                                pop = new berzek(22, "ragnar", 1.90, 155, "negro", "cafe", razas, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", "humano");
                            } else if (razas.equals("arquero")) {
                                p.add(new Arquero(55, "hondrod", 1.34, 133, "verde", "morado", razas, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", "enano"));
                                pop = new Arquero(55, "hondrod", 1.34, 133, "verde", "morado", razas, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", "enano");
                            }
                    
                            break;
                        case 3:
              
                            int pas = 0,ee,
                             re,
                             req;
                            Random ra = new Random();
                            while ( pas < pasos) {
                                re = 1 + ra.nextInt(20);
                                System.out.println("El resultado del dado de 20 caras fue " + re);
                                pas += re;
                                req = 1 + ra.nextInt(100);
                                System.out.println("El resultado del dado de 100 caras fue " + req);
                                if (pop.getSuerte() < req) {
                                    System.out.println("Se agrego un objeto a su mochila");
                                    empty.add(mochila.get(ee=1 + ra.nextInt(9)));
                                    System.out.println(mochila.get(ee));
                                } else if (pop.getSuerte() > req) {
                                    System.out.println("Usted encotro un enemigo");
                                    
                                }
                                
                            }

                            break;
                    }
                case 2:
                    /*
                    La dificultad del juego determina la cantidad de enemigos que se encuentran en una partida.
                    Siendo 3 niveles de dificultad 5, 10 y 15 enemigos en el nivel más alto. Los calabozos se componen de pasos que también están determinados por la dificultad 50, 
                    100 y 120.Inicia en la posición 0 y termina el juego cuando ya ha recorrido los pasos correspondientes al calabozo.

                     */
                    int enemigos;
                    ArrayList<Arma> ar = new ArrayList();
                    System.out.println("*****************Menu_Dificultad*****************");
                    System.out.println("Seleccione la dificultad");
                    System.out.println("1) Dificil");
                    System.out.println("2) Medio");
                    System.out.println("3) Facil");
                    int ioj = lea.nextInt();
                    switch (ioj) {
                        case 1:
                            enemigos = 5;
                            pasos = 50;
                            break;
                        case 2:
                            enemigos = 10;
                            pasos = 100;
                            break;
                        case 3:
                            enemigos = 15;
                            pasos = 120;
                    }
                    break;

                case 3:
                    opw = 3;
                    break;
            }
        }
    }

}
