package co.edu.poli.strategy.model;

//Contiene una referencia a una instancia de la interfaz Strategy. 
//Esta clase utiliza la estrategia seleccionada por el usuario para realizar el c�lculo.

public class Context {
	
	private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
    
    //permite la modificaci�n de la estrategia en tiempo de ejecuci�n a trav�s del m�todo
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
