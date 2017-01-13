package modeloBancario;

public class CuentaCorriente extends Cuenta {
    
    protected static final double INTERES_FIJO = 0.15;
    
    public CuentaCorriente(int numeroDeCuenta, double saldo, Cliente titular){
        super(numeroDeCuenta, saldo - INTERES_FIJO, titular);
        //super.setSaldo(super.getSaldo()-interesFijo);
        }


    public void retirar(double cantidad) {
        if(super.getSaldo() > 0 && cantidad <= super.getSaldo()) {
            super.setSaldo(super.getSaldo()-cantidad);
        }
        
    }
    public double actualizarSaldo() {
        return getSaldo();
    }

}
