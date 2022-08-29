package Structural.Adaptor;

public class AsianAdaptor implements City{
    City asianCity;

    public AsianAdaptor(AsianCity asianCity) {
        this.asianCity = asianCity;
    }

    @Override
    public String getName() {
        return asianCity.getName();
    }

    @Override
    public double getTemperature() {
        return (asianCity.getTemperature() * 1.8) + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return asianCity.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        asianCity.setHasWeatherWarning(hasWeatherWarning);
    }
}
