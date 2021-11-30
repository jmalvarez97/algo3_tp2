public class Novato implements Policia{
    private int cantidadDeArrestos;

    public Novato(){
        this.cantidadDeArrestos = 154;
    }

    public int horasDisponibles(){
        return this.cantidadDeArrestos;
    }

    @Override
    public void descontarHoras(int horas) {
        this.cantidadDeArrestos = this.cantidadDeArrestos - horas;
    }
}
