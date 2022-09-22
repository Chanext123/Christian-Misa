
package acti;

public class Acti implements inter{

  
 
   public String Name(String name){
      return name; 
   }

 

    public int age(int age){
        return age;
    }
    

    public static void main(String[] args) {
       
        generic Id_number = new generic(21103847, "Male");
        
        Acti main = new Acti();
        specific myObj = new specific();
        System.out.println("Age: "+myObj.age);
        System.out.println("My Real Name: " +myObj.name);
        System.out.println("");
        System.out.println("My nickname: "+ main.Name("chanext"));
        System.out.println("");
        System.out.println("This my USC ID number is " + Id_number.getIdno());
        System.out.println("and my Gender is " + Id_number.getGender() );
    }
    
}
