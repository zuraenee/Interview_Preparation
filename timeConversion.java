public class timeConversion {
    public static String timeConversion(String s){
        int hour = Integer.parseInt(s.substring(0,2));
        //the reason why its this, is because were not modifying the horus and minutes, so leave it as string. and only make a substring ou tof it to put it in the final output
        String hoursandminutes = s.substring(2,8);
        //if you want to make hoursandminutes integer, separate them and parseInt each separately, doesnt work if its together cause there is :
        String timeofday = s.substring(8);
        if(timeofday.equalsIgnoreCase("AM") && hour == 12){
            hour = 0;
        }
        else if (timeofday.equalsIgnoreCase("PM") && hour < 12){
            hour += 12;
        }
        return String.format("%02d", hour) + hoursandminutes;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:42:12AM"));
        System.out.println(timeConversion("12:42:12PM"));
    }
}
