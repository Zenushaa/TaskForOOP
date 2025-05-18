public class Dog {
    String name;
    int age;
    String color;

    void bark(){
        System.out.println(name+ " can bark");
    }
    void wag(){
        System.out.println(name+ " wag its tail");
    }
    void printDetail(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nColor: "+color);
    }
}
