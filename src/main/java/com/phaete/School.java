package com.phaete;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private List<Student> students = new ArrayList<>(); // <Student>

    // Step 3: Create a class "School" to which students can be added through a method ('addStudent')
    public void addStudent(Student student) {
        students.add(student);
    }

    // Step 4: Implement a method to print all students of the school (as text, to the console)
    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    // Step 5: Add a method to find a student by their ID. The found student should be returned.
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null; // return null if the student is not registered in the school
    }

    // Step 6: Create a method to remove a student from the school
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Implement a method within the School class to retrieve all courses of a specific student (based on a student ID)
    private List<Course> getStudentCourses(int studentId) {
        if (!findStudentById(studentId).equals(null)) {
            return findStudentById(studentId).getCourses();
        }
        return null; // return null if the student is not registered in the school
    }




    // Getter & Setter
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(students);
    }


}
