package parcial2;

public class Motocicleta extends Vehiculo{
    // TODO: Tu código va aquí
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int ano,TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, ano);
        this.tipoMotocicleta = tipoMotocicleta;
        
    }

    public String imprimirInformacion(){
        return  getMarca() + getModelo()  + getAño() + getTipoMotocicleta();
 }

    private TipoMotocicleta getTipoMotocicleta() {
       return tipoMotocicleta;
    }
    }

