public class ClimateChange{
    public static void main(String[] args) {
        
        int numYears = 5;

        double baseIncrease = 0.02;
        double additionalIncrease = 0.002;

        double[] temperatures = {15.0, 25.0, 18.0, 5.0};

        for (int year = 2; year <= numYears; year++) {
            for (int i = 0; i < 4; i++) {
                temperatures[i] += temperatures[i] * (baseIncrease + (year - 1) * additionalIncrease);
            }
        }
        System.out.print("Year " + numYears + " Temperatures - ");
        for (int i = 0; i < 4; i++) {
            String seasonName = "";
            switch (i) {
                case 0:
                    seasonName = "Spring";
                    break;
                case 1:
                    seasonName = "Summer";
                    break;
                case 2:
                    seasonName = "Autumn";
                    break;
                case 3:
                    seasonName = "Winter";
                    break;
            }
            System.out.print(seasonName + ": " + String.format("%.2f°C", temperatures[i]));
            if (i < 3) {
                System.out.print(", ");
            }
        }
    }
}
