package co.edu.poli.templatemethod.model;

public class PizzaHawaiana extends Pizza {
    // Implementaci�n espec�fica de agregarIngredientes para PizzaHawaiana
	@Override
    protected void agregarIngredientes() {
        System.out.println("Agregando jam�n, pi�a y queso...");
    }
}
