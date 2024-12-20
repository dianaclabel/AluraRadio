import com.aluracursos.RadioAlura.calculos.CatalogarAudio;
import com.aluracursos.RadioAlura.modelos.Cancion;
import com.aluracursos.RadioAlura.modelos.Podcast;

import java.nio.file.attribute.PosixFileAttributes;

public class Main {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Just a moment");
        miCancion.setDuracion(3);
        miCancion.setTotalDeReproducciones(4);
        miCancion.setClasificacion(9);
        miCancion.reporte();

        CatalogarAudio catalogarAudio = new CatalogarAudio();
        catalogarAudio.catalogarItem(miCancion);
        System.out.println("************************************");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Hola habitos nuevos");
        miPodcast.setDuracion(20);
        miPodcast.setTotalDeReproducciones(1);
        miPodcast.setClasificacion(3);
        miPodcast.reporte();

        catalogarAudio.catalogarItem(miPodcast);

    }
}
