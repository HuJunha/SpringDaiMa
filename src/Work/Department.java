package Work;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/6/17:54
 */
public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

}
