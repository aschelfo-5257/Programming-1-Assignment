public class Conversions {
  private static final double feet_to_meters
  private static final double meters_to_feet

// Convert from feet to meters
public static double feetToMeter (double feet) {
  return feet;
}
  
// Convert from meters to feet
public static double meterToFeet (double feet) {
  return meter;
}

public static void main(String[] args) {
  double feet = 0.305;
  double meters = feetToMeters(feet);
  System.out.println(feet + "feet is equal to " + meters + " meters");
    
  double meters = 3.279;
  double feet = metersToFeet(meters);
  System.out.println(meters + "meters is equal to " + feet + " feet");
}}
