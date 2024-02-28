public class Person {  
    private String name;  
    private int age;  
  
    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void printDetails() {  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);  
    }  
  
    public static void main(String[] args) {  
        Person person = new Person("Alice", 25);  
        person.printDetails();  
    }  
}