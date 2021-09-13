/*
 * Caso desarrollado 2: Aplicacion para calcular el costo de un paciente.
 * utilizando clases y objetos.
 *  versión 1.0
 */
package Aplicaciones;

/**
 *
 * @author ARCE ARAUCO María de los Angeles
 * @author FERNANDEZ RONDINEL Noemi Edith
 * @author HURTADO RIVERA Nicole Liz
 */
public class Hospital {

    /**
     * declaramos a la clase los atibutos.
     */
    double edad, Tenfermedad, genero, aumento = 0, Costopaciente = 0;

    /**
     * Constructor de la Aplicación
     */
    public Hospital() {
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getEdad() {
        return edad;
    }

    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getTenfermedad() {
        return Tenfermedad;
    }

    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setTenfermedad(int Tenfermedad) {
        this.Tenfermedad = Tenfermedad;
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getGenero() {
        return genero;
    }

    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }

    /**
     * creamos lo métodos para hallar el resultado del problema.
     */
    public double Cpaciente() {
        if (Tenfermedad == 1) {
            Costopaciente = 135;
        }
        if (Tenfermedad == 2) {
            Costopaciente = 323;
        }
        if (Tenfermedad == 3) {
            Costopaciente = 425;
        }
        if (Tenfermedad == 4) {
            Costopaciente = 678;
        }
        return Costopaciente;
    }

    public double CostoTotalPagar() {
        if (edad < 18) {
            aumento = Cpaciente() * 35 / 100;
        }
        if (genero == 2 && Tenfermedad == 1) {
            aumento = Cpaciente() * 12 / 100;
        }

        return Cpaciente() + aumento;
    }

}
