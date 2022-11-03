package interfacecomparable.entities;

public class EmployeeSalary implements Comparable<EmployeeSalary> {

    private String name;
    private Double salary;

    public EmployeeSalary(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeSalary other2) {
        // Nesse caso o "-salary", o sinal de menos ajuda a ordenar do mairo salario para o menor.
        //E caso o contrário sem o sinal de menos, ficará do menor para o maior salário a ordem.
        return -salary.compareTo(other2.getSalary());
    }
}
