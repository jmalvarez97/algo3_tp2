public class Banco implements Edificio{

    private Pista pista;
    private int contadorVisitas;

    public Banco(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Banco");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(Ciudad ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getMoneda());
    }

    @Override
    public void descontarHorasDePolicia(Policia policia){
        int horasASacar = Math.min(contadorVisitas, 3);
        policia.descontarHoras(horasASacar);
    }
}

