package E3;

public interface CuentaBancariaTAD {
    double depositar(double monto);
    boolean retirar(double monto);
    double consultarSaldo(double monto);
}
