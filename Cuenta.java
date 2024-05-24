public abstract class Cuenta{
    private Str numero;
    protected double saldo;
    
    public Cuenta(String numero){
        this.numero = numero;
        saldo = 0;
    }
    public double getsaldo(){
        return saldo;
    }

    public String getnumero(){
        return numero;
    }

    public void consignar(double cantidad){
        saldo += cantidad;
    }

    public abstract boolean retirar (double cantidad);
}