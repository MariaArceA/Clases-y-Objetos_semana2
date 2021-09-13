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

public class SueldoJeans {
    /**
     * declaramos a la clase los atibutos.
     */
    double  numeroHijos,horasTrabajadas, tarifaHoraria,categoria,boniHijo,Desc;

    /**
     * Constructor de la Aplicación
     */
    public SueldoJeans() {
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getNumeroHijos() {
        return numeroHijos;
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getTarifaHoraria() {
        return tarifaHoraria;
    }

    /**
     * declaramos get para mostrar el valor de un atributo.
     */
    public double getCategoria() {
        return categoria;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setTarifaHoraria(int tarifaHoraria) {
        this.tarifaHoraria = tarifaHoraria;
    }
    /**
     * declaramos set para modificar el valor de un atributo.
     */
    public void setCategoria(double categoria) {
        this.categoria = categoria;
    }
    /**
     * creamos lo métodos para hallar el resultado del problema.
     */
    public double CategoriaTarifa(){
        if(categoria==1){
            tarifaHoraria=45;
        }
        if(categoria==2){
           tarifaHoraria=37.5;
        }
        return tarifaHoraria;
    }
    public double SueldoBasico(){
        return (horasTrabajadas*CategoriaTarifa());
    }
    private double BonificacionHijos(){
        if (numeroHijos<=3){
            boniHijo= 40.5;
        }
        if(numeroHijos>3){
            boniHijo= 35.0;
        }
        return boniHijo*numeroHijos;
    }
    public double SueldoBruto(){
        return SueldoBasico()+BonificacionHijos();
    }
    public double descuentoCategoria(){
        if (SueldoBruto()>=3500){
            Desc=SueldoBruto()*13.5/100;
        }
        if(SueldoBruto()<3500){
            Desc=SueldoBruto()*10/100;
        }
        return Desc;
    }
    public double sueldoNeto(){
        return SueldoBruto()-descuentoCategoria();        
    }
}
