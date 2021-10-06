package web.model;

public class Car {

    public String model;
    public int year;
    public boolean isAccident;

    public Car(String model, int year, boolean isAccident) {
        this.model = model;
        this.year = year;
        this.isAccident = isAccident;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getAccident() {
        return isAccident;
    }

    public void setAccident(boolean accident) {
        isAccident = accident;
    }
}
