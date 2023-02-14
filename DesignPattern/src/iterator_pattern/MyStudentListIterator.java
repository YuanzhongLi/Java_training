package iterator_pattern;

public class MyStudentListIterator implements Iterator{
    private MyStudentList myStudentList;
    private int index;
    public MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index = 0;
    }

    public boolean hasNext() {
        if (myStudentList.getLastNum() > index) {
            return true;
        }
        return false;
    }

    public Student next() {
        Student s = myStudentList.geStudentAt(index);
        index++;
        return s;
    }
}
