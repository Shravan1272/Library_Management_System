public class Student extends Member {
    private int year;
    private String course;

    public Student(String id,String name, String contact,int year, String course){
        super(id,name,contact);
        this.year=year;
        this.course=course;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    @Override
    public int getMaxBooksAllowed(){
        return 3;
    }
}
