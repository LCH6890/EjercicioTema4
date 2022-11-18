public class SmartDevice {
    String fabricante;
    String model;
    Double peso;
    Integer year;
    Boolean android;

    public SmartDevice (){

    }
    public SmartDevice(String fabricante, String model, Double peso, Integer year, Boolean android){
    this.fabricante = fabricante;
    this.model = model;
    this.peso = peso;
    this.year = year;
    this.android = android;
    }
}
