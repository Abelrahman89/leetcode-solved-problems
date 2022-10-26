package testingRevision.hashcodeandequals.testoverrideequalsandhashcode;

import java.util.Hashtable;
import java.util.Map;

public class HashCodeSample2 {
    private int id;
    private int code;
    private String name;
    public HashCodeSample2(int id, int code, String name) {
        super();
        this.id = id;
        this.code = code;
        this.name= name;
    }
    public int hashCode() {
        int result = 0;
        result = (int)(id/5) + code;
        return result;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof HashCodeSample2))
            return false;
        if (obj == this)
            return true;
        return this.id == ((HashCodeSample2) obj).id &&
                this.code == ((HashCodeSample2) obj).code;

    }

    public static void main(String[] arr) {
        Map<HashCodeSample2,String> m = new Hashtable<HashCodeSample2,String>();
        HashCodeSample2 h1 = new HashCodeSample2(1234,8, "Test1");
        HashCodeSample2 h2 = new HashCodeSample2(1234,8, "Test2");
        m.put(h1,"Hashcode Test");
        System.out.println(m.get(h2));
    }
}
