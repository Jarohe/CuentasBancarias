package modeloBancario;

public abstract class Cuenta {
    
   protected int numeroDeCuenta;
   protected double saldo;
   protected Cliente titular;
   
   public Cuenta(){
       
       this.titular = null;
       this.saldo = 0;
       this.numeroDeCuenta = 0;
   }
   
   public Cuenta (int numeroDeCuenta, double saldo, Cliente titular) {
       this.numeroDeCuenta = numeroDeCuenta;
       this.saldo = saldo;
       this.titular = titular;
       }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
        
    }
    public Cliente getTitular() {
        return titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void ingresar(double cantidadAIngresar) {
        this.saldo += cantidadAIngresar;
    }
    
    public abstract void retirar(double cantidad);
    public abstract double actualizarSaldo();

    }
