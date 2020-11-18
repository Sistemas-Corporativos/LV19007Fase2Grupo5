/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv19007fase2grupo5;

/**
 *
 * @author RONALDMO
 */
public class Prueba {
    public static void main(String[] ar) {
        ListaJugadores lg=new ListaJugadores();
        Jugador jugador = new Jugador();
        jugador.numero=1;
        jugador.nombre = "Jose Ramos";
        jugador.posicion= Posicion.delantero;
        lg.insertar (1, jugador);        
                
        lg.imprimir ();        
    }
}
