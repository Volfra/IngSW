package co.edu.poli.strategy.model;

//Contiene un m�todo llamado doOperation que ser� implementado por cada clase ConcreteStrategy. 
//Define una �nica operaci�n matem�tica que se puede realizar.

public interface Strategy {
	
	 int doOperation(int num1, int num2);

}
	