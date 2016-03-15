package universidaddeantioquiaa;

import java.util.*;

public class UniversidadDeAntioquiaa{

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        Familia familias [] = new Familia[5];
        do {
            System.out.println("Desea: ");
            System.out.println("1. Ingresar una nueva familia");
            System.out.println("2. Consultar Familia");
            System.out.println("3. Consultar miembro se familia");
            int a = l.nextInt();
            Familia f = new Familia();
            switch (a) {
                case 1: {
                    String pa, ma, h1, h2, apellido,s1,s2;
                    int edadp,edadm,edad1,edad2,familiaNo;
                    System.out.println("Ingresando familia numero: {1,2,3,4,5}");
                    familiaNo = l.nextInt();
                    System.out.println("Padre: ");
                    pa = l.next();
                    System.out.println("Edad del padre: ");
                    edadp=l.nextInt();
                    System.out.println("Madre: ");
                    ma = l.next();
                    System.out.println("Edad de la madre: ");
                    edadm=l.nextInt();
                    System.out.println("Primer hijo: ");
                    h1 = l.next();
                    System.out.println("Edad del hijo: ");
                    edad1=l.nextInt();
                    System.out.println("Sexo del hijo:(masculino/femenino) ");
                    s1=l.next();
                    System.out.println("Segundo hijo: ");
                    h2 = l.next();
                    System.out.println("Edad del hijo: ");
                    edad2=l.nextInt();
                    System.out.println("Sexo del hijo:(masculino/femenino) ");
                    s2=l.next();
                    System.out.println("Apellido: ");
                    apellido = l.next();
                    Persona padre =new Persona(pa,"masculino",edadp,apellido);
                    Persona madre =new Persona(ma,"femenino",edadm,apellido);
                    Persona hijo1 =new Persona(h1,s1,edad1,apellido);
                    Persona hijo2 =new Persona(h2,s2,edad2,apellido);
                    familias[familiaNo-1] = new Familia(padre, madre, hijo1, hijo2, apellido);                    
                    System.out.println("Nueva familia asignada");
                    break;
                }
                case 2: {
                    String ap;
                    System.out.println("Ingrese el apellido que desea buscar: ");
                    ap = l.next();
                    
                    for(int i = 0; i<5; i++)
                    {
                    if(ap.equals(familias[i].apellido)){
                        System.out.println("Padre: "+ familias[i].padre.nombre);
                        System.out.println("sexo: Masculino\nEdad: "+familias[i].padre.edad);
                        System.out.println("Madre: "+familias[i].madre.nombre);
                        System.out.println("sexo: Femenino\nEdad: "+familias[i].madre.edad);
                        System.out.println("Primer hijo: "+familias[i].hijo1.nombre);
                        System.out.println("sexo:"+familias[i].hijo1.sexo+"\nEdad: "+familias[i].hijo1.edad);
                        System.out.println("Segundo hijo: "+familias[i].hijo2.nombre);
                        System.out.println("sexo:"+familias[i].hijo2.sexo+"\nEdad: "+familias[i].hijo2.edad);
                    }
                    else{System.out.println("Apellido no encontrado");}
                }
                break;
                }
                case 3: {
                    String no;
                    System.out.println("Ingrese el nombre que desea buscar: ");
                    no=l.next();
                    for(int i = 0; i<5; i++)
                    {
                    if(no.equals(familias[i].padre.nombre)){
                        System.out.println("Es el padre.    Su apellido es: "+familias[i].apellido);
                        System.out.println("Su edad es: "+familias[i].padre.edad);
                        System.out.println("Su sexo es: Masculino");                      
                            System.out.println("Esposa: "+familias[i].madre.nombre);
                            System.out.println("sexo: Femenino\nEdad: "+familias[i].madre.edad);
                            System.out.println("Primer hijo: "+familias[i].hijo1.nombre);
                            System.out.println("sexo:"+familias[i].hijo1.sexo+"\nEdad: "+familias[i].hijo1.edad);
                            System.out.println("Segundo hijo: "+familias[i].hijo2.nombre);
                            System.out.println("sexo:"+familias[i].hijo2.sexo+"\nEdad: "+familias[i].hijo2.edad);
                        }
                    else if(no.equals(familias[i].madre.nombre)){
                      System.out.println("Es la madre.  Su apellido es: "+familias[i].apellido);
                        System.out.println("Su edad es: "+familias[i].madre.edad);
                        System.out.println("Su sexo es: Femenino");                      
                            System.out.println("Esposo: "+familias[i].padre.nombre);
                            System.out.println("sexo: Masculino\nEdad: "+familias[i].padre.edad);
                            System.out.println("Primer hijo: "+familias[i].hijo1.nombre);
                            System.out.println("sexo:"+familias[i].hijo1.sexo+"\nEdad: "+familias[i].hijo1.edad);
                            System.out.println("Segundo hijo: "+familias[i].hijo2.nombre);
                            System.out.println("sexo:"+familias[i].hijo2.sexo+"\nEdad: "+familias[i].hijo2.edad);
                        }
                    else if(no.equals(familias[i].hijo1.nombre)){
                      System.out.println("Es un hijo.  Su apellido es: "+familias[i].apellido);
                        System.out.println("Su edad es: "+familias[i].hijo1.edad);
                        System.out.println("Su sexo es: "+ familias[i].hijo1.sexo );                      
                            System.out.println("Padre: "+familias[i].padre.nombre);
                            System.out.println("sexo: Masculino"+"\nEdad: "+familias[i].padre.edad);
                            System.out.println("Madre: "+familias[i].madre.nombre);
                            System.out.println("sexo:Femenino"+"\nEdad: "+familias[i].madre.edad);
                            System.out.println("Segundo hijo: "+familias[i].hijo2.nombre);
                            System.out.println("sexo:"+familias[i].hijo2.sexo+"\nEdad: "+familias[i].hijo2.edad);
                        }
                    else if(no.equals(familias[i].hijo2.nombre)){
                      System.out.println("Es un hijo.  Su apellido es: "+familias[i].apellido);
                        System.out.println("Su edad es: "+familias[i].hijo2.edad);
                        System.out.println("Su sexo es: "+ familias[i].hijo2.sexo );                      
                            System.out.println("Padre: "+familias[i].padre.nombre);
                            System.out.println("sexo: Masculino"+"\nEdad: "+familias[i].padre.edad);
                            System.out.println("Madre: "+familias[i].madre.nombre);
                            System.out.println("sexo:Femenino"+"\nEdad: "+familias[i].madre.edad);
                            System.out.println("Segundo hijo: "+familias[i].hijo1.nombre);
                            System.out.println("sexo:"+familias[i].hijo1.sexo+"\nEdad: "+familias[i].hijo1.edad);
                        }
                    
                    else 
                    {
                        System.out.println("Persona no encontrada");
                    }
                }
                    break;
                }
            }

        } while (true);
    }
}
