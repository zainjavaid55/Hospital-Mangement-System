import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuccessDialog2 
	{
		SuccessDialog2()
		{
		 String message = "Data Modified successfully!";
		 JOptionPane.showMessageDialog(new JFrame(), message, "Done!",
         JOptionPane.INFORMATION_MESSAGE);
		}

  public static void main(String argv[])
	  {
			new SuccessDialog2();
	  }
}