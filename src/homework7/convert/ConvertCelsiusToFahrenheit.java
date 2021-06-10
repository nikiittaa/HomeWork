package homework7.convert;

public class ConvertCelsiusToFahrenheit implements Converter {


    @Override
    public void convert(int celsius) {
        double f = ((celsius * 1.8) + 32);
        System.out.println("Celsius: " + celsius + " to fahrenheit: " + f);

    }
}

