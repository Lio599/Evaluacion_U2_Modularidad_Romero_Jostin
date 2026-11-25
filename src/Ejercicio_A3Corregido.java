public class Ejercicio_A3Corregido {
    static void m(int a, int[] v) { a++; v[1] += a; }
    public static void main(String[] m){
        int a = 5; int[] v = {1, 2, 3}; m(a, v);
        System.out.println(a + " " + v[1]);
    }
    //ahora el programa corre y su salida de la terminal: 
    //5 8
}
