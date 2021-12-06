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
            this.horasRestantes = this.horasRestantes - (31 - horasDia); // El policia duerme lo que alcance hasta las 7 am
            this.horasDia = 7;
        }
    }

    public int horasRestantes(){
        return this.horasRestantes;
    }

    public int hora(){
        return horasDia;
    }
}
