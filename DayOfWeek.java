public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static int getWorkingHours(DayOfWeek day)
    {
        int NumberHours = 0;
        if(day == SATURDAY || day == SUNDAY)
            return NumberHours;
        for( int i = day.ordinal(); i <= DayOfWeek.FRIDAY.ordinal(); i++)
        {
            NumberHours +=8;

        }
        return NumberHours;
    }
}
