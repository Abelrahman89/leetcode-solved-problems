package testingRevision.hashcodeandequals.testoverrideequalsandhashcode;


import java.util.HashMap;

public class EmployeeNoHash {
    private int id;
    private int code;
    private String empName;

    public EmployeeNoHash(int id, int code, String empName) {
        super();
        this.id = id;
        this.code = code;
        this.empName = empName;
    }


    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof EmployeeNoHash))
            return false;
        if (obj == this)
            return true;
        EmployeeNoHash objAfterConverted = (EmployeeNoHash) obj;
        return this.id == objAfterConverted.id && this.code == objAfterConverted.code;

    }

    public static void main(String[] args) {
        EmployeeNoHash e1 = new EmployeeNoHash(1, 500, "Ahmed");
        EmployeeNoHash e2 = new EmployeeNoHash(1, 500, "Mohammed");
        System.out.println(e1.equals(e2));
       // System.out.println(e1 == e2);

        HashMap<EmployeeNoHash, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "First Employee");

        System.out.println(employeeMap.get(e1));

        //   employeeMap.put(e2, "Second Employee");

        System.out.println(employeeMap.get(e2));

        // System.out.println(employeeMap.size());

    }

}
