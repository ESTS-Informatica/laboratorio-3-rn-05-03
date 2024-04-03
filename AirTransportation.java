
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;
    private static double honorFee = 0.4;
  public AirTransportation(){
      super();
      this.name = "";
      this.numberOfContainers = 0;
      setFees(honorFee);
    }
  public AirTransportation(String name, int numberOfContainers){
      super();
      this.name = name;
      this.numberOfContainers = numberOfContainers;
      setFees(honorFee);
    }
    
  public void setName(String name){
      this.name = name;
    }
    
  public void setNumberOfContainers(){
      this.numberOfContainers = numberOfContainers;
    }
    
  public String getName(){
      return this.name;
    }
    
  public int getNumberOfContainers(){
      return this.numberOfContainers;
    }
}
