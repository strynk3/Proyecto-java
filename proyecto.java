void main() {    

    int opcion_principal;

    do {

        System.out.println("Bienvenido a la calculadora :D");
        
        System.out.println("1) Triangulos");
        System.out.println("2) cuadrado");
        System.out.println("3) rectangulo");
        System.out.println("4) Circulo");
        System.out.println( "0) salir");

        opcion_principal = Integer.parseInt(IO.readln("Selecciona una opcion: "));
        //String opcion_principal = IO.readln("Seleccion una opcion ").chartAT(0);

        if (opcion_principal == 1){
            limpiarpantalla.borrar();

            System.out.println("Seleccionates los triangulos");


            
            System.out.println("Termino el programa :P");
        
            System.out.println("1) Volver al inicio");
            System.out.println( "0) salir");
            opcion_principal = Integer.parseInt(IO.readln("Selecciona una opcion: "));
            limpiarpantalla.borrar();
        }

        if (opcion_principal == 2){
            limpiarpantalla.borrar();
            
            System.out.println("Seleccionates el cuadrado");



            
            System.out.println("Termino el programa :P");
        
            System.out.println("1) Volver al inicio");
            System.out.println( "0) salir");
            opcion_principal = Integer.parseInt(IO.readln("Selecciona una opcion: "));
            limpiarpantalla.borrar();
        }


        if (opcion_principal == 3){
            limpiarpantalla.borrar();
            
            System.out.println("Seleccionates el rectangulo");



            
            System.out.println("Termino el programa :P");
        
            System.out.println("1) Volver al inicio");
            System.out.println( "0) salir");
            opcion_principal = Integer.parseInt(IO.readln("Selecciona una opcion: "));
            limpiarpantalla.borrar();
        }

        if (opcion_principal == 4){
            limpiarpantalla.borrar();
            
            System.out.println("Seleccionates el circulo");



            
            System.out.println("Termino el programa :P");
        
            System.out.println("1) Volver al inicio");
            System.out.println( "0) salir");
            opcion_principal = Integer.parseInt(IO.readln("Selecciona una opcion: "));
            limpiarpantalla.borrar();
        }
        
    } while (opcion_principal != 0);


}

