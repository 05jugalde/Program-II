package Proyecto;

import ClasesObjeto.Equipo;
import ClasesObjeto.Jugador;
import ClasesObjeto.Archivo;


public class GestionDeEquipos {

    public static void main(String[] args) {
    	Equipo e1 = Archivo.cargarEquipo("CadeteA-2024");
    	Jugador j1 = e1.obtenerJugador(21);
    	
    	j1 = Archivo.cargarEstadisticas("Markel", "Gorostiaga");
    	j1.visualizarEstadisticasJugador();
    	
    	
    }
}