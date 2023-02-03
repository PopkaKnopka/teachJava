package Method;

public class Person {

    String name;
    String city;
    int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public Person(){
        this("Default name", "Default City", 18);
    }

    public String getTextInfo() {
        return "��� " + name + "; ����� " + city + "; ������� " + age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName() {
        setName("Default name");
    }

    public void setCity() {
        setCity("Default city");
    }

    public void setAge() {
        setAge(18);
    }
    public void whoIsOlder(Person p){
        if (this.age > p.age) System.out.println(this.name + " ������ ��� " + p.name); 
        else if (this.age == p.age) System.out.println(this.name + " � " + p.name + " ����������"); 
        else System.out.println(this.name + " ������ ��� " + p.name); 
    }
    
}
