public class Aeropuerto implements Edificio{

    private Pista pista;
    private int contadorVisitas;


    public Aeropuerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Aeropuerto");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(Ciudad ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getColores());
    }

    @Override
    public void descontarHorasDePolicia(Policia policia){
        int horasASacar = Math.min(contadorVisitas, 3);
        policia.descontarHoras(horasASacar);
    }
}
