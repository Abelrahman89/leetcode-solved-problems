package testingRevision.hashcodeandequals.testoverrideequalsandhashcode;

import java.util.HashMap;

public class EmployeeWithHash {
    private int id;
    private int code;
    private String empName;
    public EmployeeWithHash(int id, int code, String empName) {
        super();
        this.id = id;
        this.code = code;
        this.empName = empName;
    }
    @Override
    public int hashCode() {
        return this.id / 5 * code;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return this.id == ((EmployeeWithHash) obj).id &&
                this.code == ((EmployeeWithHash) obj).code;    }

    public static void main(String[] args) {
        EmployeeWithHash e1 = new EmployeeWithHash(1, 500, "Ahmed");
        EmployeeWithHash e2 = new EmployeeWithHash(1, 500, "Ali");

        HashMap<EmployeeWithHash, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "First Employee");

        System.out.println(employeeMap.get(e1));
        System.out.println(employeeMap.get(e2));
        employeeMap.put(e2, "Second Employee");
        System.out.println(employeeMap.get(e2));
        System.out.println(employeeMap.size());
    }

}
