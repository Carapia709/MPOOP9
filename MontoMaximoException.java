public class MontoMaximoException extends Exception{
  public MontoMaximoException(){
    super("No se puede depositar más de $20000 en una sola exhibición");
  }
}