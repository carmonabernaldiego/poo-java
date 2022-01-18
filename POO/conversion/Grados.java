package conversion;

public class Grados {
	private double gradosCelsius;
	private double gradosFahrenheit;
	private double gradosKelvin;
	
	public Grados(double gradosC) {
		gradosCelsius = gradosC;
	}
	
    public double getCelsius()
    {
        return gradosCelsius;
    }
    
    public void convertFahrenheit()
    {
    	gradosFahrenheit = 32 + (9 * gradosCelsius / 5);
    }
    
    public double getFahrenheit()
    {
        return gradosFahrenheit;
    }
    
    public void convertKelvin()
    {
    	gradosKelvin = gradosCelsius + 273.15;
    }
    
    public double getKelvin()
    {
        return gradosKelvin;
    }
}