/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto3;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Proyecto3 {
    public static void main(String[] args) {
        
        int opcion = 0;
        String nombre;
        String genero = "";
        Arbol arbcreado = new Arbol();
        arbcreado.insertar("Carlos", "M");
        arbcreado.insertar("Maria", "F");
        arbcreado.insertar("Ana", "F");
        arbcreado.insertar("Jorge", "M");
        arbcreado.insertar("Luis", "M");
        arbcreado.insertar("Alicia", "F");
        arbcreado.insertar("Andres", "M");
      
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo\n"
                        + "2. Recorrer el árbol INORDEN\n"
                        + "3. Recorrer el árbol POSTORDEN\n"
                        + "4. Recorrer el árbol PREORDEN\n"
                        + "5. Mostrar progenitores femeninos de Carlos\n"
                        + "6. Salir \n"
                        + "Elija una opción: "));
                switch (opcion) {
                    case 1:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Mujer\n"
                                + "2. Hombre\n"
                                + "Elija una opción: "));
                        if (opcion == 1) {
                            genero = "F";
                        }
                        if (opcion == 2) {
                            genero = "M";
                        }
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nodo");
                        arbcreado.insertar(nombre, genero);
                        break;
                    case 2:
                        System.out.println("Recorriendo inorden:");
                        arbcreado.inorden();
                        break;

                    case 3:
                        System.out.println("Recorriendo postorden:");
                        arbcreado.postorden();
                        break;

                    case 4:
                        System.out.println("Recorriendo preorden:");
                        arbcreado.preorden();
                        break;

                    case 5:
                        System.out.println("Progenitores Mujeres: ");
                        arbcreado.BMujeres();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                        break;

                }
            } catch (NumberFormatException n) {
                if ("null".equals(n.getMessage())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                }
            }
        } while (opcion != 6);
    }
}
