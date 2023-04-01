public class Main {

    public static void main(String[] args) {
        //Condicional If.
        int numeroIf = -2 ;

        if (numeroIf<0) {
            System.out.println("El valor es negativo");
        } else if (numeroIf==0) {
            System.out.println("El valor es cero.");
        }else {
            System.out.println("El valor es positivo.");
        }

        //Bucle While
        int numeroWhile = -5 ;

        while ( numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile++;

        }
        //Bucle Do While

        int numeroDoWhile = 0;

        do {

            System.out.println(numeroDoWhile);
            numeroDoWhile++;

        }
        while (numeroDoWhile<=3);

        //Bucle For

        int numeroFor=0;

        for (numeroFor=0; numeroFor<=3 ; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        //Bucle Switch

        var estacion = "OTOÑO";

        switch (estacion) {
            case "VERANO":
                System.out.println("La estación es: Verano.");
                break;
            case "OTOÑO":
                System.out.println("La estación es: Otoño.");
                break;
            case "INVIERNO":
                System.out.println("La estación es: Invierno.");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es: Primavera.");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta.");
        }

    }


}
