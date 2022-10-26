package testingRevision.exceptions;

public class CustomException extends Exception{

    public CustomException(){}
    public CustomException(String message)
    {
        super(message);
    }
    public static void main(String[] args) {
        try{
          int x = 50;
          if(x > 40)
              throw new CustomException("value greater than 40");
        }
        catch (CustomException c)
        {
            c.printStackTrace();
        }
    }
}
