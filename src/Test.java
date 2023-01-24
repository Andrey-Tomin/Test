class A{
  int age;
  String name;
    A(){
        System.out.println("Конструктор без аргументов класса A");
    }

    A(String args){
        System.out.println("Конструктор с одним аргументом класса A");
    }

    public A SetName(String name){
        this.name = name;
        return this;
    }

    public A SetAge(int age){
        this.age = age;
        return this;
    }
    public void PrintAll(){
        System.out.println("My name is " + name + " I am " + age + " old");
    }
    public int V1(int s){
        int s1 = s;
        return s1;
    }
    public int I1(int s){
        int s1 = s;
        return s1;
    }
}

class B extends A{

    B(){
        this(""); // вызов конструктора с одним аргументом класса B
        //super("");
        System.out.println("Конструктор без аргументов класса B");
    }

    B(String args){
        super(""); // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с одним аргументом класса B");
    }
}

class C extends B{

    C(){
        this(""); // вызов конструктора с одним аргументом класса B
        //super("");
        System.out.println("Конструктор без аргументов класса C");
    }

    C(String args){
        super(""); // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с одним аргументом класса C");
    }
}




// Тест-класс и вывод
public class Test {

    public static void main(String args[]) {
        C b = new C();
        b.V1(3);
        b.SetName("Andrei").SetAge(39).PrintAll();

    }

}