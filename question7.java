class Persons
{
    int age;
    String name;
    Persons()
    {
        age=30;
        name="Nirakar";
    }
    void display()
    {
        System.out.println("Name:" +name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        Persons p1=new Persons();
        p1.display();
    }

}