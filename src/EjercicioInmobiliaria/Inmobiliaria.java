package EjercicioInmobiliaria;

public class Inmobiliaria {
    private int IdPropiedad;
    private String Direccion;
    private int AreaM2;
    private int Precio;
    private  int CantidadHabitaciones;
    private int Cantidadbanos;
    private boolean Garaje;
    private String Estado;


    public Inmobiliaria(int IdPropiedad, String Direccion, int AreaM2,
    int Precio, int CantidadHabitaciones, int Cantidadbanos, boolean Garaje, String Estado){
        this.IdPropiedad = IdPropiedad;
        this.Direccion = Direccion;
        this.AreaM2 = AreaM2;
        this.Precio = Precio;
        this.CantidadHabitaciones = CantidadHabitaciones;
        this.Cantidadbanos = Cantidadbanos;
        this.Garaje = Garaje;
        this.Estado = Estado;
    }

    public int getIdPropiedad() {
        return IdPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        IdPropiedad = idPropiedad;
    }

    public java.lang.String getDireccion() {
        return Direccion;
    }

    public void setDireccion(java.lang.String direccion) {
        Direccion = direccion;
    }

    public int getAreaM2() {
        return AreaM2;
    }

    public void setAreaM2(int areaM2) {
        AreaM2 = areaM2;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getCantidadHabitaciones() {
        return CantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        CantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadbanos() {
        return Cantidadbanos;
    }

    public void setCantidadbanos(int cantidadbanos) {
        Cantidadbanos = cantidadbanos;
    }

    public java.lang.String getEstado() {
        return Estado;
    }

    public void setEstado(java.lang.String estado) {
        Estado = estado;
    }

    public boolean isGaraje() {
        return Garaje;
    }

    public void setGaraje(boolean garaje) {
        Garaje = garaje;
    }
    public void mostrarDatos(){
        System.out.println("ID de propiedad: " + IdPropiedad);
        System.out.println("Dirección: " + Direccion);
        System.out.println("Área en m2: " + AreaM2);
        System.out.println("Precio: $" + Precio);
        System.out.println("Cantidad de habitaciones: " + CantidadHabitaciones);
        System.out.println("Cantidad de baños: " + Cantidadbanos);
        System.out.println("Garaje: " + (Garaje ? "Sí" : "No"));
        System.out.println("Estado: " + Estado);
        System.out.println("----------------------");
    }
}
