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
//int hp, int ap, int ad, int eficacia, int velocidad, double probcri, int suerte, String grito
                    /*
Berzerk:
HP: 190.
AD: 80
Eficacia: 80
Probabilidad de Critico: 30
Suerte: 15
Velocidad: 20


                     */

                    int ops2 = 0;
                    System.out.println("1) Crear Personaje");
                    int desa = lea.nextInt();
                    switch (desa) {
                        case 1:
                            System.out.println("Ingrese la raza");
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
                            double peso=lea.nextDouble();
                            if (raza.equals("mago")) {
                                p.add(new Mago(edad, nom, est,peso, cpiel, cpelo, raza,120,50,20,70,10,2,20,"hoawwww"));
                            }else if(raza.equals("picaro")){
                                p.add(new picaro(edad, nom, est,peso, cpiel, cpelo, raza,150,0,55,85,30,60,50,"deraaaaaaa"));
                            }else if(raza.equals("berzek")){
                                p.add(new berzek(edad, nom, est,peso, cpiel, cpelo, raza,190,0,80,80,20,30,15,"oitpoooooooooooo"));
                            }
                            break;
                    }

                    break;
                case 2:

                    break;
                case 3:
                    opw = 3;
                    break;
            }
        }
    }

}
