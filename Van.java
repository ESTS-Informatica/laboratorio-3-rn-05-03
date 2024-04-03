/**
 
Escreva uma descrição da classe Van aqui.
@author (seu nome)
@version (um número da versão ou uma data)
*/
public class Van extends GroundTransportation{
    private int packages;

    public Van(String licensePlate, int packages){
        super(licensePlate);
        this.packages = packages;
    }
    public void setPackages(int packages){
        this.packages = packages;
    }
    public int getPackages(){
        return this.packages;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("%15s: %d\n", "Número de Pacotes", this.packages));
        return sb.toString();
    }
}
