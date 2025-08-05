public class Faculty extends Member {
    private String department;
    private String designation;
    private String experience;
    @Override
    public  int getMaxBooksAllowed(){
        return 5;
    }
    public Faculty( String id, String name, String contact, String department, String designation, String experience){
        super(id, name, contact);
        this.department=department;
        this.designation=designation;
        this.experience=experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
