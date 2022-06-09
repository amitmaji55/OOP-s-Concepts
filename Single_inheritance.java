class A{
    void showA()
    {
        System.out.println("This is method 1");
    }
}
class B extends  A{
    void showB()
    {
        System.out.println("This is method 2");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }

}
