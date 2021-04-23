
public class Matematico
{
    private Calculadora calculadora;
    
    public Matematico(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    public void setCalculadora(Calculadora cal){
        calculadora = cal;
    }
    
    
    public String ecuacionRec(Punto a, Punto b){
      return calculadora.ecuacionRecta(a, b);
    }
    
    public String ecuacionCuadr(int a, int b, int c){
      return calculadora.ecuacionCuadratica(a, b, c);
    }
    
    public double calcularCateto(int hip, int cat){
       return calculadora.cateto(hip, cat);
    }
}
