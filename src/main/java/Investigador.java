public class Investigador  implements Policia{
    private int cantidadDeArrestos;
    private int horasPorHeridaCuchillo;

    public int horasRestantes(){
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
