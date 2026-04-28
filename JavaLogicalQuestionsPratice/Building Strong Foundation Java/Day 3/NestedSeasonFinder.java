public class SeasonFinder {
    public static void main(String[] args) {

        int month = 7;
        int day = 15;

        String season;

        if (month == 3) {
            if (day <= 20) {
                season = "Winter";
            } else {
                season = "Spring";
            }

        } else if (month == 6) {
            if (day <= 20) {
                season = "Spring";
            } else {
                season = "Summer";
            }

        } else if (month == 9) {
            if (day <= 20) {
                season = "Summer";
            } else {
                season = "Autumn";
            }

        } else if (month == 12) {
            if (day <= 20) {
                season = "Autumn";
            } else {
                season = "Winter";
            }

        } else if (month == 1 || month == 2) {
            season = "Winter";

        } else if (month == 4 || month == 5) {
            season = "Spring";

        } else if (month == 7 || month == 8) {
            season = "Summer";

        } else { // 10, 11
            season = "Autumn";
        }

        System.out.println(season);
    }
}