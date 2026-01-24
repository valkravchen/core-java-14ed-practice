package inheritance;

public class Manager extends Employee {
    private double bonus;

    /**
     * @param name   Имя сотрудника
     * @param salary Зарплата
     * @param year   Год приёма на работу
     * @param month  Месяц приёма на работу
     * @param day    День приёма на работу
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
