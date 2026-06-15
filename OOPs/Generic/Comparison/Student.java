package OOPs.Generic.Comparison;

public class Student implements Comparable<Student> {
    int rollno;
    float weight;

    public Student(int rollno, float weight) {
        this.rollno = rollno;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student o) {
        // compare by weight
        return Float.compare(this.weight, o.weight);
    }
}
