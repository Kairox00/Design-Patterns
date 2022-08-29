package Structural.Adaptor;

public class WeatherWarnings {

    public static double MAX_TEMPERATURE = 100;
    public static double MIN_TEMPERATURE = 16;

    public void postWarning(City city){
        if(city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE){
            System.out.printf("Warning! Current temperature in %s is %f %s\n",
                    city.getName(), city.getTemperature(), city.getTemperatureScale());
            city.setHasWeatherWarning(true);
        }
        else{
            System.out.printf("Temperature in %s is OK\n", city.getName());
        }
    }
}
