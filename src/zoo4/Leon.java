package zoo;

/**
 *Clase leon del Zoológico/ que se hereda de la clase Mamifero (por que pone extends Mamifero).
 * 
 * @author osds
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     *
     */
    public Leon () {}
    
    /**
     *Constructor con 4 parámetros, parametrizado
     * @param habitat: habitatl del león
     * @param comida: Comida del león
     * @param longevidad: cuanto vive expresado en años
     * @param periodoLactancia: Tiempo de lactancia
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     **Método para establecer el mensaje de rugido
     * @param rugido
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     **Método para obtener el mensaje de rugido
     * @return string con el mensaje de rugido.
     */
    public String getRugido () { return rugido; }
    
    /**
     *Método para que el león emita un sonido.
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     *Método para que el león coma.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *Método para que el león se mueva.
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
