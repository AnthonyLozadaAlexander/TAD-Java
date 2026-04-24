package E1;

public class Main {
    public static void main(String[] args) {
        ContadorTAD contador = new contadorSimple(); // contador = 0;
        contador.incrementar(); // 0 + 1 = 1
        contador.incrementar(); // 1 + 1 = 2

        System.out.println("Valor Del Contador: " + contador.obtenerValor());
    }
}
