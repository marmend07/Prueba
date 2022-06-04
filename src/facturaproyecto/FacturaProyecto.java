package facturaproyecto;
import java.util.Scanner;
/**
 *
 * @author marme
 */
public class FacturaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Prod=new Scanner(System.in);
        String Nombre;
        double Precio;
        int Cantidad;
        double SubTotal;
        double Total;
        double Total2;
        double Impuesto;
        double IGV=0.13;
        double Descuento=0.5;
        System.out.println("Que producto desea coomprar?");
        Nombre=Prod.next();
        System.out.println("Cual es el precio unitario del producto: "+Nombre+" desea llevar?");
        Precio=Prod.nextDouble();
        System.out.println("Cuantas unidades del producto: "+Nombre+" desea llevar?");
        Cantidad=Prod.nextInt();
        SubTotal=Precio*Cantidad;
        Impuesto=SubTotal*IGV;
        Total=SubTotal+Impuesto;
        if(Total>20000){
            Total2=Total*Descuento+(Total);
            System.out.println("----------FACTURA SUPER----------"
                    + "\nProductos: "+Nombre
                    +"\nPrecio: "+Precio
                    + "\nCantidad comprada: "+Cantidad
                    + "\nSubTotal: "+SubTotal
                    + "\nImpuesto: "+Impuesto
                    + "\nTotal: "+Total
                    + "\nDescuento: "+Descuento
                    + "\nTotal a pagar: "+Total2);
        }else{
            System.out.println("----------FACTURA SUPER----------"
                    + "\nProductos: "+Nombre
                    +"\nPrecio: "+Precio
                    + "\nCantidad comprada: "+Cantidad
                    + "\nSubTotal: "+SubTotal
                    + "\nImpuesto: "+Impuesto
                    + "\nTotal: "+Total
                );
        }
    }
    
}
