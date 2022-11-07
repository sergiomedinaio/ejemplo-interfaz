import java.util.ArrayList;

public class EquipoDeFutbol implements IConLista{
    public ArrayList<Estudiante> jugadores;

    @Override
    public void add(Estudiante estudiante) {
        this.jugadores.add(estudiante);
    }

    @Override
    public void remove(Estudiante estudiante) {
        this.jugadores.remove(estudiante);
    }

    @Override
    public void find(int numeroMatricula) {
        //
        return;
    }
}
