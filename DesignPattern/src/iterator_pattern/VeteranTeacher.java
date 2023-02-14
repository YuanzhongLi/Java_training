package iterator_pattern;

import java.util.Iterator;

public class VeteranTeacher extends Teacher {
    private NewVeteranStudentList list;
    public void createStudentList() {
        list = new NewVeteranStudentList(3);
        list.add(new Student("A", 1));
        list.add(new Student("B", 1));
        list.add(new Student("C", 1));
    }

    public void callStudentLists() {
        Iterator itr = list.students.iterator();
        while (itr.hasNext()) {
            System.out.println(((Student)itr.next()).getName());
        }
    }
}
