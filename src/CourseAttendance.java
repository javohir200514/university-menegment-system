public class CourseAttendance {
    private int id;
    private int code;


    CourseAttendance(int studentId,int coursecode){
        this.id=studentId;
        this.code=coursecode;

    }

    public int getCode() {
        return code;
    }

    public int getId() {
        return id;
    }
}
