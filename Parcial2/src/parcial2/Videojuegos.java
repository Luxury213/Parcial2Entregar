package parcial2;

public class Videojuegos   {
    
   public final static int mayor = 1;
   public final static int menor = -1;
    public final static int igual = 0;
    
  private final static int horas_predeterminadas     =    100;
  
   
    
   
    
    private boolean entregado;
    
    
     private String titulo;
     
     
   private String genero;
   
    private int horasEstimadas;
    
    private String compañia;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
  
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    public int compareTo(Object a) {
        int estado = menor;
  
        Videojuegos ref=(Videojuegos)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado = mayor;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado = igual;
        }
  
        return estado;
    }

    public String toString(){
        return "Informacion del videojuego: Definitivamente una obra de arte al entretenimiento videojueguil de las adolescencias latinas \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia;
    }

    public boolean equals(Videojuegos a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
            return true;
        }
        return false;
    }

    public Videojuegos(){
        this("", horas_predeterminadas , "", "");
    }

    public Videojuegos(String titulo, String compañia){
        this(titulo, horas_predeterminadas , "", compañia);
    }

    public Videojuegos(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compañia=compañia;
        this.entregado=false;
    }
}

