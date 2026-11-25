
public class Ejercicio_B2_Recursividad {

    public static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        }

        if (n % 2 != 0) {
            return sumaPares(n - 1);
        }

        return n + sumaPares(n - 2);
    }
    public static boolean esCapicua(String capicula) {
        if (capicula.length() <= 1) {
            return true;
        }

        if (capicula.charAt(0) != capicula.charAt(capicula.length() - 1)) {
            return false;
        }

        return esCapicua(capicula.substring(1, capicula.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println("sumaPares(10) = " + sumaPares(10));
        System.out.println("sumaPares(7) = " + sumaPares(7));

        System.out.println("esCapicua(12321) = " +
            esCapicua("12321"));
    }
}
