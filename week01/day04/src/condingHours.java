public class condingHours {
    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int codingHourPerDay = 6;
        int semester = 17;
        int averageWorkingHoursWeekly = 52;
        int averageWorkingHoursUnderSemester = averageWorkingHoursWeekly * semester;
        int codingHoursUnderSemester = (semester * 5) * codingHourPerDay;

        double codingHoursUnderSemesterDecimal = codingHoursUnderSemester;
        double averageWorkingHoursUnderSemesterDecimal = averageWorkingHoursUnderSemester;
        double percentageCodingHour = codingHoursUnderSemesterDecimal / (averageWorkingHoursUnderSemesterDecimal / 100);

        System.out.println(codingHoursUnderSemester + " hours what you coding under the semester");
        System.out.println(percentageCodingHour + "%" + " the percentage coding after the semester");
    }

}
