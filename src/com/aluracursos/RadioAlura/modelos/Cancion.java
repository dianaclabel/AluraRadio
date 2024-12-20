package com.aluracursos.RadioAlura.modelos;

import com.aluracursos.RadioAlura.calculos.Catalogar;

public class Cancion extends Audio implements Catalogar {
    String plataformaMusical;

    public String getPlataformaMusical() {
        return plataformaMusical;
    }

    public void setPlataformaMusical(String plataformaMusical) {
        this.plataformaMusical = plataformaMusical;
    }


    @Override
    public int getCatalogar() {
        return getClasificacion();
    }
}
