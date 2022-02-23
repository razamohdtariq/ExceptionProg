import java.io.IOException;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	throw new IOException();
	}

catch(IOException e)
{
	System.out.println("Exception:"+e.getMessage());
	}
	}

}
