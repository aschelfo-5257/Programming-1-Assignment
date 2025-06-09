public class Conversions {
  private static final double feet_to_meters = 0.305;
  private static final double meters_to_feet = 3.279;

// Convert from feet to meters
public static double feetToMeters (double feet) {
  return feet * feet_to_meters;
}
  
// Convert from meters to feet
public static double metersToFeet (double meters) {
  return meters * meters_to_feet;
}

// Main method for Conversions
public static void main(String[] args) {
  double feet = 0.305;
  double meters = feetToMeters(feet);
  System.out.println(feet + "feet is equal to " + meters + " meters");
    
  meters = 3.279;
  feet = metersToFeet(meters);
  System.out.println(meters + "meters is equal to " + feet + " feet");
}}
