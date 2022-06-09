class A{
    int a,b;
    double am;
    void getdata(int i,int j)
    {
        a=i;
        b=j;
    }
    void calculate_am()
    {
        am = (a+b)/2;
    }
    void display_am()
    {
        System.out.println(am);
    }
}
class B extends A{
    double gm;

    void calculate_gm()
    {
        gm = Math.sqrt(a*b);
    }
    void display_gm()
    {
        System.out.println(gm);
    }
}

class C extends  B{
    double hm;

    void calculate_hm()
    {
        hm = 2*a*b/(a+b);
    }
    void display_hm()
    {
        System.out.println(hm);
    }
}
class  multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.getdata(10,20);
        obj.calculate_am();
        obj.display_am();
        obj.calculate_gm();
        obj.display_gm();
        obj.calculate_hm();
        obj.display_hm();
    }
}
