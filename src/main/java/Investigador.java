public class Investigador implements Policia{
    private Reloj reloj;
    private int horasPorHeridaCuchillo;
    private int velocidad;

    public Investigador(){
        this.horasPorHeridaCuchillo = 2;
        this.reloj = new Reloj();
        this.velocidad = 1300;
    }

    public int horasRestantes(){
        return this.reloj.horasRestantes();
    }

    public int hora(){
        return this.reloj.hora();
    }

    @Override
    public void descontarHoras(int horas) {
        this.reloj.descontarHoras(horas);
    }

    public void herirConCuchillo(){
        this.descontarHoras(horasPorHeridaCuchillo);
        this.horasPorHeridaCuchillo = 1;
    }

    public int velocidad(){ return this.velocidad;}
}
