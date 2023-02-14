package iterator_pattern;

import java.util.Vector;

public class NewVeteranStudentList extends NewStudentList {
    public NewVeteranStudentList() {
        super();
    }

    public NewVeteranStudentList(int studentCount) {
        super();
        this.students = new Vector<Student>(studentCount);
    }
}
