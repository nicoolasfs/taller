
public class Argelia extends Pais{

    Arabe a=new Arabe();
    Calcular c=new Calcular();
    private String gentilicio, moneda, capital, idioma, texto;
    private double calcular;
    
    public double getCalcular() {
        return calcular;
    }
    public void setCalcular(double calcular) {
        this.calcular = calcular;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }   
    public String getGentilicio() {
        return gentilicio;
    }
    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }
    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public Argelia(String pais,double cantidad, String palabra) {
        super(pais, cantidad, palabra);
       completar();
    }
    
    public void completar(){
        setGentilicio("argelino");
        setMoneda("dinar");
        setCapital("argel");
        setIdioma("arabe");
        setTexto( a.traduccion(palabra));
        setCalcular(c.calcularValor((int) cantidad, 0.035));
    }
    public String implimir(){
        String  todo=" <font color=\"black\">"+"Pais: "+getPais()+"<br>"+"Capital: "+getCapital()+"<br>Idioma: "+getIdioma()+"<br>Moneda: "+getMoneda()+"<br>Gentilicio: "+getGentilicio()+"<br>"+palabra+"="+getTexto()+"<br>"+cantidad+"="+getCalcular();
        return todo;
    }
    
     
}
