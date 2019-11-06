
public class Arabe implements idioma{
    private String palabra;
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public String traduccion(String p) {
        switch (p){
            case "HOLA":
                palabra="marhabaan";
                break;
            case "ADIOS":
                palabra="wadaeaan";
                break;
            case "BUENOS DIAS":
                palabra="sabah alkhyr";
                break;
            case "BUENAS TARDES":
                palabra="masa' alkhayr";
                break;
            case "BUENAS NOCHES":
                palabra="laylatan saeida";
                break;
        }
        
        return palabra;
    }
    
}
