
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    private static Calculadora calculadora;
    public static synchronized Calculadora getInstance() 
    {
           if (calculadora == null)
           {
               calculadora = new Calculadora();
           }
           return calculadora;
     }
     private Calculadora()
     {
     }
	public int suma(int n1, int n2)
	{
        int op; 
        op = n1 + n2; 
        return op; 
    } 
 
    public int resta (int n1, int n2)
    { 
        int op; 
        op = n1 - n2; 
        return op; 
    }
 
    public int multiplicacion(int n1, int n2)
    { 
        int op; 
        op = n1 * n2; 
        return op; 
    } 
 
    public int division(int n1, int n2)
    { 
        int op; 
        op = n1 / n2; 
        return op; 
    }
 
    public boolean isNum(String n)
    {
        int a;
        try{  
            a = Integer.parseInt(n);     
            return true; 
        } 
        catch(NumberFormatException e){ 
            return false; 
        }
    }
}
