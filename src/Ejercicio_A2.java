public class Ejercicio_A2 {
    public static int pot(int b, int e) {
         if (e == 0) 
            return 1; 
            return b * pot(b, e - 1); 
        }
        // Hasta aqui es lo que le manda el ejercicio, ahora imprimo junto con los valores que me pide: "pot(3, 4)".
        
    public static void main(String[] a){
        System.out.println("pot(3, 4) = " + pot(3, 4));
    }
    //Resultado en la terminal : 
    //pot(3, 4) = 81.
}
