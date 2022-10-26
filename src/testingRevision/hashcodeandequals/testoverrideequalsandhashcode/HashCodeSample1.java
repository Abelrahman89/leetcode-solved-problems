package testingRevision.hashcodeandequals.testoverrideequalsandhashcode;

import java.util.Hashtable;
import java.util.Map;

public class HashCodeSample1 {
    private int id;
    private int code;
    private String name;
    public HashCodeSample1(int id, int code, String name) {
        super();
        this.id = id;
        this.code = code;
        this.name= name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HashCodeSample1))
            return false;
        if (obj == this)
            return true;
        return this.id == ((HashCodeSample1) obj).id &&
                this.code == ((HashCodeSample1) obj).code;

    }

    public static void main(String[] arr) {
        Map<HashCodeSample1,String> m = new Hashtable<HashCodeSample1,String>();
        HashCodeSample1 h1 = new HashCodeSample1(1234,8, "Test1");
        HashCodeSample1 h2 = new HashCodeSample1(1234,8, "Test2");
        m.put(h1,"Hashcode Test");
        System.out.println(m.get(h2));
    }
}
