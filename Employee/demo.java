/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

/**
 *
 * 
 */
public class demo {
    public static void main(String args[]){
        Employee e=new Employee("pratik gohil","surendranagar",123456789,100000,20,"afa");
        System.out.println(e);
        manager m=new manager("pratik gohil","surendranagar",123456789,100000,20,"afa");
        System.out.println(m);
    }
}
