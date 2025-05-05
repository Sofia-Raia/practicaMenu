public class Main {
    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio();
        Categoria cat1 = new Categoria("categoriaPadre");
        Categoria cat2 = new Categoria("categoriaHija");
        Articulo art1 = new Articulo();
        Categoria categoria= new Categoria("PrimerCategoria",cat1, art1);

        Sucursal sucursal = new Sucursal("Avenida San Martin", domicilio,categoria);
        Empresa empresa = new Empresa("Jugueteria ", "Sociedad Anonima", "Logo123", 123456789,sucursal);
        System.out.println(empresa);
    }
}