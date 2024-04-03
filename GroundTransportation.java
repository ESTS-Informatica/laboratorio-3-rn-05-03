
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
    private static double honorFee = 0.3;
    private String plate;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String plate)
    {
        super();
        this.plate=plate;
        setFees(honorFee);
    }
   
    public String getLicensePlate() {
        return licensePlate;
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
}
   
