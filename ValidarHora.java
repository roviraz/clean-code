public class ValidarHora {
    //Ejercicio para validar la hora dada
    public static void main(String[] args) {
        int hora = 25;
        int minutos = 61;

        if (hora < 0 && hora > 23 && minutos < 0 && minutos > 59) {
            System.out.println("Hora válida");
        } else {
            System.out.println("Hora inválida");
        }
    }
}
//He cambiado el nombre de la clase
//He modificado el if y los system.out.print