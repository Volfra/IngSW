package co.edu.poli.templatemethod.model;

public class PizzaPepperoni extends Pizza {
    // Implementaci�n espec�fica de agregarIngredientes para PizzaPepperoni
	@Override
    protected void agregarIngredientes() {
        System.out.println("Agregando pepperoni y queso...");
    }
}