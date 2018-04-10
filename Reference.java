/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
class A
{
    
}
class E extends A
{
    
}
class B extends A
{
    
}
class C extends B
{
    
}
class D extends B
{
    
}

public class Reference {

    
    public static void main(String[] args) {
        A a=new C();
         B b=(B)a;
         E e=new E();
         A a1=new D();
         D d=new D();
        
         d=(D)b;//class casting exception at runtime
         a1=e;
         System.out.println("Success");
         
         
        

    }
    
}
