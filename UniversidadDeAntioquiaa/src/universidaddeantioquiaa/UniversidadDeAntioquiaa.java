package universidaddeantioquiaa;

import java.util.*;

public class UniversidadDeAntioquiaa {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int h;
        HashMap<String, Familia> familias = new HashMap<>();
        HashMap<String, Persona> personas = new HashMap<String, Persona>();
        do {
            System.out.println("Desea: ");
            System.out.println("1. Ingresar una nueva familia");
            System.out.println("2. Consultar Familia");
            System.out.println("3. Consultar miembro de una familia");
            int a = l.nextInt();
            Familia f = new Familia();
            switch (a) {
                case 1: {
                    Familia familian = new Familia();
                    String apellido, nombre, sexo;
                    int edad, n;
                    System.out.println("Cuantas personas tiene la familia");
                    n = l.nextInt();
                    System.out.println("Apellido: ");
                    apellido = l.next();
                    familian.apellido = apellido;
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nombre: ");
                        nombre = l.next();
                        System.out.println("Edad: ");
                        edad = l.nextInt();
                        System.out.println("Sexo:(masculino/femenino");
                        sexo = l.next();
                        Persona persona = new Persona(nombre, sexo, edad, apellido);
                        personas.put(nombre, persona);
                       familian.personass.put(nombre, persona);
                    }
                    familias.put(familian.getApellido(), familian);
                    //System.out.println(familian.getApellido());
                    System.out.println("Nueva familia asignada");
                    break;
                }
                case 2: {
                    String ap;
                    System.out.println("Ingrese el apellido que desea buscar: ");
                    ap = l.next();
                    Familia x = familias.get(ap);

                    if (x != null) {
                        for (Persona n : x.personass.values()) {
                            System.out.println("Nombre: " + n.getNombre());
                            System.out.println("sexo:" + n.getSexo() + "\nEdad: " + n.getEdad());
                        }
                    } else if (x == null) {
                        System.out.println("apellido no encontrada");
                    }
                    break;
                }
                case 3: {
                    String no;
                    System.out.println("Ingrese el nombre que desea buscar: ");
                    no = l.next();
                    Persona y = personas.get(no);
                    Familia z = familias.get(y.getApellido());
                    if (y != null) {
                        for (Persona n : z.personass.values()) {
                            System.out.println("Nombre: " + n.getNombre());
                            System.out.println("sexo:" + n.getSexo() + "\nEdad: " + n.getEdad());
                        }
                    } else {
                        System.out.println("Persona no encontrada");
                    }
                    break;
                }
            }
            System.out.println("presione 1 para continuar con el programa o 2 para salir...");
            h = l.nextInt();
        } while (h == 1);
    }
}
