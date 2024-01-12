/**
* Los servicios que debe ofrecer un Intervalo definido en los
* números reales delimitado por los valores a y b.
*/
public interface ServiciosIntervalo {
/**
* Indica si un valor existe o no en el intervalo , tomando en
* cuenta adem  ́as si es abierto o cerrado .
*
* @param x El valor que se buscar  ́a en el intervalo .
* @return true si x pertenece al intervalo , false en otro caso .
*/
public boolean contiene ( double x );
/**
* Indica si el intervalo no contiene ning  ́un valor . Esto sucede
* cuando es de la forma (a,a), (a,a], o bien , [a,a).
*
* @return true si no contiene ning  ́un valor , false en otro caso .
*/
public boolean estaVacio ();
/**
* Devuelve la diferencia b-a.
*
* @return La longitud del intervalo .
*/
public double longitud ();
/**
* Indica si el intervalo tiene mayor longitud que otro .
*
* @param otro El intervalo con el que se har  ́a la comparaci  ́on.
* @return true si tiene mayor lonitud que el otro intervalo ,
* false en otro caso .
*/
public boolean mideMas ( Intervalo otro );
/**
* Indica si el intervalo tiene exactamente los mismos valores
* que otro , esto es , mismos extremos con las mismas cualiades
* de estar abiertos o cerrados como en el original .
*
* @param otro El intervalo con el que se har  ́a la comparaci  ́on.
* @return true si es igual al otro intervalo , false en otro
* caso .
*/
public boolean esIgual ( Intervalo otro );

/**
* Recorre c unidades cada uno de los extremos del intervalo .
* Por ejemplo : [3.5, 7).desplaza (−3) = [0.5, 4)
*
* @param c El desplazamiento que recibir  ́a cada extremo .
* @return Un nuevo intervalo desplazado c unidades , pero con
* igual longitud que el intervalo original y con los
* extremos abiertos o cerrados de la misma forma que
* el original .
*/
public Intervalo desplaza ( double c );
/**
* Indica si todos los elementos de un intervalo est  ́an contenidos
* dentro del invocante .
*
* @param otro El intervalo con el que se har  ́a la verifiaci  ́on.
* @return true si el otro intervalo est ́a contenido propiamente ,
* false en otro caso .
*/
public boolean contiene ( Intervalo otro );
/**
* Devuelve la intersecci  ́on entre el intervalo actual y otro .
* Puede devolver un intervalo vac  ́ıo si la intersecci  ́on es nula .
* Por ejemplo : [4, 8) ∩ [5, 10] = [5, 8)
* (−2, 9) ∩ [9, 15] = ∅
*
* @param otro El intervalo con el que se har  ́a la intersecci  ́on.
* @return Un nuevo intervalo correspondiente a la intersecci  ́on
* del intervalo actual y el otro .
*/
public Intervalo intersecta ( Intervalo otro );
/**
* Devuelve el intervalo que cabe entre el intervalo actual y
* otro .
* Puede devolver un intervalo vac  ́ıo.
* Por ejemplo : [1, 4.5). intermedio ([7, 10]) = [4.5, 7)
* (−5, 5). intermedio ([3, 6]) = ∅
*
* @param otro El intervalo con el que se har  ́a la verificaci  ́on.
* @return Un nuevo intervalo que cabe entre el actual y el otro .
*/
public Intervalo intermedio ( Intervalo otro );
/**
* Devuelve una cadena que muestre los extremos del intervalo ,
* representando adecuadamente si cada extremo es abierto o
* cerrado .
*
* @return La cadena correspondiente al intervalo .
*/
public String muestra ();
}
