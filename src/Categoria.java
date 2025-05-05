import java.util.ArrayList;

public class Categoria {
    private String denominacion;
    private Categoria categoriaPadre;
    private ArrayList<Categoria>subCategorias = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();

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

    public void addSubCategoria(Categoria categoria) {
        subCategorias.add(categoria);
        categoria.setCategoriaPadre(this);
    }
    public void removeCategoria(Categoria categoria) {
        subCategorias.remove(categoria);
        categoria.setCategoriaPadre(null);
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
                ", Sub-CATEGORIAS=" + subCategorias +
                ", articulos=" + articulos +
                '}';
    }
}
