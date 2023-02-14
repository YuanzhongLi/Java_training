package iterator_pattern;

public class MyTeacher extends Teacher{
    private MyStudentList studentList;

    public void createStudentList() {
        studentList = new MyStudentList(5);

        studentList.add(new Student("Akai", 1));
        studentList.add(new Student("Akabane", 2));
        studentList.add(new Student("Okada", 2));
        studentList.add(new Student("Nishimori", 1));
        studentList.add(new Student("Nakanomori", 2));
    }

    public void callStudentLists() {
        Iterator itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println(((Student)itr.next()).getName());
        }
    }
}
