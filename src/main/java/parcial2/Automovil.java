package parcial2;

public class Automovil extends Vehiculo{
    // TODO: Tu código va aquí
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(int numeroPuertas, TipoCombustible tipoCombustible, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
       
    }
    

   
    public String imprimirinformacion(){
        return   getMarca() + getModelo() + getAño()  + numeroPuertas + tipoCombustible;
    }
  public int getNumeroPuertas(){
      return numeroPuertas;
  }
   public int setNumeroPuertas(){
      return numeroPuertas;
  }
   public TipoCombustible getTipoCombustible(){
       return tipoCombustible;
   }
}
