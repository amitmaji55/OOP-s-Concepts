class A{
    void show_a()
    {
        System.out.println("This is method no 1 :) "+c);
    }
}
class B extends A{
    void show_b()
    {
        System.out.println("This is method no 2 :) "+c);
    }
}

class C extends A {
   
    void show_c()
    {
        System.out.println("This is method no 2 :) ");
    }
}

class test{
    public static void main(String[] args) {
        C obj = new C();
        obj.show_a();

        B obj1 = new B();
        obj1.show_b();
    }
}
