public class Student extends Person {
    private int cardNumber;

    public Student(String firstName,String lastName,int cardNumber) {
        super(firstName, lastName);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber(){
        return this.cardNumber;
    }

    @Override
    public String toString() {
        return super.toString() +"\n card number: "+ this.cardNumber;
    }


}
