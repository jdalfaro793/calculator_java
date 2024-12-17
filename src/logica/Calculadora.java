package logica;
 
public class Calculadora {
    private int n1 = 0;  
    private int n2 = 0;  
    private int resultado = 0;
    private boolean segundoOperando = false; 

   
    public void agregarDigito(int digito) {
        if (!segundoOperando) {
            n1 = (n1 * 10) + digito;
        } else {
            n2 = (n2 * 10) + digito;
        }
    }

    public void realizarOperacion(String operador) {
        switch (operador) {
            case "+" -> resultado = n1 + n2;
            case "-" -> resultado = n1 - n2;
            case "*" -> resultado = n1 * n2;
            case "/" -> {
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    throw new ArithmeticException("División por cero no permitida");
                }
            }
            default -> throw new IllegalArgumentException("Operador no válido");
        }
        // Resetear los operandos
        n1 = resultado;
        n2 = 0;
        segundoOperando = false;
    }

   
    public void iniciarSegundoOperando() {
        segundoOperando = true;
    }

    public void reiniciar() {
        n1 = 0;
        n2 = 0;
        resultado = 0;
        segundoOperando = false;
    }

    
    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getResultado() {
        return resultado;
    }
}
