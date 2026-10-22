public class StudentDriver {
    public static void main(String[] args) {
        // Membuat objek (instansiasi) baru dari class Student
        Student myStudent = new Student();

        // Mencetak informasi objek Student ke layar
        System.out.println("Student Name: " + myStudent.fName + " " + myStudent.lName);
        System.out.println("Student ID: " + myStudent.stuId);
        System.out.println("Student Status: " + myStudent.stuStatus);
    }
}