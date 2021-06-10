package homework7.convert;

public class ConvertCelsiusToKelvin implements Converter {

    @Override
    public void convert(int celsius) {
        double t = ((celsius + 273.15));
        System.out.println("Celsius: " + celsius + " to kelvin: " + t);
    }
}
