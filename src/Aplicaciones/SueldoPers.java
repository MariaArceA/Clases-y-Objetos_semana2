/*
 * Caso desarrollado 3: Aplicacion para calcular el sueldo.
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
public class SueldoPers {
    /**
     * declaramos a la clase los atibutos.
     */
    int horasTrabajadas, tarifaH;
    /**
     * Constructor de la Aplicación
     */
    public SueldoPers() {
    }
    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public int getTarifaHoria() {
        return tarifaH;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setTarifaHoraria(int tarifaH) {
        this.tarifaH = tarifaH;
    }
    /**
     * creamos lo métodos para hallar el resultado del problema.
     */
    public double sueldoBasico() {
        return (horasTrabajadas * tarifaH);
    }

    public double sueldoBruto() {
        return (sueldoBasico() * 0.35) + sueldoBasico();
    }

    public double sueldoNeto() {
        double sueld;
        sueld = sueldoBasico() * 0.12;        
        return sueldoBruto()-sueld;
    }
}
