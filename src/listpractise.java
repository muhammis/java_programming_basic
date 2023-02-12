import java.util.LinkedList;

public class listpractise {

    public static void main(String []args){

        LinkedList<String> namelist = new LinkedList<>();

        namelist.add("Java");
        namelist.add("SE");
        namelist.add("Learning");
        namelist.add("Programming");
        namelist.add("University of Helsinki");

        System.out.println(" Elements: " + namelist);
        System.out.println(namelist.size());
        System.out.println(namelist.indexOf("SE"));
        System.out.println(namelist.contains("a"));

    }
}
