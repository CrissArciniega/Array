package EjemploObjetoClases;
public class Principal {
 
    public static void main(String[] args) {
        /*SINTAXIS
        NOMBRE CLASE + NOMBRE ASIGNADO + [] = NEW + NOMBRE CLASE + [DIMENSIÓN]*/
    Persona listadoPersona[]=new Persona[3];
    
    listadoPersona[0]=new Persona("Juan", 19, 1.67);
    listadoPersona[1]=new Persona("Maria", 20, 1.50);
    listadoPersona[2]=new Persona("Pedro", 10, 1.40);
    
    for (int i = 0; i < listadoPersona.length; i++) {
        System.out.println("Nombre: " + listadoPersona[i].getNombre() +
                           ", Edad: " + listadoPersona[i].getEdad() +
                           ", Altura: " + listadoPersona[i].getAltura());
    }
    
  }
}
