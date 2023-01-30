public class soda {
    public static void main(String[] args) {
        final double SWEETENERTO_KILLMOUSE = 0.001;
        final int MOUSE_WEIGHT = 30;
        final int STARTING_WEIGHT = 150;
        final int DESIRED_WEIGHT = 120; 
        final double SODA_PERCENTAGE = 0.001; // percentage of artificial sweetener in diet soda

        // convert pounds to grams
        int weightInGrams = (int) (STARTING_WEIGHT * 453.59237);

        // calculate the amount of sweetener the dieter can have
        double sweetenerAmount = SWEETENERTO_KILLMOUSE / (MOUSE_WEIGHT / weightInGrams);

        // calculate the amount of soda the dieter can safely drink
        double sodaAmount = sweetenerAmount / SODA_PERCENTAGE;

        System.out.println("You can safely drink up to " + sodaAmount + " grams of diet soda.");
    }
}