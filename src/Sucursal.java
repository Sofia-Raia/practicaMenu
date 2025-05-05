import java.time.LocalTime;
import java.util.ArrayList;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura ;
    private LocalTime horarioDeCierre ;
    private boolean esCasaMartinez;
    private Domicilio domicilio;
    private ArrayList<Categoria> categorias =new ArrayList();

    public Sucursal() {
    }

    public Sucursal(String nombre, Domicilio domicilio, Categoria categoria) {
        this.nombre = nombre;
        this.esCasaMartinez = true;
        this.domicilio = domicilio;
        addCategoria(categoria); ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioDeCierre() {
        return horarioDeCierre;
    }

    public void setHorarioDeCierre(LocalTime horarioDeCierre) {
        this.horarioDeCierre = horarioDeCierre;
    }

    public boolean isEsCasaMartinez() {
        return esCasaMartinez;
    }

    public void setEsCasaMartinez(boolean esCasaMartinez) {
        this.esCasaMartinez = esCasaMartinez;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    public void addCategoria(Categoria categoria) {
        categorias.add(categoria);
    }
    public void removeCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioDeCierre=" + horarioDeCierre +
                ", esCasaMartinez=" + esCasaMartinez +
                ", domicilio=" + domicilio +
                ", categorias=" + categorias +
                '}';
    }
}
