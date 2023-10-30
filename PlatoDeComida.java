public class PlatoDeComida{
    
    private String nombrePlato;
    private int numeroDeIngredientes;
    private boolean preparacionFacil;
    
    public PlatoDeComida(String nombreDelPlato, int numeroIngredientes){
        nombrePlato = nombreDelPlato;
        numeroDeIngredientes = numeroIngredientes;
        preparacionFacil = true;
    }
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    public int getNumeroDeIngredientes(){
        return numeroDeIngredientes;
    }
    
    public boolean getPreparacionFacil(){
        return preparacionFacil;
    }
    
    public void setNombrePlato(String nuevoNombre){
        nombrePlato = nuevoNombre;
    }
    
    public void anadirIngredientes(int cantidadNuevosIngredientes){
        numeroDeIngredientes += cantidadNuevosIngredientes;
    }
    
    public void cambiarDificultad(){
        if(preparacionFacil){
            preparacionFacil = false;
        }else{
            preparacionFacil = true;
        }
    }
    
    public void imprimirEstadoPlato(){
        String preparacionEnEspanol = "no";
        if(preparacionFacil == true){
            preparacionEnEspanol = "si";
        }
        System.out.println("Nombre del Plato: " + nombrePlato +" | N�mero de ingredientes: " + numeroDeIngredientes + " | Facil preparacion: " + preparacionEnEspanol);
    }
    
    public String getEstadoPlato(){
        String estadoPlato = "";
        String preparacionEnEspanol = "no";
        if(preparacionFacil == true){
            preparacionEnEspanol = "si";
        }    
        
        estadoPlato += ("Nombre del Plato: " + nombrePlato +" | N�mero de ingredientes: " + numeroDeIngredientes + " | Facil preparacion: " + preparacionEnEspanol); 
        return estadoPlato;
    }
}
    
    
    
