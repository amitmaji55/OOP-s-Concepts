class Animal{
    void eat(){
        System.out.println("Every animal eats something");
    }
}
class Dog extends Animal{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}
