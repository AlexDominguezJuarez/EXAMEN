import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        //VARIABLES
        Scanner in=new Scanner(System.in);
        int eleccion_menu=0;

       //VARIABLES PARTE 1
        int numero_de_notas;
        int calificacion_examen=0;
        int examen_aprobado=0;
        int examen_suspendido=0;
        //VARIABLES PARTE 2

        int numero_de_viajeros=3;
        String nombre_pasajero;
        int edad_pasajero;
        int precio=0;
        int cantidad_a_pagar=0;
        String sobrante; //PARA QUE EL ESCANNER NO DETECTE EL INTRO

        //MENU
        System.out.println("BIENVENIDO AL MENU DE OPCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("INTRODUZCA 1 PARA SABER SI HAY MAS EXAMENES SUSPENDIDOS O APROBADOS");
        System.out.println("INTRODUZCA 2 PARA COMPRAR BILLETES A MADRID");
        System.out.println("INTRODUZCA 3 PARA SALIR DEL MENÚ");
        eleccion_menu=in.nextInt();
        switch (eleccion_menu){
            case 1:
                System.out.println("HAS SELECCIONADO LA OPCION 1");
                System.out.println("...........................................");
                System.out.println("INTRODUCE LA CANTIDAD DE NOTAS QUE DESEAS CLASIFICAR");
                numero_de_notas=in.nextInt();
                for (int i=0; i<numero_de_notas; i++){ //HE USADO FOR YA QUE TE AHORRAS PONER i++ LUEGO
                    System.out.println("INTRODUCE LA NOTA DEL EXAMEN ");
                    calificacion_examen=in.nextInt();

                    if (calificacion_examen>=5){
                        examen_aprobado++;
                    }
                    if (calificacion_examen<5){
                        examen_suspendido++;
                    }
                }
                if (examen_aprobado<examen_suspendido){
                    System.out.println("...........................................");
                    System.out.println("HAY MAS EXAMENES SUSPENDIDOS QUE APROBADSOS");
                }
                if (examen_aprobado>examen_suspendido){
                    System.out.println("...........................................");
                    System.out.println("HAY MAS EXAMENES APROBADOS QUE SUSPENDIDOS");
                }
                if (examen_aprobado==examen_suspendido){
                    System.out.println("...........................................");
                    System.out.println("HAY LA MISMA CANTIDAD DE EXAMENES APROBADOS QUE SUSPENDIDOS");
                }
                break;

            case 2:
                System.out.println("HAS SELECCIONADO LA OPCION 2");
                System.out.println("...........................................");
                System.out.println("TARIFAS Y DESCUENTOS");
                System.out.println("TARIFA NORMAL: 32€");
                System.out.println("MAYORES DE 65 AÑOS: 10% DE DESCUENTO");
                System.out.println("12-15 AÑOS: 8% DE DESCUENTO");
                System.out.println("4-11 AÑOS: 35% DE DESCUENTO");
                System.out.println("MENORES DE 4 AÑOS: NO PAGAN ");
                System.out.println("...........................................");
                System.out.println("¿CUANTAS PERSONAS VAN A COMPRAR BILLETE? ");
                numero_de_viajeros=in.nextInt();
                sobrante=in.nextLine();

                for (int i=0; i<numero_de_viajeros;i++){ //HE USADO FOR YA QUE TE AHORRAS PONER NUMERO DE VIAJEROS++ LUEGO
                    System.out.println("INTRODUCE EL NOMBRE DEL PASAJERO");
                    nombre_pasajero=in.nextLine();
                    System.out.println("INTRODUCE LA EDAD DEL PASAJERO");
                    edad_pasajero=in.nextInt();
                    sobrante=in.nextLine();
                    if (edad_pasajero>15 && edad_pasajero<65){
                        cantidad_a_pagar=35;
                        precio=precio+35;
                        System.out.println("CANTIDADA A PAGAR DE "+nombre_pasajero+": "+cantidad_a_pagar+"€");
                        System.out.println(""); //NO ES NECESARIO ESTE PRINT, PERO QUEDA MAS ORDENADO A LA HORA DE EJECUTAR EL PROGRAMA
                    }
                    if(edad_pasajero>=65){
                        cantidad_a_pagar=(35-10%35);
                        precio=precio+cantidad_a_pagar;
                        System.out.println("CANTIDADA A PAGAR DE "+nombre_pasajero+": "+cantidad_a_pagar+"€");
                        System.out.println("");
                    }
                    if (edad_pasajero<=15 && edad_pasajero>=12){
                        cantidad_a_pagar=(35-8%35);
                        precio=precio+cantidad_a_pagar;
                        System.out.println("CANTIDADA A PAGAR DE "+nombre_pasajero+": "+cantidad_a_pagar+"€");
                        System.out.println("");
                    }
                    if(edad_pasajero<=11 && edad_pasajero>=4){
                        cantidad_a_pagar=(35-35%35);
                        precio=precio+cantidad_a_pagar;
                        System.out.println("CANTIDADA A PAGAR DE "+nombre_pasajero+": "+cantidad_a_pagar+"€");
                        System.out.println("");
                    }
                    if (edad_pasajero<4){
                        cantidad_a_pagar=0;
                        System.out.println("CANTIDADA A PAGAR DE "+nombre_pasajero+": "+cantidad_a_pagar+"€");
                        System.out.println("");
                    }
                }
                System.out.println("................................................");
                System.out.println("EL PRECIO A PAGAR POR LOS "+ numero_de_viajeros+" BILLETES ES "+precio+"€");

                break;

            case 3:
                System.out.println("¡HASTA LA PROXIMA!");
                break;
        }

    }
}