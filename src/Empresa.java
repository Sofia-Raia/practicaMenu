import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private String logo;
    private int cuit;
    private ArrayList<Sucursal> sucursales=new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nombre, String razonSocial) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;

    }

    public Empresa(String nombre, String razonSocial, String logo, int cuit, Sucursal sucursal) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.logo = logo;
        this.cuit = cuit;
        addSucursal(sucursal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }
    public void removeSucursal(Sucursal sucursal) {
        sucursales.remove(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", sucursales=" + sucursales +
                '}';
    }
}
