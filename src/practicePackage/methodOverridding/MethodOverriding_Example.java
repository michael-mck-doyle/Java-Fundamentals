package practicePackage.methodOverridding;

class MethodOverriding_Example {


    public static void main(String[] args) {


        Weather todaysWeather = new Weather(27,"Cloudy");


        todaysWeather.weatherForecast(25,"Cloudy");


        Rain rainToday = new Rain(23,"Rain", 10,"Heavy");

        rainToday.weatherForecast(27,"Rain");

        rainToday.tomorrowForecast(27, "Rain", 15, "Heavy");


    }

}




class Weather {

    int temperature;
    String forecast;

    public Weather(int temperature, String forecast) {

        this.temperature = temperature;
        this.forecast = forecast;
    }

    public void weatherForecast (int temperature, String forecast){

        System.out.println("Today is expected to be " + forecast + " with a temperature of " + temperature +
             " degrees Centigrade.");
    }

}

class Rain extends Weather {

    int rainfall;
    String rainType;

    public Rain(int temperature, String forecast, int rainfall, String rainType) {
        super(temperature, forecast);
        this.rainfall = rainfall;
        this.rainType = rainType;

    }

    @Override
    public void weatherForecast(int temperature, String forecast) {

        System.out.println("Today is expected to be " + forecast + " with a temperature of " + temperature +
                " degrees Centigrade.");
        System.out.println("This child method is different from the parent method.  It @Overrides the parent method!");

    }

    public void tomorrowForecast(int temperature, String forecast, int rainfall, String rainType){

            System.out.println("Tomorrow is expected to be " + forecast + " with " + rainType +
                    " rain with approx" + rainfall + "mls of rain expected. The temperature will be around "
                    + temperature + " degrees Celsius.");


        }
    }
