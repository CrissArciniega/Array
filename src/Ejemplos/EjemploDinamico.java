package Ejemplos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjemploDinamico {
    
    public static void main(String[] args) {
        listaDinamica(); // Llama al método listaDinamica al iniciar el programa
    }

    private static void listaDinamica() {
        ArrayList<String> lista = new ArrayList<String>(); // Crea una lista dinámica para almacenar Strings

        char respuesta; // Declara una variable para almacenar la respuesta del usuario

        do {
            lista.add(JOptionPane.showInputDialog("Ingresa un valor")); // Agrega un valor ingresado por el usuario a la lista
            respuesta = JOptionPane.showInputDialog("Quieres agregar mas datos s/n?").charAt(0); // Pregunta al usuario si desea agregar más datos y guarda la respuesta

        } while (respuesta == 's' || respuesta == 'S'); // Continúa preguntando mientras la respuesta sea 's' o 'S'

        System.out.println("Resultados de la lista dinamica"); // Imprime un mensaje indicando que se mostrarán los resultados

        for (int i = 0; i < lista.size(); i++) { // Itera sobre la lista dinámica
            System.out.println(lista.get(i)); // Imprime cada elemento de la list
        }
    }
}

/*size(): almacena y devuelve los números presententes dentro de una estructura de datos.*/