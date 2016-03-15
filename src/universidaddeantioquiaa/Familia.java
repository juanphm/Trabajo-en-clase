package universidaddeantioquiaa;
public class Familia {
    public Persona padre=new Persona();
    public Persona madre=new Persona();
    public Persona hijo1=new Persona();
    public Persona hijo2=new Persona();
    public String apellido;
    
    public Familia() {
        this.padre = null;
        this.madre = null;
        this.hijo1 = null;
        this.hijo2 = null;
        this.apellido = null;
    }
    public Familia(Persona Padre, Persona madre, Persona hijo1, Persona hijo2, String apellido) {
        this.padre = Padre;
        this.madre = madre;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }
    public String getNpadre() {
        return padre.getNombre();
    }
    public String getNmadre() {
        return madre.getNombre();
    }
    public String getN1() {
        return hijo1.getNombre();
    }
    public String getN2() {
        return hijo2.getNombre();
    }
    
    
    public int getEdadp(){
        return padre.getEdad();
    }
    public int getEdadm(){
        return madre.getEdad();
    }
    public int getEdad1(){
        return hijo1.getEdad();
    }
    public int getEdad2(){
        return hijo2.getEdad();
    }
    
    
    public String getSexo1(){
        return hijo1.getSexo();
    }
    public String getSexo2(){
        return hijo2.getSexo();
    }
    
    public String getParentesco(String a){
        if(a.equals(padre.getNombre())){
            return "Padre";
        }
        else if(a.equals(madre.getNombre())){
            return "Madre";
        }
        else if(a.equals(hijo1.getNombre())){
            return "Primer hijo";
        }
        else {
            return "Segundo hijo";
        }
    }
}