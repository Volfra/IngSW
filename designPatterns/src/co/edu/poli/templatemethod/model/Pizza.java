package co.edu.poli.templatemethod.model;

public abstract class Pizza  {

// M�todo abstracto que define la estructura general de la pizza
	public final void prepararPizza() {
	    prepararMasa();
	    agregarSalsa();
	    agregarIngredientes();
	    hornearPizza();
	}
	
// M�todos concretos sobrescritos por las subclases
	protected void prepararMasa() {
	    System.out.println("Preparando masa...");
	}
	
	protected void agregarSalsa() {
	    System.out.println("Agregando salsa...");
	}
	
// M�todo abstracto que debe ser implementado por las subclases
	protected abstract void agregarIngredientes();
	
	protected void hornearPizza() {
	    System.out.println("Horneando pizza...");
	}
}