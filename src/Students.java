public class Students {
    private String firstName;
    private String lastName;
    private int id;
    private University university;

     Students(String lastName,String firstName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=10000;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String newStudent(){
        return this.firstName+this.lastName;
    }

}
