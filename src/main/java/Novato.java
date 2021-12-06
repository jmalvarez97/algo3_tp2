public class Novato implements Policia{
    private int cantidadDeArrestos;
    private int horasPorHeridaCuchillo;

    public Novato(){
        this.cantidadDeArrestos = 154;
        this.horasPorHeridaCuchillo = 2;
    }

    public int horasDisponibles(){
        return this.cantidadDeArrestos;
    }

    @Override
    public void descontarHoras(int horas) {
        this.cantidadDeArrestos = this.cantidadDeArrestos - horas;
    }

    public void herirConCuchillo(){
        this.descontarHoras(horasPorHeridaCuchillo);
        this.horasPorHeridaCuchillo = 1;
    }
}
