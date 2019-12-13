package frc.robot;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;


public class NavX
{
    public AHRS ahrs = new AHRS(SPI.Port.kMXP);
    public double getBarometricPressure(){
        return ahrs.getBarometricPressure();
    }
    public double getHeading(){
        return ahrs.getAngle();
    }
    public double getTempC(){
        return ahrs.getTempC();
    }
    public void reset(){
        ahrs.reset();
    }

}