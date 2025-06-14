import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("New observer is registered.");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer is de-registered.");
    }

    @Override
    public void notifyObserver() {
        System.out.println("----- Let's notify -----");
        for(Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void measurementChange() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }
}
