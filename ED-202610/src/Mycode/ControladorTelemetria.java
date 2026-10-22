package Mycode;
import TDAs.TreeMap;
import TDAs.Entry;

public class ControladorTelemetria {

    TreeMap<Integer,LecturaTelemetria> lecturas = new TreeMap<>();

    public LecturaTelemetria registrarLectura(int kilometraje, LecturaTelemetria lectura){
        return lecturas.put(kilometraje,lectura);

    }
    public Entry<Integer, LecturaTelemetria> obtenerUltimoFalloPrevio(int kilometrajeActual){
        return lecturas.floorEntry(kilometrajeActual);
    }
    public Iterable<Entry<Integer,LecturaTelemetria>> extraerAlertasEnIntervalo(int kmInicio , int kmFinal){
        return lecturas.subMap(kmInicio, kmFinal +1 );
    }
    public LecturaTelemetria eliminarLectura(int kilometraje){
        return lecturas.remove(kilometraje);
    }
}
