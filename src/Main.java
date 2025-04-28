import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Robot robot = new Robot();
        List<Hombre> lstHombre = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
       do{
        System.out.println("""
                <<MENU DEL JUEGO>>
                1. Avanzar una cantidad de pasos.
                2. Retroceder una cantidad de pasos.
                3. Ver la energía actual.
                4. Dormir al robot (finaliza la sesión).
                5. Despertar al robot.
                6. Recargar la batería.
                Digite su opcion:
                
                """);

            opc = teclado.nextInt();

            switch (opc){
                case 1 ->{
                    int pasos;
                    System.out.println("Digita la cantidad de pasos que deseas avanzar");
                    pasos = teclado.nextInt();
                    robot.avanzar(pasos);


                }

                case 2 ->{
                    int pasos;
                    System.out.println("Digita la cantidad de pasos que deseas retroceder");
                    pasos = teclado.nextInt();
                    robot.retroceder(pasos);


                }

                case 3 ->{



                }

                case 4 ->{
                    robot.dormir();

                }

                case 5 ->{
                    robot.despertar();

                }

                case 6 ->{
                    robot.recargar();

                }
            }
       }while(opc != 6);
    }


}