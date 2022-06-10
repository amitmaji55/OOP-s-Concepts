/*
Polymorphism in java - <<Poly - Many and Morphism _ Forms>>
In case of method overriding
REQ:(SAME NAME|| DIFF CLASS ||SAME ARGUMENTS(no of , seq of, types of));
Real Life Example --> As Water have many states like - (Solid, Liquid,Gas);
polymorphism are of two types ==>
Compile Time Polymorphism ACHIEVE THROUGH -->>(Method Overloading) also called as Static polymorphism
Run Time Polymorphism ACHIEVE THROUGH -->> (Method Overriding) also called as Dynamic polymorphism
 */

//**( METHOD OVERRIDING) **//

 class test{
     void show()
     {
         System.out.println("This is the best coding language ever");
     }
 }
 class tester extends test{

     void show()
     {
         System.out.println("python is easy to learn");
     }

     public static void main(String[] args) {
         tester obj = new tester();
         obj.show();
     }
 }
/*
 here the output will be : "python is easy to learn"
 because the object of the main method will get more priority than other methods of any other declared
 classes
 */

/*
***** DO OVERRIDE METHOD MUST HAVE SAME RETURN TYPE??
 => from java 5.0 onwards it is possible to have different return type for an overriding method
  in child class but child;s return type should be subtype of parents return type;
 This phenomena is known as co variant return type

 */


class tests{

    Object show() {
        System.out.println("1");
        return null;
    }
}

class xyz extends tests{
    String show()
    {
        System.out.println("2");
        return null;
    }

    public static void main(String[] args) {
        xyz ob1 = new xyz();
        ob1.show();

        tests ob2 = new tests();
        ob2.show();
    }

}






