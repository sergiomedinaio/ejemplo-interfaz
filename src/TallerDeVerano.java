public class TallerDeVerano extends Curso implements IConLista{
    @Override
    public void find(int numeroMatricula) {

    }

    @Override
    public void add(Estudiante estudiante) {
        //super.add(estudiante);
        if(estudiante.numeroMatricula  > 1000) return;
        this.estudiantes.add(estudiante);
    }

}
