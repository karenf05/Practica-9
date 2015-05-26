import javax.swing.JOptionPane;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
	public static void main (String[] args)
	{ 
 
        int operacion=0, numero1=0, numero2=0; 
        String valor; 
        Calculadora calculadora = Calculadora.getInstance(); 
 
        do
        {
            operacion = JOptionPane.showConfirmDialog(null,"Desea ingresar dos numeros y mostrar el resultado de las 4 operaciones basicas?");
            if(operacion == JOptionPane.YES_OPTION)
            {
                valor = JOptionPane.showInputDialog(null, "Ingrese numero1: ");
                if(calculadora.isNum(valor))
                {
                    numero1 = Integer.parseInt(valor);
                    valor = JOptionPane.showInputDialog(null, "Ingrese numero2: ");
 
                    if(calculadora.isNum(valor))
                    {
                        numero2 = Integer.parseInt(valor);
                        JOptionPane.showMessageDialog(null, "La suma es: "+calculadora.suma(numero1, numero2)
                                                   +" La resta es: "+calculadora.resta(numero1, numero2)
                                                   +" La multiplicacion es: "+calculadora.multiplicacion(numero1, numero2)
                                                   +" La division es: "+calculadora.division(numero1, numero2));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Ingrese un numero","Error !!!", JOptionPane.WARNING_MESSAGE);
                    }
                } 
                else
                {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero","Error !!!", JOptionPane.WARNING_MESSAGE);
                }                     
            }
 
            else if(operacion == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Si desea terminar la aplicacion elige Cancelar.","Advertencia !!!" ,JOptionPane.WARNING_MESSAGE);
            }
 
        }while(operacion!= JOptionPane.CANCEL_OPTION);
 
        System.exit(0);
 
    }  
}
