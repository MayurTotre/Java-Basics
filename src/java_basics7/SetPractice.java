package java_basics7;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(1);
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        for(int i : set1)
//            System.out.print(i + ",");
//
//        System.out.println();
//        for(int x : set2)
//            System.out.print(x + ",");
//

        StudentMarks std = new StudentMarks("Mayur");
        std.addMarks(10, 15);

        StudentMarks mayur = new StudentMarks("Mayur");
        mayur.addMarks(10, 15,20,124);


        System.out.println(mayur);


    }
}
class StudentMarks {
    String studentname;
    List<Integer> marks;

    public StudentMarks(String studentname) {
        this.studentname = studentname;
        this.marks = new ArrayList<>();
    }

    public String getStudentname() {
        return studentname;
    }

    public List<Integer> getMarks() {
        return marks;
    }
    public void addMarks(int...  numbers){
        for (int mark : numbers){
            marks.add(mark);

        }

    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "studentname='" + studentname + '\'' +
                ", marks=" + marks +
                '}';
    }
}



