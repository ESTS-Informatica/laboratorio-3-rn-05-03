
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
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation()
    {
        super();
        setFees(honorFee);
    }

   
}
