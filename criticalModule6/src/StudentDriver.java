import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(122, "Jack Z", "Address"));
        students.add(new Student(1, "Jimmy J", "Address"));
        students.add(new Student(3, "Jane B", "Address"));
        students.add(new Student(12, "John D", "Address"));
        students.add(new Student(4, "Jimmy E", "Address"));
        students.add(new Student(15, "Jello G", "Address"));
        students.add(new Student(84, "Jeff M", "Address"));
        students.add(new Student(7, "Jill I", "Address"));
        students.add(new Student(63, "Jim P", "Address"));
        students.add(new Student(92, "Jim E", "Address"));

        mergeSort(students,0, students.size()-1);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void merge(ArrayList<Student> students, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = students.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = students.get(m + 1 + j);
            int i = 0, j = 0;
            int k = l;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) < 0) {
                students.set(k, L[i]);
                i++;
            } else {
                students.set(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            students.set(k, L[i]);
            i++;
            k++;
        }
        while (j < n2) {
            students.set(k, R[j]);
            j++;
            k++;
        }
    }

    public static void mergeSort(ArrayList<Student> students, int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            mergeSort(students, l, m);
            mergeSort(students, m + 1, r);
            merge(students, l, m, r);
        }
    }
}
