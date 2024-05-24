public class CuentaAhorros extends Cuenta implements Rentable {
    private double interes;
    public CuentaAhorros (String numero, double interes){
        super(numero);
        this.interes = interes;
    }
    public boolean retirar(double cantidad){
        if (saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public double consultarSaldo(){
        return saldo;
    }
    public double calcularIntereses(){
        return saldo * interes;
    }
}