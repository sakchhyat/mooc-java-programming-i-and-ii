

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Student student){
//        String[] splitName01 = this.name.split("");
//        String[] splitName02 = student.getName().split("");
//        
//        return splitName01[0].compareToIgnoreCase(splitName02[0]);
          return this.name.compareToIgnoreCase(student.getName());
    }
}
