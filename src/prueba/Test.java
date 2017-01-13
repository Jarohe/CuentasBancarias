package prueba;
import modeloBancario.*;

public class Test {
    
    public static void main(String[] args) {
	    // Crear cliente
	    Cliente c = new Cliente(0, "Javier", "calle", "616558899");
	    // Crear cuenta corriente
	    CuentaCorriente cc = new CuentaCorriente(000000, 1500, c);
	    // Retirar dinero
	    cc.retirar(1000);
	    // Actualizar cuenta
	    System.out.println("Saldo: "+cc.actualizarSaldo()+" euros");
	    
	    
	    // Crear Cuenta de ahorro
	    CuentaAhorro ca = new CuentaAhorro(000011, 2000, 0.1, new Cliente(1, "Antonio", "ronda", "696665478"), 1000);
	    // Retirar dinero
	    ca.retirar(100);
	    // Actualizar cuenta
	    System.out.println("Saldo: "+ca.actualizarSaldo()+" euros");
    }
    
}
