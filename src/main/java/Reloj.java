public class Reloj {

    private int horasRestantes;
    private int horasDia;

    public Reloj(){
        this.horasRestantes = 154;
        this.horasDia = 7;
    }

    public void descontarHoras(int horas){
        this.horasRestantes = this.horasRestantes - horas;
        this.horasDia = this.horasDia + horas;

        if(horasDia >= 23){
            this.horasRestantes = this.horasRestantes - 8; // El policia duerme 8h
            this.horasDia += 8 - 24; // Se despierta 8h despues de irse a dormir
        }
    }

    public int horasRestantes(){
        return this.horasRestantes;
    }

    public int hora(){
        return horasDia;
    }
}
