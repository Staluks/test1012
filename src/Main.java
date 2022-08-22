import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        jframe.setTitle("Hello world");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(600, 600);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\37128\\IdeaProjects\\Icon3007\\src\\horse.png");
        jframe.setIconImage(image.getImage());

    }
}