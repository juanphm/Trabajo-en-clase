/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universidaddeantioquiaa;
import java.util.*;

public class Familia {
    public HashMap<String,Persona> personass=new HashMap<String,Persona>();
    public String apellido;
    public Familia(){
    this.apellido = null;
    }
    public Familia(String apellido) {
        this.apellido = apellido;
    }
       
    public String getApellido() {
        return apellido;
    }
}