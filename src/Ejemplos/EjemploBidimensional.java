package Ejemplos;
public class EjemploBidimensional {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

// Inicialización de la matriz con valores específicos
matriz[0][0] = 1; // Asigna el valor 1 a la posición [0][0] de la matriz
matriz[0][1] = 2; // Asigna el valor 2 a la posición [0][1] de la matriz
matriz[0][2] = 3; // Asigna el valor 3 a la posición [0][2] de la matriz
matriz[0][3] = 4; // Asigna el valor 4 a la posición [0][3] de la matriz
matriz[1][0] = 5; // Asigna el valor 5 a la posición [1][0] de la matriz


// Inicialización de la matriz con bucles
for (int i = 0; i < matriz.length; i++) { // Bucle para iterar sobre las filas de la matriz
    for (int j = 0; j < matriz[i].length; j++) { // Bucle para iterar sobre las columnas de cada fila
        matriz[i][j] = (i * matriz[i].length) + j + 1; // Asigna valores secuenciales a la matriz
    }
}

// Imprimir la matriz
for (int i = 0; i < matriz.length; i++) { // Bucle para iterar sobre las filas de la matriz
    for (int j = 0; j < matriz[i].length; j++) { // Bucle para iterar sobre las columnas de cada fila
        System.out.print(matriz[i][j] + " "); // Imprime el valor de cada posición de la matriz
    }
    System.out.println(); // Imprime una nueva línea después de cada fila
}    
}
    }
