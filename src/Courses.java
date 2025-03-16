public class Courses {
    private String teacherName;
    private String subjectName;
    private int code;


    public Courses(String name, String subjectName,int code) {
        this.teacherName = name;
        this.subjectName = subjectName;
        this.code=code;

    }

    public int getCode() {
        return code;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
