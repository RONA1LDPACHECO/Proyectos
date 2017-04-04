package paquete01;

import javax.swing.JOptionPane;

public class ejercicio01 
{
    public static void main(String[] args)
    {
        int año_actual,año_nacimiento;
        int edad;
        año_actual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año Actual"));
        año_nacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año en que Nacio"));
        edad=año_actual-año_nacimiento;
        JOptionPane.showConfirmDialog(null,"Su edad es: "+edad);
    }
}
