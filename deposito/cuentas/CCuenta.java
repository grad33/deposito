package cuentas;

/**
 * 
 * @author Grzegorz Artur Dryka
 * @version 1.1402
 * 
 * Aqui se define la clase CCuenta y permite acceder a informacion de cada cuenta
 * por medio de los metodos: estado, ingresar, retirar.
 * 
 */

public class CCuenta {

	
/**	
*	es el nombre de la cuenta
*/
	protected String nombre;
/**
* 	codigo de la cuenta  
*/
	protected String cuenta;
/**
 *	saldo de la cuenta  
 */
	protected double saldo;
/**	
*	 tipo del interes (sin uso en esta version)	
*/
	protected double tipoInters;
	
	/**
	 * Constructor
	 * 
	 * @param nombre 
	 * @param cuenta 
	 * @param saldo 
	 * @param tipoInters
	 */
	
    protected CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    protected String cadena() {
    	String str=("nom"+","+"cue");
    	return str;
    }
    /**
     * sin uso de momento
     * @return str (string)
     */
    
    
/** saca el saldo actual*/
    protected double estado()
    {
        return saldo;
    }
    /**
     * @param cantidad
     * @throws Exception
     */

    
    /** ingresa la cantidad introducida en la cuenta, si es menor a 0 da error*/
    protected void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * @param cantidad
 * @throws Exception si cantidadad<0
 */
    
    
    
    /**
     * retira dinero de la cuenta
     * 
     * @param cantidad
     * @throws Exception si cantidad o estado son < 0
     */
    protected void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

}

