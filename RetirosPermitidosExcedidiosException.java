public class RetirosPermitidosExcedidiosException extends Exception{
  public RetirosPermitidosExcedidiosException(){
    super("No se puede realizar más de tres retiros en un día");
  }
}