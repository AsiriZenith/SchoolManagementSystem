package school.management.system;

import java.util.List;

public class School {

    private List<Student> students;
    private List<Teacher> teachers;
    private static int totelMoneyEarned;
    private static int totelMoneySpent;

    /**
     * new school object is created
     * @param students list of students in the school
     * @param teachers list of teachers in the school
     */
    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        this.totelMoneyEarned=0;
        this.totelMoneySpent=0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotelMoneyEarned() {
        return totelMoneyEarned;
    }

    public static void updateTotelMoneyEarned(int moneyEarned) {
        totelMoneyEarned += moneyEarned;
    }

    public int getTotelMoneySpent() {
        return totelMoneySpent;
    }

    public static void updateTotelMoneySpent(int moneySpent) {
        totelMoneyEarned -= moneySpent;
    }
}
