
public class Calculadora
{
    
    
    public String ecuacionCuadratica(int a, int b, int c){
       String res;
       double valor;
       double x1;
       double x2;
       valor = Math.sqrt((b*b) - (4*a*c));
         if(valor > 0){
              x1 = (((-1)*b) + Math.sqrt(valor))/(2*a);
              x2 = (((-1)*b) - Math.sqrt(valor))/(2*a);
              res = "Los valores de X son; x1: "+x1+" y x2: "+x2;
            }else{
                 res = "Numero Imaginario";
                }
       
       return res;
    }
    
    public String ecuacionRecta(Punto p, Punto q){
        int pendiente;
        String res;
        int x1;
        int x2;
        int y1;
        int y2;
        int v1;
        int v2;
        int v3;
        x1 = p.getX();
        y1 = p.getY();
        x2 = q.getX();
        y2 = q.getY();
        pendiente = (y1 - y2)/(x1 - x2);
        v2 = pendiente * ((-1)*x1);
        v3 = v2 + y1;
        v1 = (v2*(-1)) + ((-1)*y1);
        if(pendiente < 0){
              res = "La ecuacion es: "+pendiente*(-1)+"x+y+("+v1+")";
        }else{
              res = "La ecuacion es: "+pendiente+"x-y+("+v3+")";
            }
        return res;
    }
    
    public double cateto(int hipotenusa, int cateto){
       double res;
       res = Math.sqrt((hipotenusa * hipotenusa) - (cateto * cateto));
       return res;
    }
}
