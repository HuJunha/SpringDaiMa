package Work;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/6/17:54
 */
public class Employee {
    private String name;
    private  int age;
    private  Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
       this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
