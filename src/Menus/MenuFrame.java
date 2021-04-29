
package Menus;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuFrame extends JFrame{
    
    public MenuFrame(){
        
        setBounds(500,300,550,400);
        MenuLamina milamina = new MenuLamina();
        add(milamina);
        setVisible(true);
    }
}

class MenuLamina extends JPanel{
    public MenuLamina(){
        
        JMenuBar mibarra = new JMenuBar(); //Crea barra de herramientas
        
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar Como");
        JMenuItem cortar = new JMenuItem("Cotar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        
        opciones.add(opcion1);
        opciones.add(opcion2);
        archivo.add(guardar);
        archivo.add(guardar_como);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator(); //Divide las opciones del menu
        edicion.add(opciones);
        herramientas.add(generales);
        
        mibarra.add(archivo);
        mibarra.add(edicion);           //Agregamos las opciones a la barra
        mibarra.add(herramientas);
        add(mibarra);   //Agregamos la batra de menu al panel
    }
    
    public static void main(String[] args) {
        new MenuFrame().setVisible(true);
    }
}