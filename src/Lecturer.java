public class Lecturer extends Person{
    private int seniority;

    public Lecturer(String firstName,String lastName,int seniority){
        super(firstName,lastName);
        this.seniority = seniority;
    }

    public int getSeniority(){
        return this.seniority;
    }

    public String toString(){
        return super.toString() + "\n years of seniority: " + this.seniority;
    }



}
