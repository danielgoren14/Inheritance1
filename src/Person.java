public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName+" "+this.lastName;
    }

    public String toString(){
        return " first name: " + this.firstName + "\n last name:" + this.lastName;
    }
}
