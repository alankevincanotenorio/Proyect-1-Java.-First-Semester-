/**Esta clase representa un intervalo
 * Dichos intervalos pueden ser de cualquier tipo y de diferentes valores 
 * @author Alan Kevin Cano Tenorio, Malinalli Escobedo Irineo
 */
public class Intervalo implements ServiciosIntervalo{
    private boolean aAbierto;
    private boolean bAbierto;
    private double a;
    private double b;
    private double longa;
    private Intervalo intervalo;

    //Getters
    public boolean getAAbierto(){
        return this.aAbierto;
    }
    public boolean getBAbierto(){
        return this.bAbierto;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getLonga(){
        return this.longa;
    }
    public Intervalo getIntervalo(){
        return this.intervalo;
    }

    //Setters
    public void setAAbierto(boolean aAbierto){
        this.aAbierto = aAbierto;
    }
     public void setBAbierto(boolean bAbierto){
        this.bAbierto = bAbierto;
    }
     public void setA(double a){
        this.a = a;
    }
     public void setB(double b){
        this.b = b;
    }
     public void setLonga(double longa){
        this.longa = longa;
    }
    public void setIntervalo(Intervalo intervalo){
        this.intervalo = intervalo;
    }



    //Métodos Constructores
    public Intervalo (boolean aAbierto, double a, double b, boolean bAbierto){
    this.aAbierto = aAbierto;
    this.a = a;
    this.bAbierto = bAbierto;
    this.b = b;
    }
    public Intervalo (){
    }
    
    //Métodos de la Interfaz


    /**
    * Indica si un valor existe o no en el intervalo , tomando en
    * cuenta además si es abierto o cerrado .
    * @param x El valor que se buscará en el intervalo .
    * @return true si x pertenece al intervalo , false en otro caso .
    */
    
    public boolean contiene ( double x ){
        boolean existe = ((a<=x && x<=b) && (aAbierto==false && bAbierto==false)) || ((a<=x && x<b) && (aAbierto==false && bAbierto==true)) || ((a<x && x<=b) && (aAbierto==true && bAbierto==false)) || ((a<x && x<b) && (aAbierto==true && bAbierto==true)) ? true : false;
        return existe;
    }



    /**
    * Indica si el intervalo no contiene ningún valor . Esto sucede
    * cuando es de la forma (a,a), (a,a], o bien , [a,a).
    * @return true si no contiene ning  ́un valor , false en otro caso .
    */
    public boolean estaVacio (){
        boolean vacio = (aAbierto==false && bAbierto==false) ? false : (a==b) ? true : false;
        return vacio;
    }


    /**
    * Devuelve la diferencia b-a.
    * @return La longitud del intervalo .
    */
    public double longitud (){
        longa = b - a;
        return longa;
    }


    /**
    * Indica si el intervalo tiene mayor longitud que otro .
    * @param otro El intervalo con el que se hará la comparación.
    * @return true si tiene mayor lonitud que el otro intervalo ,
    * false en otro caso .
    */
    public boolean mideMas ( Intervalo otro ){
        double longb = otro.longitud();
        boolean midemas = (longa>longb) ? true : false;
        return midemas;
        }


    /**
    * Indica si el intervalo tiene exactamente los mismos valores
    * que otro , esto es , mismos extremos con las mismas cualiades
    * de estar abiertos o cerrados como en el original .
    *
    * @param otro El intervalo con el que se hará la comparación.
    * @return true si es igual al otro intervalo , false en otro
    * caso .
    */
    public boolean esIgual ( Intervalo otro ){
           boolean igual = (intervalo==otro) ? true : false;
           return igual;
       }


    /**
    * Recorre c unidades cada uno de los extremos del intervalo .
    * Por ejemplo : [3.5, 7).desplaza (−3) = [0.5, 4)
    *
    * @param c El desplazamiento que recibirá cada extremo .
    * @return Un nuevo intervalo desplazado c unidades , pero con
    * igual longitud que el intervalo original y con los
    * extremos abiertos o cerrados de la misma forma que
    * el original .
    */
    public Intervalo desplaza ( double c ){
        a = a + c;
        b = b + c;
        Intervalo desplazado1 = new Intervalo(aAbierto, a, b, bAbierto);
        return desplazado1;
    }



    /**
    * Indica si todos los elementos de un intervalo están contenidos
    * dentro del invocante .
    * @param otro El intervalo con el que se hará la verifiación.
    * @return true si el otro intervalo está contenido propiamente ,
    * false en otro caso .
    */
    public boolean contiene ( Intervalo otro ){
        double a2 = otro.getA();
        double b2 = otro.getB();
        boolean contiene = (a<a2 && b>b2) ? true : false; 
        return contiene;
    }


    /**
    * Devuelve la intersección entre el intervalo actual y otro .
    * Puede devolver un intervalo vacío si la intersección es nula .
    * Por ejemplo : [4, 8) ∩ [5, 10] = [5, 8)
    * (−2, 9) ∩ [9, 15] = ∅
    * @param otro El intervalo con el que se hará la intersección.
    * @return Un nuevo intervalo correspondiente a la intersección
    * del intervalo actual y el otro .
    */
      public Intervalo intersecta ( Intervalo otro ){
        double a2 = otro.getA();
        double b2 = otro.getB();
        if (b<a2 || b2<a){
            a=0;
            b=0;
        }else if((a<=a2 && b<=b2)){
            a2 = a;
            b = b;
        }else if ((a<=a2 && b2<=b)){
            a =a2;
            b = b2;
        }else if((a2<=a && b2<=b)){
            a = a;
            b = b2;
        }else if((a2<=a&& b<=b2)){
            a=a;
            b=b;
        }
        Intervalo intervalo1 = new Intervalo(aAbierto, a, b, bAbierto);
        return intervalo1;
    }


    /**
    * Devuelve el intervalo que cabe entre el intervalo actual y
    * otro .
    * Puede devolver un intervalo vacío.
    * Por ejemplo : [1, 4.5). intermedio ([7, 10]) = [4.5, 7)
    * (−5, 5). intermedio ([3, 6]) = ∅
    *
    * @param otro El intervalo con el que se har  ́a la verificación.
    * @return Un nuevo intervalo que cabe entre el actual y el otro .
    */
    public Intervalo intermedio (Intervalo otro){ 
        double a2 = otro.getA();
        if (b<a2){
            Intervalo inter = new Intervalo(aAbierto, b, a2 , bAbierto);
            return inter;
        } else {
            Intervalo inter = new Intervalo();
            return inter;
        }
    }
    
    /**
    * Devuelve una cadena que muestre los extremos del intervalo ,
    * representando adecuadamente si cada extremo es abierto o
    * cerrado .
    * @return La cadena correspondiente al intervalo .
    */
    public String muestra (){
        String interval = (aAbierto==false && bAbierto==false) ? "["+a+","+b+"]" : (aAbierto==false && bAbierto==true) ? "["+a+","+b+")" : (aAbierto==true && bAbierto==false) ? "("+a+","+b+"]" : (aAbierto==true && bAbierto==true) ? "("+a+","+b+")" : "no ingresaste un intervalo";
        return interval;
    }   

}