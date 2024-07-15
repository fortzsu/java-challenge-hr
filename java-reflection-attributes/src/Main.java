import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Class student = Student.class;
        java.lang.reflect.Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (java.lang.reflect.Method m : methods) {
            methodList.add(m.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anotherMethod() {
    }
}