package lab3_joseluispereira;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JoseLuisPereira {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int opw = 0, ops = 0;
        ArrayList<Personajes> p = new ArrayList();
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
                            } else if (raza.equals("picaro")) {
                                p.add(new picaro(edad, nom, est, peso, cpiel, cpelo, raza, 150, 0, 55, 85, 30, 60, 50, "deraaaaaaa", raza2));
                            } else if (raza.equals("berzek")) {
                                p.add(new berzek(edad, nom, est, peso, cpiel, cpelo, raza, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", raza2));
                            } else if (raza.equals("arquero")) {
                                p.add(new Arquero(edad, nom, est, peso, cpiel, cpelo, raza, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", raza2));
                            }
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Ingrese la personaje");
                    String raza = lea.next();
                    if (raza.equals("mago")) {
                        p.add(new Mago(32, "Prozis", 1.78, 121, "azul", "verde", raza, 120, 50, 20, 70, 10, 2, 20, "hoawwww", "hobbit"));
                    } else if (raza.equals("picaro")) {
                        p.add(new picaro(18, "Leonardo Montoya", 1.75, 170, "blanco", "negro", raza, 150, 0, 55, 85, 30, 60, 50, "deraaaaaaa", "elfo"));
                    } else if (raza.equals("berzek")) {
                        p.add(new berzek(22, "ragnar", 1.90, 155, "negro", "cafe", raza, 190, 0, 80, 80, 20, 30, 15, "oitpoooooooooooo", "humano"));
                    } else if (raza.equals("arquero")) {
                        p.add(new Arquero(55, "hondrod", 1.34, 133, "verde", "morado", raza, 150, 0, 50, 85, 15, 60, 20, "olsdeaaaaaaaa", "enano"));
                    }
                    break;
                case 3:
                    opw = 3;
                    break;
            }
        }
    }

}
