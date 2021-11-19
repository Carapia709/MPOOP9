public class Cuenta{
  private double saldo;
  public int NumeroDeRetiros = 0;
  public Cuenta(){
    saldo = 0;
  }

  public void depositar(double monto) throws MontoMaximoException{
    System.out.println("Depositando...");
    if(monto>20000){
      throw new MontoMaximoException();
    }else{
      saldo+=monto;
    }
  }

  public void retirar(double monto) throws SaldoInsuficienteException, RetirosPermitidosExcedidiosException{
    System.out.println("Retirando...");
    if(saldo<monto){
      throw new SaldoInsuficienteException();
    }else{
      NumeroDeRetiros++;
      if(NumeroDeRetiros>3){
        throw new RetirosPermitidosExcedidiosException();
      }else{
        saldo-=monto;
      }
    }
  }

  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }
}