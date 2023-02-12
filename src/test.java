import  java.util.Arrays;
public class test {
    public  static void main(String[] args){

     String[] weekday = new String[7];
        System.out.println(Arrays.toString(weekday));

        weekday[0] = "Monday";

        System.out.println(Arrays.toString(weekday));

        weekday = new String[]{"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekday));

        for (String day: weekday){
            System.out.println("week day: " + day);
        }



    }
}
