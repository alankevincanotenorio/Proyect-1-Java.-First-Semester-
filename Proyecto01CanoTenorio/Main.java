public class Main {
	public static void main(String[] args) {
		//objetos
		Intervalo primero = new Intervalo ( true, 2.0, 10.0, true);
		Intervalo segundo = new Intervalo ( false , 3.0, 3.0, true);
		Intervalo tercero = new Intervalo ( true , 4.0, 5.0, false);
		Intervalo cuarto = new Intervalo ( false , 1.0, 7.0, false);
		
		//objetos copia
		Intervalo primeroCopia = new Intervalo ( true, 2.0, 10.0, true);
		Intervalo segundoCopia = new Intervalo ( false , 3.0, 3.0, true);
		Intervalo terceroCopia = new Intervalo ( false , 4.0, 5.0, false);
		Intervalo cuartoCopia = new Intervalo ( false , 1.0, 7.0, false);

		// metodos de la interfaz
		
		System.out.println("El intervalo 1 es: "+primero.muestra());
		System.out.println("El intervalo 2 es: "+segundo.muestra());
		System.out.println("El intervalo 3 es: " + tercero.muestra());
		System.out.println("El intervalo 4 es: " + cuarto.muestra());
		System.out.println();


		double x = 3;
		System.out.println( "¿El número " +x+ " está en el intervalo 1? " + primero.contiene(x));
		System.out.println( "¿El número " +x+ " está en el intervalo 2? " +segundo.contiene(x));
		System.out.println( "¿El número " +x+ " está en el intervalo 3? " + tercero.contiene(x));
		System.out.println( "¿El número " +x+ " está en el intervalo 4? " + cuarto.contiene(x));
		System.out.println();


		boolean vacio1 = primero.estaVacio();
		System.out.println( "¿El intervalo 1  está vacio? " +vacio1);
		boolean vacio2 = segundo.estaVacio();
		System.out.println( "¿El intervalo 2  está vacio? " +vacio2);
		boolean vacio3 = tercero.estaVacio();
		System.out.println( "¿El intervalo 3  está vacio? " +vacio3);
		boolean vacio4 = cuarto.estaVacio();
		System.out.println( "¿El intervalo 4  está vacio? " +vacio4);
		System.out.println();

		
		System.out.println( "La longitud del intervalo 1 es de: " +primero.longitud());
		System.out.println( "La longitud del intervalo 2 es de: " +segundo.longitud());
		System.out.println( "La longitud del intervalo 3 es de: " +tercero.longitud());
		System.out.println( "La longitud del intervalo 4 es de: " +cuarto.longitud());
		System.out.println();

		
		boolean mas1 =  primero.mideMas(segundo);
		System.out.println("¿El intervalo 1 mide mas que el intervalo 2? " +mas1);
		boolean mas2 =  segundo.mideMas(tercero);
		System.out.println("¿El intervalo 2 mide mas que el intervalo 3? " +mas2);
		boolean mas3 =  tercero.mideMas(cuarto);
		System.out.println("¿El intervalo 3 mide mas que el intervalo 4? " +mas3);
		boolean mas4 =  cuarto.mideMas(primero);
		System.out.println("¿El intervalo 4 mide mas que el intervalo 1? " +mas4);
		System.out.println();

		
		boolean igual1 = primero.esIgual(segundo);
		System.out.println( "¿El intervalo 1 es igual al intervalo 2? " +igual1);
		boolean igual2 = segundo.esIgual(tercero);
		System.out.println( "¿El intervalo 2 es igual al intervalo 3? " +igual2);
		boolean igual3 = tercero.esIgual(cuarto);
		System.out.println( "¿El intervalo 3 es igual al intervalo 4? " +igual3);
		boolean igual4 = cuarto.esIgual(primero);
		System.out.println( "¿El intervalo 4 es igual al intervalo 1? " +igual4);		
		System.out.println();


		double m = -3;
		Intervalo desplazo1 = primeroCopia.desplaza(m);
		System.out.println( "Si el intervalo 1 es dezplazado en " +m+" unidades, quedaría:" +desplazo1.muestra());
		Intervalo desplazo2 = segundoCopia.desplaza(m);
		System.out.println( "Si el intervalo 2 es dezplazado en " +m+" unidades, quedaría:" +desplazo2.muestra());
		Intervalo desplazo3 = terceroCopia.desplaza(m);
		System.out.println( "Si el intervalo 3 es dezplazado en " +m+" unidades, quedaría:" +desplazo3.muestra());
		Intervalo desplazo4 = cuartoCopia.desplaza(m);
		System.out.println( "Si el intervalo 4 es dezplazado en " +m+" unidades, quedaría:" +desplazo4.muestra());
		System.out.println();

		
		boolean dentro1 = primero.contiene(segundo);
		System.out.println( "¿El intervalo "+segundo.muestra()+" está contenido en el intervalo "+primero.muestra()+ "? " +dentro1);
		boolean dentro2 = segundo.contiene(tercero);
		System.out.println( "¿El intervalo "+tercero.muestra()+" está contenido en el intervalo "+segundo.muestra()+ "? " +dentro2);
		boolean dentro3 = tercero.contiene(cuarto);
		System.out.println( "¿El intervalo "+cuarto.muestra()+" está contenido en el intervalo "+tercero.muestra()+ "? " +dentro3);
		boolean dentro4 = cuarto.contiene(primero);
		System.out.println( "¿El intervalo "+primero.muestra()+" está contenido en el intervalo "+cuarto.muestra()+ "? " +dentro4);
		System.out.println();



		Intervalo intersec1 = primero.intersecta(segundo);
		System.out.println("El intervalo que resulta de la interseccion de los intervalos 1 y 2 es: "+intersec1.muestra());
		Intervalo intersec2 = segundo.intersecta(tercero);
		System.out.println("El intervalo que resulta de la interseccion de los intervalos 2 y 1 es: "+intersec2.muestra());
		Intervalo intersec3 = tercero.intersecta(cuarto);
		System.out.println("El intervalo que resulta de la interseccion de los intervalos 3 y 4 es: "+intersec3.muestra());
		Intervalo intersec4 = cuarto.intersecta(tercero);
		System.out.println("El intervalo que resulta de la interseccion de los intervalos 4 y 3 es: "+intersec4.muestra());
		System.out.println();
		
		Intervalo inter1 = primero.intermedio(segundo);
		System.out.println( "El intervalo, que cabe entre el intervalo 1 y el 2 es: "  +inter1.muestra());
		Intervalo inter2 = segundo.intermedio(tercero);
		System.out.println( "El intervalo, que cabe entre el intervalo 2 y el 3 es: "  +inter2.muestra());
		Intervalo inter3 = tercero.intermedio(cuarto);
		System.out.println( "El intervalo, que cabe entre el intervalo 3 y el 4 es: "  +inter3.muestra());
		Intervalo inter4 = cuarto.intermedio(primero);
		System.out.println( "El intervalo, que cabe entre el intervalo 4 y el 1 es: "  +inter4.muestra());
		System.out.println();
		
	}	

}
