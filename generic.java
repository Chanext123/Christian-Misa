
package acti;


public class generic {
    private int IDnum;
    private String gender;
   
   public generic(int IDnum, String gender){
        super();
        this.IDnum = IDnum;
        this.gender = gender;
    }
   
   public int getIdno() {
        return IDnum;
    }
    public String setIdno(int IDnum){
        this.IDnum = IDnum;
        return null;
    }
    public String getGender() {
        return gender;
    }
    public String setGender(String gender){
        this.gender = gender;
        return null;
    }
    
}

