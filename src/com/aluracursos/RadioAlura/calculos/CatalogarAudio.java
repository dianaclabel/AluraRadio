package com.aluracursos.RadioAlura.calculos;

public class CatalogarAudio {
     public void catalogarItem(Catalogar clasificacion){

        if (clasificacion.getCatalogar() == 10){
            System.out.println("Es el audio favorito de la semana");
        } else if (clasificacion.getCatalogar() > 4 && clasificacion.getCatalogar() <= 9 ) {
            System.out.println("Esta cerca a ser favorito");
        }
        else {
            System.out.println("En otro momento será favorito");
        }

    }
}
