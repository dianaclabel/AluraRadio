package com.aluracursos.RadioAlura.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        if(clasificacion <= 10){
                this.clasificacion = clasificacion ;
        }else {
            System.out.println("Clasificación es invalido");
        }

    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public void meGusta(){
       meGusta++;
    }

    public void reproducir(){
        totalDeReproducciones ++;
    }

    public void reporte(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracion: " + duracion);
        System.out.println("Total de reproducciones " +  totalDeReproducciones);
        System.out.println("clasificacion " + clasificacion);

    }
}
