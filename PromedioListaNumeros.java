public class PromedioListaNumeros {
    //Ejercicio para calcular el promedio de una lista de números dada e imprimirlo por pantalla
        public static void main(String[] args) {
        double[] listaNumeros = {4, 5, 6, 7};
        double promedio = 0;
        double sumatotal = 0;
        for (double numero : listaNumeros) {
            sumatotal += numero;
        }
        promedio = sumatotal / listaNumeros.length;
        System.out.println("Promedio: " + promedio);
    }
}
//He cambiado nombre de las variables
//He cambiado el nombre de la clase
//He inicializado una variable llamada sumatotal para guardar el total y luego calcular el promedio.
// He desinicializado la variable de promedio de abajo, ya que se inicializaba 2 veces.