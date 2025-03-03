
package Ejercicio1;

public class Notas {
    double[] listaNotas; /* Atributo que identifica un array de notas de
    tipo double */
    /**
    * Constructor de la clase Notas, instancia un array con 5 notas de
    * tipo double
    */
    public Notas() {
        listaNotas = new double[5]; // Crea un array de 5 notas
    }
    /**
    * Método que calcula el promedio de notas
    * @return El promedio de notas calculado
    */
    double calcularPromedio() {
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            suma = suma + listaNotas[i]; // Suma las notas del array
        }
        return (suma / listaNotas.length);
    }
    /**
    * Método que calcula la desviación estándar del array de notas
    * @return La desviación estándar del array de notas
    */
    double calcularDesviación() {
        double prom = calcularPromedio(); /* Invoca el método para
        calcular el promedio */
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
            // Aplica fórmula para la sumatoria de elementos
            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); /* Retorna el cálculo
        final de la desviación */
    }
    /**
    * Método que calcula el valor menor del array de notas
    * @return El valor menor del array de notas
    */
    double calcularMenor() {
        double menor = listaNotas[0]; /* Define una variable como la
        nota menor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] < menor) {
                /* Si un elemento del array es menor que el menor actual,
                se actualiza su valor */
                menor = listaNotas[i];
            }
        }
        return menor;
    }
    /**
    * Método que calcula el valor mayor del array de notas
    * @return El valor mayor del array de notas
    */
    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la
        nota mayor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] > mayor) {
            /* Si un elemento del array es mayor que el mayor actual,
            se actualiza su valor */
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
