public class Person {
    private String name;

    public static void main(String[] args) {
       Person person = new Person("Bob");
        person.getName();
     person.setName("Matthew");
     person.sayHello("Matt");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hello there " + name + "! Hope you have a great day!");
    }

    public Person(String name) {
        this.name = name;
    }
}
