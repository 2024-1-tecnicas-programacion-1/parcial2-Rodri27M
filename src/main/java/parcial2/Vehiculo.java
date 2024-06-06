package parcial2;

public class Vehiculo {
    // TODO: Tu código va aquí
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        
    }
    public String imprimirInformacion(){
        return  marca + modelo + año;
    }
   public String getMarca(){
       return marca;
   }
   public String setMarca(String honda){
       
        return null;
       
   }
   public String getModelo( String civic){
       return modelo;
   }
   public String setModelo( String Cicic){
       return null;
   }
   public int getAño(){
       return año;
   }
   public int setAño(int 2021){
       return año;
   }

  
}
