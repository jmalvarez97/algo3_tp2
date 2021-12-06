public class Reloj {

    private int horasRestantes;

    public Reloj(){
        this.horasRestantes = 154;
    }

    public void descontarHoras(int horas){
        this.horasRestantes = this.horasRestantes - horas;
    }

    public int horasRestantes(){
        return this.horasRestantes;
    }
}
