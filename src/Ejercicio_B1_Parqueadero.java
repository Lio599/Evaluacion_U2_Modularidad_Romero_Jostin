
import java.util.Scanner;
import Datos.matematicas;

public class Ejercicio_B1_Parqueadero {
    public static int leerMinutos(Scanner sc) {
        int minutos;
        do {
            System.out.print("Ingrese los minutos (1-1440): ");
            minutos = sc.nextInt();

            if (minutos < 1 || minutos > 1440) {
                System.out.println("Valor incorrecto. Intente nuevamente.");
            }

        } while (minutos < 1 || minutos > 1440);

        return minutos;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de vehiculo (A=Auto, M=Moto): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        int minutos = leerMinutos(sc);

        int horas = matematicas.horasCobradas(minutos);

        double total = matematicas.tarifa(horas, tipo);
        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", total);
        sc.close();
    }
}
