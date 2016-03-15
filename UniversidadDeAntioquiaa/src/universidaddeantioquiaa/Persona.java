package universidaddeantioquiaa;

/**
 *
 * @author Juan Carlos Camargo, Vanessa Herrera, Luis Carlos Diaz, Juan Pablo Huertas Mendez
 * 
 * 
 */
public class Persona {
    public String nombre;
    public String sexo;
    public int edad;
    public String apellido;
    java.util.Scanner l=new java.util.Scanner(System.in);
    
    public Persona(String nombre, String sexo, int edad,String apellido) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.apellido=apellido;
    }    

    public Persona() {
        nombre=null;
        sexo=null;
        edad=0;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
}