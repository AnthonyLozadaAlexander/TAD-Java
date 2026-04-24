package E3;

public class cuentaAhorros implements cuentaBancariaTAD {

    private double saldo;

    public cuentaAhorros(double saldo){
        this.saldo = saldo;
    }

    @Override
    public double depositar(double monto) {
        if(monto <= 0){
            throw new RuntimeException("Monto no valido");
        }

        return saldo = saldo + monto;
    }

    @Override
    public boolean retirar(double monto) {
        if(monto <= 0){
            throw new RuntimeException("Monto no valido");
        }
        if(monto > saldo){
            throw new RuntimeException("Saldo insuficiente");
        }

        saldo = saldo - monto;
        return true;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
