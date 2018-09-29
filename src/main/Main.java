
package main;

import Controlador.Controladores;
import Modelos.Modelos;
import Vistas.Vista;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IComponentes MVC.
        Modelos modelblocnotas = new Modelos();
        Vista viewblocnotas = new Vista();
        Controladores ontrollerblocnotas = new Controladores(modelblocnotas, viewblocnotas); 
        
    }
    
}
