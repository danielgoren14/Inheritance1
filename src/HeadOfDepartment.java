public class HeadOfDepartment extends Person{
    private int seniority;
    private String expertise;
    private String academicDegree;

    public HeadOfDepartment(String firstName,String lastName,
                            int seniority,String expertise,String academicDegree){
        super(firstName,lastName);
        this.seniority = seniority;
        this.expertise = expertise;
        this.academicDegree = academicDegree;
    }

    public int getSeniority(){
        return this.seniority;
    }

    public String getExpertise(){
        return this.expertise;
    }

    public String getAcademicDegree(){
        return this.academicDegree;
    }

    public String toString(){
        return super.toString() +"\n years of seniority: "+
                this.seniority +"\n expertise: "+ this.expertise+
                "\n academic degree: "+ this.academicDegree;
    }


}
