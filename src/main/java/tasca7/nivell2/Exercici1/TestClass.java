package tasca7.nivell2.Exercici1;


// cambiar path manualmente
@AnotJson(path="C:/Cosas/test.json")
public class TestClass {
    
    private String name;

    private int age;

    private String something;

    public TestClass(String name, int age, String something) {
        this.name = name;
        this.age = age;
        this.something = something;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    

    


}
