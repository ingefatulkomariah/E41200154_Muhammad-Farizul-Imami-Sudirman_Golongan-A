/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_temenan;

/**
 *
 * @author Acer
 */
class person {
    String getName;
    int getAge;
    
   public void set (String getName, int getAge) {
       this.getName = getName;
       this.getAge = getAge;
   }
   public String getName() {
       return getName;
   }
   public int getAge() {
       return getAge;
   }
}
public class ManagingPeople {
    public static void main(String[] args) {
        
        person p1 = new person();
        p1.set("farizul ", 19);
        person p2 = new person ();
        p2.set(" Sudirman", 52);
        
        if(p1.getAge () == p2.getAge()) {
            System.out.println(p1.getName() + "umurnya sama dengan" + p2.getName());         
        }
        else {
            System.out.println(p1.getName() + "umurnya berbeda dengan" + p2.getName());
        }
    }
}
