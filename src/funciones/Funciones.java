package funciones;

public class Funciones {
    public static void main(String[] args) {
      
        float resultado = getIva(1.16f, 59.90f);
        System.out.println("El precio mas iva es de: " +resultado + " pesos");

    }
    static float getIva(float iva, float precio){
        return precio * iva;
    }
}
