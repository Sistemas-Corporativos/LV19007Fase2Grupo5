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
public class ListaJugadores {
    //Nodo
    class Nodo {
        Jugador jugador; //Clase Jugador        
        Nodo ant,sig; //Punteros
    }        
    private Nodo raiz; //Nodo raiz
    //Constructor
    public ListaJugadores () {
        raiz = null; //Al instanciar la clase el nodo raiz sera null
    }
    //Insertar un elemento en la posicion indicada
    public void insertar (int pos, Jugador jugador)
    {
        if (pos <= cantidad () + 1)    {
            //creamos un nuevo nodo
            Nodo nuevo = new Nodo ();
            //Asignamos el jugador al nodo            
            nuevo.jugador = jugador;
            if (pos == 1){  //Si la posicion a insertar es 1
                nuevo.sig = raiz;
                if (raiz != null)
                    raiz.ant = nuevo;
                raiz = nuevo;
            } else
                if (pos == cantidad () + 1)    { //Verificamos si se inserta al final de la lista
                    Nodo reco = raiz;
                    while (reco.sig != null) {  //Recorremos la lista hasta el ultimo nodo
                        reco = reco.sig;
                    }
                    reco.sig = nuevo;
                    nuevo.ant=reco;
                    nuevo.sig = null;
                } else {    //Si no se inserta al final o al principio de la lista se inserta en medio de esta
                    Nodo reco = raiz;
                    for (int f = 1 ; f <= pos - 2 ; f++) //Nos detenemos una posicion antes de donde desea insertarse
                        reco = reco.sig;
                    Nodo siguiente = reco.sig;
                    reco.sig = nuevo;
                    nuevo.ant=reco;
                    nuevo.sig = siguiente;
                    siguiente.ant=nuevo;
                }
        }
    }
    //Borrar y extraer un jugador de la lista
    public Jugador extraer (int pos) {  //Debe recibir la posicion del nodo a extraer
        //Verificamos que la posicion exista en la lista
        if (pos <= cantidad ())    {
            Jugador jugador;//El jugador que extraeremos
            if (pos == 1) {
                jugador = raiz.jugador;
                raiz = raiz.sig;
                if (raiz!=null)
                    raiz.ant=null;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                Nodo siguiente=prox.sig;
                if (siguiente!=null)
                    siguiente.ant=reco;
                jugador = prox.jugador;
            }
            return jugador;
        }
        else
            return null;
    }
    //Borrar un jugador de la lista
    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                raiz = raiz.sig;
                if (raiz!=null)
                    raiz.ant=null;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                prox=prox.sig;
                reco.sig = prox;
                if (prox!=null)
                    prox.ant=reco;
            }
        }
    }
    //Intercambiar posicion(ubicacion) de jugador en la lista    
    public void intercambiar (int pos1, int pos2) {
        if (pos1 <= cantidad () && pos2 <= cantidad ())    {
            Nodo reco1 = raiz;
            for (int f = 1 ; f < pos1 ; f++)
                reco1 = reco1.sig;
            Nodo reco2 = raiz;
            for (int f = 1 ; f < pos2 ; f++)
                reco2 = reco2.sig;
            Jugador aux = reco1.jugador;
            reco1.jugador = reco2.jugador;
            reco2.jugador = aux;
        }
    }
    //Obtener la cantidad de elementos de la lista
    public int cantidad ()
    {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }
    //Verificar si un jugador existe en la lista
    public boolean existe(Jugador jugador) {
        Nodo reco=raiz;
        while (reco!=null) {
            if (reco.jugador==jugador)
                return true;
            reco=reco.sig;
        }
        return false;
    }
    //Verificar si la lista esta vacia
    public boolean vacia ()
    {
        if (raiz == null)
            return true;
        else
            return false;
    }
    //Imprimir la lista
    public void imprimir ()
    {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (reco.jugador.nombre + "-" + reco.jugador.posicion);
            reco = reco.sig;
        }
        System.out.println();
    }    
}

