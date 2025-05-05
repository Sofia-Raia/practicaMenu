import java.util.ArrayList;

public class Categoria {
    private String denominacion;
    private Categoria categoriaPadre;
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();

    public Categoria(String denominacion,Categoria categoria, Articulo articulos) {
        this.denominacion = denominacion;
       addArticulo(articulos);
       addCategoria(categoria);
    }

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public void addCategoria(Categoria categoria) {
        categorias.add(categoria);
        categoria.setCategoriaPadre(this);
    }
    public void removeCategoria(Categoria categoria) {
        categorias.remove(categoria);
        categoria.setCategoriaPadre(this);
    }
    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", categoriaPadre=" + categoriaPadre +
                ", categorias=" + categorias +
                ", articulos=" + articulos +
                '}';
    }
}
