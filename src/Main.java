public class Main {
    public static void main(String[] args)
    {
        double fallMaintenanceCost = 48.59;
        double winterMaintenanceCost = 67.88;
        double springMaintenanceCost = 39.88;
        double summerMaintenanceCost = 58.77;

        double totalMaintenanceCost;
        totalMaintenanceCost = fallMaintenanceCost + winterMaintenanceCost + springMaintenanceCost + summerMaintenanceCost;

        System.out.println("The fall maintenance cost ($" + fallMaintenanceCost + ") plus the winter maintenance cost ($" + winterMaintenanceCost + ") plus the spring maintenance cost ($" + springMaintenanceCost + ") plus the summer maintenance cost ($" + summerMaintenanceCost + ") adds up to a total maintenance cost of $" + totalMaintenanceCost);
    }
}