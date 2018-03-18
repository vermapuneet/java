
package covarient;

class A
{ int x=5;
    A m1()
    {
        return new A();
        
    }
}
class B extends A
{ int x=10;
@Override
A m1()
{
    return new A();
}
    
}
public class Covarient {

    public static void main(String[] args) {
      
        A b=new B();
        System.out.println(b.m1().x);
        B b1=new B();
        System.out.println(b1.m1().x);
        
    }
    
}
