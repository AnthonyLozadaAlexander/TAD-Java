package E2;

public class PilaConArreglo implements PilaTAD{

    private int[] datos;
    private int tope;

    public PilaConArreglo(int capacidad){
        datos = new int[capacidad];
        tope = -1;
    }


    @Override
    public void apilar(int elemento) {
        if(tope == datos.length - 1){
            System.out.println("Error: Pila Llena");
            return;
        }
        tope++;
        datos[tope] = elemento;
    }

    @Override
    public int desapilar() {
        if(estaVacio()){
            System.out.println("Error: Pila Vacia");
            return -1;
        }
        int elementoArriba = datos[tope];
        tope--;
        return elementoArriba;
    }

    @Override
    public boolean estaVacio() {
        return tope == -1;
    }
}
