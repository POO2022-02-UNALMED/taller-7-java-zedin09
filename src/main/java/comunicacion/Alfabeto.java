package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (String letra: this.letras) {
            output.append(letra).append(", ");
        }
        output.deleteCharAt(output.length()-1);
        output.deleteCharAt(output.length()-1);
        return output.toString();
    }

    public int cantidadLetras(){
        return this.letras.length;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
