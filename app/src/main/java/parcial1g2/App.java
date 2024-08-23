package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        try {
            int cantidadVehiculos = 0;
            String decada = "";
            int avaluo = 0;

            double impuestoRodamiento = 0;
            double seguro = 0;
            double valorFinal = 0;

            System.out.println("¿Cuantos vehiculos desea calcular: ");
            cantidadVehiculos = sc.nextInt();
            sc.nextLine();

                
                for(int i = 1; cantidadVehiculos > i; i++){

                    System.out.println("Cual es la decada del modelo del carro? (90, 00, 10, 20, otra) ");
                    decada = sc.nextLine();

                    System.out.println("Ingrese el valor del avaluo $: ");
                    avaluo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Valor de taza de seguro: " + seguro );
                    System.out.println("Valor de impuesto de rodamiento: " + impuestoRodamiento);
                    System.out.println("Valor total a pagar: " + valorFinal);

                    seguro = calcularTotalseguro(seguro, avaluo);
                    impuestoRodamiento = calcularTotalImpuestos(decada, avaluo);
                    valorFinal = impuestoRodamiento + seguro;
                    
    
                }

               


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }



        // Logica de solución

    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
        public static int calcularTotalImpuestos(String modelo, int avaluo){

            try {

                int impuestoFinal = 0;

                    switch (modelo) {
                        case "90":
                            impuestoFinal = avaluo * 0.0409;
                            break;

                        case "00":
                            impuestoFinal = avaluo * 0.0434;
                            break;

                        case  "10":
                            impuestoFinal = avaluo * 0.0493;
                            break;

                        case  "20":
                            impuestoFinal = avaluo * 0.05680;
                            break;

                        default: 
                            impuestoFinal = 0;
                            break;
                    }
                

                return impuestoFinal;
            } catch (Exception e) {
                return -1;
            }



        }
    //------------------------------------------------------------------
        
        public static int calcularTotalseguro(double seguro, int avaluo){

            try {

                int valorSeguro = 0;

                switch (seguro) {
                    case "90":
                        seguro = avaluo * 0.816;
                        break;

                    case "00":
                        seguro = avaluo * 0.798;
                        break;

                    case  "10":
                        seguro = avaluo * 0.712;
                        break;

                    case  "20":
                        seguro = avaluo * 0.699;
                        break;

                    default: 
                        seguro = 0;
                        break;
                }
                


                return valorSeguro;
            } catch (Exception e) {
                return -1;
            }



        }
}
