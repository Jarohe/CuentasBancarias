package modeloBancario;

public class CuentaAhorro extends Cuenta {
    
    protected double interesVariable;
    protected double saldoMinimo;
    
    
    public CuentaAhorro(int numeroDeCuenta, float saldo, double interesVariable, Cliente c, double saldoMinimo) {
        super(numeroDeCuenta,saldo-interesVariable,c);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }
    
    public void retirar(double cantidad) {
        if(super.getSaldo() >= this.saldoMinimo) {
            setSaldo(getSaldo()-cantidad);
        }
        
    }
    public double actualizarSaldo() {
        return super.getSaldo();
    }
    
    
}
