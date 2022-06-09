/*
Encapsulation in java mechanism of  wrapping up of all the data and the code acting on the data
together as a single unit ;
Real Life Example : Capsule(several medicines combined together)
 */
class Employee{

    private int emp_id;

    public void set_id(int eid)
    {
            emp_id = eid;
    }
    public int get_id()
    {
        return  emp_id;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.set_id(101);
        System.out.println(obj.get_id());
    }
}
