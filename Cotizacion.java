/*
Nombre: Casillas Garcia Alberto Isai
Grupo: TCI 9-3
Matricula: 2019030596
 */
package tarea1;

/**
 *
 * @author ISAI
 */
public class Cotizacion {
    
    //ATRIBUTOS
    private int numCotizacion;
    private String descripcion;
    private float precio;
    private float porcentajeInicial;
    private int plazo;
    
    // MÉTODOS
    // Constructores
    // Constructor vacío
    public Cotizacion() {
        
    }
    
    // Constructor de parámetros
    public Cotizacion(int numCotizacion, String descripcion, float precio, float porcentajeInicial, int plazo) {
        
        this.numCotizacion = numCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajeInicial = porcentajeInicial;
        this.plazo = plazo;
        
    }
    
    // Constructor de copia
    public Cotizacion(Cotizacion cotizacion) {
        
    }

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajeInicial
     */
    public float getPorcentajeInicial() {
        return porcentajeInicial;
    }

    /**
     * @param porcentajeInicial the porcentajeInicial to set
     */
    public void setPorcentajeInicial(float porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public float calcularPagoInicial() {
        float pagoInicial = 0.0f;
        pagoInicial = (this.precio * this.porcentajeInicial) / 100;
        return pagoInicial;
    }
    
    public float calcularTotalFinanciar() {
        return this.precio - this.calcularPagoInicial();
    }
    
    public float calcularPagoMensual() {
        return this.calcularTotalFinanciar() / this.plazo;
    }
    
}
