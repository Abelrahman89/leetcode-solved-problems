package string.validWordAbbreviation;

public class ValidWordAbbreviation {
    public static void main(String[] args) {
        System.out.println(validWordAbbreviation( "apple","a2e"));
    }
    public static boolean validWordAbbreviation(String word, String abbr) {
        char c=word.charAt(0);
        if (Character.isDigit(c))
            return false;
        int i=0;
        String subWord="";
        int number=0;
      while(i<word.length())
      {
          c=word.charAt(i);
          if (c=='0'  && i>0 && !Character.isDigit(word.charAt(i-1)))
              return false;
          if (Character.isDigit(c))
          {
              if (number!=0) {
                  number += c * 10;

              }

              i++;
          }
          else {
              if (number!=0)
              {
                  String s=word.substring(i);
                 if (number> (s.length()))
                     return false;
                  subWord += s.substring(i, number);
                  i=number;
              }
              else {
                  subWord += c;

              }
              i++;
          }
      }

        return true;
    }
}
