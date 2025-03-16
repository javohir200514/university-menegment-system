import java.util.Arrays;

public class University {
    private Students[] student=new Students[4];
    private String name;
    private String firstName;
    private String lastName;
    public int count=0;
    public int count1=0;
    private Courses[] courses=new Courses[4];
    private int count2=0;
    private CourseAttendance[] courseAttendances=new CourseAttendance[3];
    public University(String universityName){

        this.name=universityName;
    }


    public int enroll(String firstName,String lastName){
        if(count>=student.length){
            Students[] newStudent=new Students[2*student.length];
            for (int i = 0; i <student.length ; i++) {
                newStudent[i]=student[i];
            }
            student=newStudent;
        }

     student[count]=new Students(firstName,lastName);

        return student[count].getId()+count++;
    }

    public String getName() {
        return name;
    }

    public void setRector(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getRector(){

        return firstName+" "+lastName;
    }


    public String student(int s1) {

        return s1+" "+student[s1-10000].getLastName()+" "+student[s1-10000].getFirstName();
    }

    public int activate(String subjectName,String name){
        int code;
        if(count1>=courses.length){
            Courses[] newCourse=new Courses[2*courses.length];
            for (int i = 0; i <courses.length ; i++) {
               newCourse[i]=courses[i];
            }
            courses=newCourse;
        }

        code=10+count1;
        courses[count1]=new Courses(subjectName,name,code);

        return courses[count1++].getCode();
    }

    public String course(int s1) {

        return s1+" "+courses[s1-10].getTeacherName()+" "+courses[s1-10].getSubjectName();
    }

    public void register(int id,int code){
        if(count2>=courseAttendances.length){
            CourseAttendance[] newCourseAttendance=new CourseAttendance[2*courseAttendances.length];
            for (int i = 0; i <courseAttendances.length ; i++) {
                newCourseAttendance[i]=courseAttendances[i];
            }
            courseAttendances=newCourseAttendance;
        }

        courseAttendances[count2++]=new CourseAttendance(id,code);
    }

    public String listAttendees(int code) {
        String s=" ";
        for(int i=0;i<count2;i++) {
            if (code == courseAttendances[i].getCode()) {
                 s+= (courseAttendances[i].getId() + " " + " " + student[courseAttendances[i].getId()-10000].getFirstName()+" "+student[courseAttendances[i].getId()-10000].getLastName()+"\n ");
            }
        }
        return s;
    }

    public String studyPlan(int id){
        String s = "";
        for (int i = 0; i < count2; i++) {
            if (courseAttendances[i].getId() == id) {

                for (int j = 0; j < count1; j++) {
                    if (courses[j].getCode() == courseAttendances[i].getCode()) {
                        s += courses[j].getCode() + "," + courses[j].getSubjectName() + " " + courses[j].getTeacherName() + "\n";
                    }
                }
            }
        }

        return s;
    }




}
