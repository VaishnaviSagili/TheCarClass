public class Car {
    private String m_make;
    private String m_model;
    private double m_fuelCapacity;
    private double m_currentFuel;
    private double m_mpg;

    public Car(String make, String model, double fuelCapacity, double mpg){
        m_make = make;
        m_model = model;
        m_mpg = mpg;
        m_fuelCapacity = fuelCapacity;
        m_currentFuel = fuelCapacity;
    }

    public String getMake(){
        return m_make;
    }

    public String getModel(){
        return m_model;
    }

    public double getCurrentFuel(){
        return m_currentFuel;
    }
    
    private void updateFuel(double numOfGallons){
        if (numOfGallons > 0 && numOfGallons < m_fuelCapacity){
            m_currentFuel = m_currentFuel + numOfGallons;
        }
    }

    public void drive (int miles){
        double fuelUsed = miles/m_mpg;
        if (fuelUsed > m_currentFuel){
            fuelUsed = m_currentFuel;
        }
        updateFuel(-fuelUsed);
        System.out.println(m_make + " " + m_model + " " + fuelUsed*m_mpg + " miles.");
    }

    public void refuel(double fuel){
        updateFuel(fuel);
        System.out.println(m_make + " " + m_model + " refueled. Current fuel: " + fuel + " gallons.");
    }
}

