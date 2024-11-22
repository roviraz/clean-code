public class circulosRadiosEsIgual {
    //Ejercicio para comprobar si el área de dos círculos dados sus radios es igual
    public static void main(String[] args) {
        double primerCirculo = 3.0;
        double segundoCiurulo = 3.0;
        boolean igual = calcular(primerCirculo, segundoCiurulo);
       System.out.println(igual);
    }

    private static boolean calcular(double primerCirculo, double segundoCiurulo) {
        return Math.PI * primerCirculo * primerCirculo == Math.PI * segundoCiurulo * segundoCiurulo;
    }
}
//He quitado el if ya que el boolean igual te da la solucion.
//He cambiado el nombre de las variables que no se entendían.