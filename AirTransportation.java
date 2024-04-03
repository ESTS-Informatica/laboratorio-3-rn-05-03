
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;
    private static double honorFee = 0.04;
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
    
    @Override
    public double getPriceWithFees(){
     return getFees() + getPrice();
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
    
    public String getTransportType(){
      return "Aerio";
  }
  
  @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination())); 
        sb.append(String.format("%15s: %4.2f€\n", "Honerário", honorFee));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        
        return sb.toString();
    }
}
