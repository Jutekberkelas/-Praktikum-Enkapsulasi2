
package encaptulation;

public class Student extends Person{
    private int numCourses;
    private String[] kelas;
    private int[] nilai;
    
    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.kelas = new String[100];
        this.nilai = new int[100];
    }
    
    public String toString(){
        return "Studendt: " + super.toString();
    }
    
    public void addCourseGrade(String kelas, int nilai){
        this.kelas[numCourses] = kelas;
        this.nilai[numCourses] = nilai;
        numCourses++;
    }
    
    public void printGrade(){
        for (int i = 0; i < numCourses; i++){
            System.out.println("Kelas: " + kelas[i] + "Nilai: " + this.nilai[i]);
        }
    }
    
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0; i < numCourses; i++){
            sum += nilai[i];
        }
        return (double) sum / numCourses;
    }
    
}
