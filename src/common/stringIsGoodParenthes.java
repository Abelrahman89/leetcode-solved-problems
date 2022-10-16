package common;

public class stringIsGoodParenthes {
    public static void main(String[] args) {
        System.out.println(goodParenthes("(ab))((a+b))"));
    }
    public static boolean goodParenthes(String s)
    {
        int count =0;
        for(Character c: s.toCharArray())
        {
            if(c=='(')
                count++;
            else if (c==')') {
                count--;
                if (count<0)
                    return false;

            }
        }
        return count==0;
    }
}
