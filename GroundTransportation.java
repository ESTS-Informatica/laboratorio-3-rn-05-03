
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    private static double honorFee = 0.03;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        super();
        this.licensePlate = licensePlate;
        setFees(honorFee);
    }
   
    public String getLicensePlate() {
        return licensePlate;
    }
    @Override
    public double getPriceWithFees(){
    return getFees() + getPrice();
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public static double getHonorFee() {
        return honorFee;
    }

    public static void setHonorFee(double honorFee) {
        GroundTransportation.honorFee = honorFee;
    }
    
    public String getTransportType(){
      return "Terrestre";
  }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        sb.append(String.format("%15s: %4.2f%%\n", "Taxa Honoraria", honorFee));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}
   
