package EX2;

public class Car {
    String brand;
    String model;
    String color;
    int horsePower;
    String engine;
    int girBox;
    String year;

    public Car(String brand, String model, String color, int horsePower, String engine, int girBox, String year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.engine = engine;
        this.girBox = girBox;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public String getEngine(){
        return engine;
    }
    public int getGirBox(){
        return girBox;
    }
    public String getYear(){
        return year;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public void setGirBox(int girBox){
        this.girBox = girBox;
    }
    public void setYear(String year){
        this.year = year;
    }
}
