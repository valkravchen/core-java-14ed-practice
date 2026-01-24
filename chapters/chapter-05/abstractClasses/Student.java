package abstractClasses;

public class Student extends Person{
    private String major;

    /**
     *
     * @param name Имя студента
     * @param major Специализация студента
      */

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "студент, специализирующийся в " + major;
    }
}
