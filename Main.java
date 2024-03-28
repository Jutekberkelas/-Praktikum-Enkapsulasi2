
package encaptulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan alamat mahasiswa: ");
        String alamatMahasiswa = scanner.nextLine();
        Student student = new Student(namaMahasiswa, alamatMahasiswa);
        
        System.out.println("Masukkan nama dosen: ");
        String namaDosen = scanner.nextLine();
        System.out.println("Masukkan alamat dosen: ");
        String alamatDosen = scanner.nextLine();
        Teacher teacher = new Teacher(namaDosen, alamatDosen);
        
        System.out.println("Masukkan kelas-kelas mahasiswa: ");
        for (int i=0; i<3; i++){
            System.out.println("Masukkan kelas ke-" + (i+1) + ":");
            String kelas = scanner.nextLine();
            System.out.println("Masukkan nilai mahasiswa pada kelas" + kelas + ":");
            int nilai = scanner.nextInt();
            student.addCourseGrade(kelas, nilai);
        }
        
        System.out.println("Masukkan kelas-kelas dosen: ");
        for (int i=0; i<3; i++){
            System.out.println( "Masukkan kelas ke-" + (i+1) + ";");
            String kelas = scanner.nextLine();
            teacher.addCourse(kelas);
        }
        
        System.out.println("Mahasiswa: ");
        System.out.println(student.toString());
        System.out.println("Rata=rata nilai: " + student.getAverageGrade());
        student.printGrade();
        
        System.out.println("Dosen: ");
        System.out.println(teacher.toString());
        System.out.println("Kelas: " + teacher.toString());
        
        System.out.println("Hapus Kelas:");
        System.out.println("Masukkan Kelas yang akan diHapus: ");
        String kelas = scanner.nextLine();
        if (teacher.removeCourse(kelas)){
            System.out.println("Kelas berhasil dihapus!");
        }else{
            System.out.println("Kelas tidak ditemukan!");
        }
        
        System.out.println("Kelas: " + teacher.toString());
       
        
    }
}
