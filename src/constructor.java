public class constructor {
    public static void main(String[] args) throws Exception {
        MyClass obj=new MyClass(5,6);
        obj.show();
    }
}

class MyClass
{
    int a=0;
    int b=0;
    //addition using Constructor<imp>>
    public MyClass(int first, int second)
    {
        a=first;
        b=second;
    }
    public void show()
    {
        System.out.println(a+b);
    }
}
