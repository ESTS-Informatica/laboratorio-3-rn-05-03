
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private int numberOfPlates;
   private int trailers;
    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(int numberOfPlates, int trailers, String LicensePlate)
    {
       super(LicensePlate); 
       this.numberOfPlates=numberOfPlates;
       this.trailers = trailers;
    }

    
}
