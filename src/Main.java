public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Jugueteria", "Sociedad Anonima");

        Pais pais = new Pais("Argentina");
        Provincia provincia= new Provincia("Mendoza",pais);

        Localidad localidad= new Localidad();
        localidad.setNombre("Ciudad de Mendoza");
        localidad.setProvincia(provincia);

        Domicilio domicilio1 = new Domicilio("Paso de los Andes", 456, 5500);
        Domicilio domicilio2 = new Domicilio("Fernando Fader", 200, 5500);

        domicilio1.setLocalidad(localidad);

        Categoria cat1 = new Categoria("Peluche");
        Categoria cat2 = new Categoria("Osos de Peluche");
        cat1.addSubCategoria(cat2); //se garantiza la doble vinculacion.

        Articulo art1 = new Articulo("Osito de peluche", "111111", 200, true);

        Imagen imagen = new Imagen("Oso Tedy", "www.imagen");
        art1.addImagen(imagen);
        cat2.addArticulo(art1);

        Sucursal sucursal = new Sucursal("Avenida San Martin", domicilio1);
        Sucursal sucursal2 = new Sucursal("Presidente Peron ", domicilio2);

        empresa.addSucursal(sucursal);
        empresa.addSucursal(sucursal2);

        sucursal.addCategoria(cat1);
        sucursal.addCategoria(cat2);

        sucursal2.addCategoria(cat1);
        sucursal2.addCategoria(cat2);


        System.out.println(empresa);
    }
}