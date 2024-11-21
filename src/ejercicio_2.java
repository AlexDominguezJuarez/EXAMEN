import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        // VARIABLES Y ESCANER
        Scanner in=new Scanner(System.in);
        String dia="";
        int  dia_de_la_semana=10;
        int horas;
        int minutos;
        int numero_de_eleccion=0;
        int seguir_calculando=0;
        boolean calcular_hora=true;


        //MENU
        System.out.println("PROGRAMA QUE CALCULA LA DIFERENCIA HORARIA ENTRE JAPON Y ESPAÑA");
        System.out.println("--------------------------------------------------------------------");
        while (calcular_hora==true){

            System.out.println("PULSE 1 SI DESEA CALCULAR LA HORA DE ESPAÑA ESTANDO EN JAPON");
            System.out.println("PULSE 2 SI DESEA CALCULAR LA HORA DE JAPON ESTANDO EN ESPAÑA");
            numero_de_eleccion= in.nextInt();
            switch (numero_de_eleccion) {
                case 1:
                    System.out.println("¿EN QUE DIA DE LA SEMANA DESEA CALCULAR LA HORA?");

                    System.out.println("1. LUNES");
                    System.out.println("2. MARTES");
                    System.out.println("3. MIERCOLES");
                    System.out.println("4. JUEVES");
                    System.out.println("5. VIERNES");
                    System.out.println("6. SABADO");
                    System.out.println("7. DOMINGO");
                    dia_de_la_semana = in.nextInt();


                    System.out.println("INTRODUCE LAS HORAS EN JAPON");
                    horas = in.nextInt();
                    System.out.println("INTRODUCE LOS MINUTOS EN JAPON");
                    minutos = in.nextInt();
                    while (horas > 24 | minutos > 60 | horas < 0 | minutos < 0) {
                        System.out.println("HORA NO VALIDA, INTRODUZCA UNA HORA VALIDA");
                        System.out.println("¿EN QUE DIA DE LA SEMANA DESEA CALCULAR LA HORA?");
                        System.out.println("1. LUNES");
                        System.out.println("2. MARTES");
                        System.out.println("3. MIERCOLES");
                        System.out.println("4. JUEVES");
                        System.out.println("5. VIERNES");
                        System.out.println("6. SABADO");
                        System.out.println("7. DOMINGO");
                        dia_de_la_semana = in.nextInt();

                        System.out.println("INTRODUCE LAS HORAS EN JAPON");
                        horas = in.nextInt();
                        System.out.println("INTRODUCE LOS MINUTOS EN JAPON");
                        minutos = in.nextInt();

                    }
                    horas = horas - 8;
                    if (horas < 0) {
                        horas = horas + 24;
                        dia_de_la_semana--;
                        if (dia_de_la_semana < 1) {
                            dia_de_la_semana = 7;
                        }


                    }
                    switch (dia_de_la_semana) {
                        case 1:
                            dia = "LUNES";
                            break;
                        case 2:
                            dia = "MARTES";
                            break;
                        case 3:
                            dia = "MIERCOLES";
                            break;
                        case 4:
                            dia = "JUEVES";
                            break;
                        case 5:
                            dia = "VIERNES";
                            break;
                        case 6:
                            dia = "SABADO";
                            break;
                        case 7:
                            dia = "DOMINGO";
                            break;
                    }
                    System.out.println("...........................................");
                    System.out.println("HORA EN ESPAÑA:    " + horas + ":" + minutos + " " + dia);
                    System.out.println("...........................................");
                    System.out.println("¿DESEA CALCULAR OTRO CAMBIO DE HORA?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    seguir_calculando = in.nextInt();
                    switch (seguir_calculando) {
                        case 1:
                            calcular_hora = true;
                            System.out.println("--------------------------------------------------------------------");
                            break;
                        case 2:
                            calcular_hora = false;
                            System.out.println("¡HASTA LA PROXIMA!");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("¿EN QUE DIA DE LA SEMANA DESEA CALCULAR LA HORA?");
                    System.out.println("1. LUNES");
                    System.out.println("2. MARTES");
                    System.out.println("3. MIERCOLES");
                    System.out.println("4. JUEVES");
                    System.out.println("5. VIERNES");
                    System.out.println("6. SABADO");
                    System.out.println("7. DOMINGO");
                    dia_de_la_semana = in.nextInt();


                    System.out.println("INTRODUCE LAS HORAS EN ESPAÑA");
                    horas = in.nextInt();
                    System.out.println("INTRODUCE LOS MINUTOS EN ESPAÑA");
                    minutos = in.nextInt();
                    while (horas > 24 | minutos > 60 | horas < 0 | minutos < 0) {
                        System.out.println("HORA NO VALIDA, INTRODUZCA UNA HORA VALIDA");
                        System.out.println("¿EN QUE DIA DE LA SEMANA DESEA CALCULAR LA HORA?");
                        System.out.println("1. LUNES");
                        System.out.println("2. MARTES");
                        System.out.println("3. MIERCOLES");
                        System.out.println("4. JUEVES");
                        System.out.println("5. VIERNES");
                        System.out.println("6. SABADO");
                        System.out.println("7. DOMINGO");
                        dia_de_la_semana = in.nextInt();

                        System.out.println("INTRODUCE LAS HORAS EN ESPAÑA");
                        horas = in.nextInt();
                        System.out.println("INTRODUCE LOS MINUTOS EN ESPAÑA");
                        minutos = in.nextInt();

                    }
                    horas = horas + 8;
                    if (horas > 24) {
                        horas = horas - 24;
                        dia_de_la_semana++;
                        if (dia_de_la_semana > 7) {
                            dia_de_la_semana = 1;
                        }

                    }
                    switch (dia_de_la_semana) {
                        case 1:
                            dia = "LUNES";
                            break;
                        case 2:
                            dia = "MARTES";
                            break;
                        case 3:
                            dia = "MIERCOLES";
                            break;
                        case 4:
                            dia = "JUEVES";
                            break;
                        case 5:
                            dia = "VIERNES";
                            break;
                        case 6:
                            dia = "SABADO";
                            break;
                        case 7:
                            dia = "DOMINGO";
                            break;
                    }
                    System.out.println("...........................................");
                    System.out.println("HORA EN JAPON:    " + horas + ":" + minutos + " " + dia);

                    System.out.println("...........................................");
                    System.out.println("¿DESEA CALCULAR OTRO CAMBIO DE HORA?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    seguir_calculando = in.nextInt();
                    switch (seguir_calculando) {
                        case 1:
                            calcular_hora = true;
                            System.out.println("--------------------------------------------------------------------");
                            break;
                        case 2:
                            calcular_hora = false;
                            System.out.println("¡HASTA LA PROXIMA!");
                            break;
                    }
                    break;
            }
        }
    }
}
