import java.util.ArrayList;

public class Articulo {
protected String denominacion;
protected String codigo;
protected double precioVenta;
protected boolean habilitado;
protected ArrayList<Alergeno> alergenos = new ArrayList<>();
protected ArrayList<Imagen> imagenes = new ArrayList<>();


    public Articulo() {

    }

    public Articulo(String denominacion, String codigo, double precioVenta, boolean habilitado) {
        this.denominacion = denominacion;
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.habilitado = habilitado;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    public void addAlergeno(Alergeno alergeno) {
        alergenos.add(alergeno);
    }
    public void removeAlergeno(Alergeno alergeno) {
        alergenos.remove(alergeno);
    }
     public void addImagen(Imagen imagen) {
        imagenes.add(imagen);
     }
     public void removeImagen(Imagen imagen) {
        imagenes.remove(imagen);
     }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precioVenta=" + precioVenta +
                ", habilitado=" + habilitado +
                ", alergenos=" + alergenos +
                ", imagenes=" + imagenes +
                '}';
    }
}
