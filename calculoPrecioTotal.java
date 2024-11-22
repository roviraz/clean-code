public class calculoPrecioTotal {
    //Ejercicio para calcular el precio total de la compra dado el precio de los productos y los descuentos e impuestos.
    public static void main(String[] args) {
        double[] precioProductos = {100.0, 50.0, 25.0};
        double impuestos = 0.08; 
        double descuento = 0.1;  
        double precioTotal = 0;
        //iniciamos las variables y el array
        for (double precio : precioProductos) {
            precioTotal= precio * (1 + impuestos) * (1 - descuento);
        }
        // el for para recorrer el array y el precio total se va sumando al precio * impuestos + 1 * 1 - descuento
        System.out.println("Total: " + precioTotal);
    }
}
//He cambiado el nombre de la clase para que se entienda mejor.
// He puesto comentarios.
//El problema de este ejercicio es la mala legibilidad de las variables, por eso las he cambiado.
//He cambiado el nombre de la clase.