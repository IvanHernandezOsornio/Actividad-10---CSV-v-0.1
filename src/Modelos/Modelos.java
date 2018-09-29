/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Familia Hernández
 */
public class Modelos {
        private String path = "C:\\Users\\Familia Hernández\\Desktop\\base.csv."; // Variable que almacena la ruta del archivo.

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
    private String message = ""; // Almacena el contenido 

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
    
}