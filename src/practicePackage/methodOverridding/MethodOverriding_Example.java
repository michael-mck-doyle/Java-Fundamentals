package practicePackage.methodOverridding;

class MethodOverriding_Example {


    public static void main(String[] args) {


        //Weather todaysWeather = new Weather(27,"Cloudy");


        //todaysWeather.weatherForecast(25,"Cloudy");


        //Rain rainToday = new Rain(23,"Rain", 10,"Heavy");

        //rainToday.weatherForecast(27,"Rain");

        //rainToday.tomorrowForecast(27, "Rain", 15, "Heavy");

        //Weather drizzle = new Rain(12,"drizzle",5, "light");

        //((Rain) drizzle).tomorrowForecast(12,"drizzly",5,"light");

        //drizzle.weatherForecast(25,"Sunny");

        //Rain fiveDayForecast = new Rain(23,"sunny",2,"light");

        //fiveDayForecast.fiveDayForecast(25,"Bright & Sunny", 2, "light");


        Rain newDay = new Rain(25,"Sunny", 2, "breezy");

        newDay.parentAndChildMethods(25, "Bright & Breezy");

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
             " degrees Centigrade. *** Note, This is the parent method!! ***");
    }

}

class Rain extends Weather {

    private int rainfall;
    private String rainType;

    public Rain(int temperature, String forecast, int rainfall, String rainType) {
        super(temperature, forecast);
        this.setRainfall(rainfall);
        this.setRainType(rainType);

    }

    @Override
    public void weatherForecast(int temperature, String forecast) {

        System.out.println("Today is expected to be " + forecast + " with a temperature of " + temperature +
                " degrees Centigrade.");
        System.out.println("This child method is different from the parent method.  It @Overrides the parent method!");

    }

    public void tomorrowForecast(int temperature, String forecast, int rainfall, String rainType){

            System.out.println("Tomorrow is expected to be " + forecast + " with " + rainType +
                    " rain and approx " + rainfall + "mls of rain is expected. The temperature will be around "
                    + temperature + " degrees Celsius.");

        }

    public void fiveDayForecast(int temperature, String forecast, int rainfall, String rainType){
        this.weatherForecast(temperature,forecast);
        this.tomorrowForecast(temperature,forecast,rainfall,rainType);
    }

    public void parentAndChildMethods(int temperature, String forecast){
        super.weatherForecast(temperature, forecast);
        this.weatherForecast(temperature,forecast);
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public String getRainType() {
        return rainType;
    }

    public void setRainType(String rainType) {
        this.rainType = rainType;
    }
}
