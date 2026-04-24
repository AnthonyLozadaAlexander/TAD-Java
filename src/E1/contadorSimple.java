package E1;

public class contadorSimple implements ContadorTAD{

    private int valor;

    public contadorSimple(){
        this.valor = 0;
    }

    @Override
    public void incrementar(){
        valor++;
    }

    @Override
    public void decrementar(){
        valor--;
    }

    @Override
    public int obtenerValor(){
        return valor;
    }
}
