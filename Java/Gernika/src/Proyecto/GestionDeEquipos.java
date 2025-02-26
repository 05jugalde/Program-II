package Proyecto;

import ClasesObjeto.Equipo;
import ClasesObjeto.Archivo;


public class GestionDeEquipos {

    public static void main(String[] args) {
    	Equipo e1 = Archivo.cargarEquipo("CadeteA-2024");
    	e1.visualizarJugadores();
    }
}