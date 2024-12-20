package com.aluracursos.RadioAlura.modelos;


import com.aluracursos.RadioAlura.calculos.Catalogar;

public class Podcast extends Audio implements Catalogar {
    String tipoPodcast;

    public String getTipoPodcast() {
        return tipoPodcast;
    }

    public void setTipoPodcast(String tipoPodcast) {
        this.tipoPodcast = tipoPodcast;
    }


    @Override
    public int getCatalogar() {
        return getClasificacion();
    }
}
