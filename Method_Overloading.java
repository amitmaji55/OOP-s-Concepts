/*
Polymorphism in java - <<Poly - Many and Morphism _ Forms>>
REQ:(SAME NAME|| SAME CLASS ||DIFF ARGUMENTS(no of , seq of, types of));
Real Life Example --> As Water have many states like - (Solid, Liquid,Gas);
polymorphism are of two types ==>
Compile Time Polymorphism ACHIEVE THROUGH -->>(Method Overloading) also called as Static polymorphism
Run Time Polymorphism ACHIEVE THROUGH -->> (Method Overriding) also called as Dynamic polymorphism
 */

//**( METHOD OVERLOADING) **//

class A{
    void show(int a)
    {
        System.out.println("integer method");
    }

    void show(){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.show(10);
    }
}

/*
Can we Override the main method??
=> Yes, in java main method can be overloaded because jvm will call the main method
 so it is passing the argument as a string in the main method . It can be overloaded
 */

class B {
    public static void main(String[] args) {
        B obj1 = new  B();
        obj1.main("pass");
        System.out.println("First method");
    }

    public static void main(String abc) {
        System.out.println("Second method");
    }
}

