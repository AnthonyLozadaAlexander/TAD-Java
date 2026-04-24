package E3;

public interface cuentaBancariaTAD {
    double depositar(double monto);
    boolean retirar(double monto);
    double consultarSaldo();
}
