package E2;

public class MainPila {
    public static void main(String[] args) {
        PilaTAD pila = new PilaConArreglo(5);

        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Desapilando: " + pila.desapilar());
    }
}
