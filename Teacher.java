
package encaptulation;

public class Teacher extends Person {
    private int numCourses;
    private String[] kelas;
    
    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.kelas = new String[100];
    }
    
    @Override
    public String toString(){
        return "Treacher: " + super.toString();
    }
    
    public boolean addCourse(String kelas){
        for (int i = 0; i < numCourses; i++){
            if (this.kelas[i].equals(kelas)){
                return false;
            }
        }
        this.kelas[numCourses] =  kelas;
        numCourses++;
        return true;
    }
    
    public boolean removeCourse(String kelas){
        for (int i = 0; i < numCourses; i++){
            if (this.kelas[i].equals(kelas)){
                for (int j=i; j<numCourses - 1;){
                    this.kelas[j] = this.kelas[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }
    
    public String tcoursesString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Courses: ");
        for (int i=0; i<numCourses; i++){
            sb.append(kelas[i]);
            if (i<numCourses - 1){
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
