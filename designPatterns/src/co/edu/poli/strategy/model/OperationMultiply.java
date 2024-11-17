package co.edu.poli.strategy.model;

//Clase ConcreteStrategy que proporciona una implementaci�n diferente de una operaci�n matem�tica espec�fica.

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}