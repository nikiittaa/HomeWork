package homework7.convert;

public class Converters {
    public static void main(String[] args) {
        ConvertCelsiusToFahrenheit cctf = new ConvertCelsiusToFahrenheit();
        cctf.convert(9);

        ConvertCelsiusToKelvin cctk = new ConvertCelsiusToKelvin();
        cctk.convert(9);
    }
}
