public class Bono implements Rentable {
    private double saldo;
    private double interes;

    public void bono(double saldo){
        this.saldo = saldo;
        this.interes = 0.10;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public double calcularIntereses(){
        return saldo * interes;
    }
}