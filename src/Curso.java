import java.util.ArrayList;

public class Curso implements IConLista{
    public ArrayList<Estudiante> estudiantes;

    @Override
    public void add(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    @Override
    public void remove(Estudiante estudiante) {
        this.remove(estudiante);
    }

    @Override
    public void find(int numeroMatricula) {
        return;
    }
}
