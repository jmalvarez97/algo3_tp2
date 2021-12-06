public class Novato implements Policia{
    private Reloj reloj;
    private int horasPorHeridaCuchillo;

    public Novato(){
        this.horasPorHeridaCuchillo = 2;
        this.reloj = new Reloj();
    }

    public int horasRestantes(){
        return this.reloj.horasRestantes();
    }

    @Override
    public void descontarHoras(int horas) {
        this.reloj.descontarHoras(horas);
    }

    public void herirConCuchillo(){
        this.descontarHoras(horasPorHeridaCuchillo);
        this.horasPorHeridaCuchillo = 1;
    }
}
