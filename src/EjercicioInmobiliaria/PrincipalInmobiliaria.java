package EjercicioInmobiliaria;

public class PrincipalInmobiliaria {

    public static void main(String[] args) {
                // Crear 3 propiedades usando el constructor con distintos valores
                Inmobiliaria[] propiedades = new Inmobiliaria[3];
                propiedades[0] = new Inmobiliaria(1, "Av. Principal 123", 150, 200000, 3, 2, true, "Disponible");
                propiedades[1] = new Inmobiliaria(2, "Calle Secundaria 456", 100, 150000, 2, 1, false, "Rentada");
                propiedades[2] = new Inmobiliaria(3, "Plaza Central 789", 300, 500000, 5, 3, true, "Disponible");

                // Mostrar datos de cada propiedad
                for (Inmobiliaria propiedad : propiedades) {
                    propiedad.mostrarDatos();
                }

                // Modificar el estado de alguna propiedad y mostrar los datos nuevamente
                propiedades[0].setEstado("Vendida");
                System.out.println("Después de cambiar el estado:");
                propiedades[0].mostrarDatos();
            }
        }
