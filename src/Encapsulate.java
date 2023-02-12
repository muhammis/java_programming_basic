class testing{

    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
}


public class Encapsulate {
    public static void main(String[] args){

        testing obj = new testing();
        obj.setAge(37);
        obj.setName("Ishfaq");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
