public class Calculadora {

    public double somarDoisNumeros(double a, double b){
        return a+b;
    }

    public double subtrairDoisNumeros(double a, double b){
        return a-b;
    }

    public double multiplicarDoisNumeros(double a, double b){
        return a*b;
    }

    public double dividirDoisNumeros(double numerador, double denominador){
        if (denominador==0){
            return -1;
        }
        return numerador/denominador;
    }
}
