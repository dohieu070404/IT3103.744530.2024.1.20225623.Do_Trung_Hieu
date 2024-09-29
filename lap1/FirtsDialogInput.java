package lap1;
import javax.swing.JOptionPane;
public class FirtsDialogInput {
	public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null,"xin chao "+ result + "!");
        System.exit(0);
    }

}
