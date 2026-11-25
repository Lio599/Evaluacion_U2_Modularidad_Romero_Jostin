package Datos;

public class matematicas {

    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }
    public static double tarifa(int horas, char tipo) {

        double total;

        if (tipo == 'A') {
            total = horas * 1.00;
        } else {
            total = horas * 0.50;
        }

        if (horas > 8) {
            total = total * 0.80;
        }
        return total;
    }
}
