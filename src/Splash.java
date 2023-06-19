import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash(){

        //use of image icon to load the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        //scaling image to perfectly fit image
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // we have set visibility of frame to true
        setVisible(true);
        int x=1;
        for(int i=2;i<600;i+=4,x+=1){
            setSize(i+x, i); //setting the size of the frame
            //by default the frame opens from top left corner
            // we have to set the origin of the frame
            setLocation(700 - ((i+x)/2), 400 - (i/2));
            //use of multithreading concept
            try{
                Thread.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        t = new Thread(this);
        t.start();
    }

    //putting hold for 7 sec
    @Override
    /* To call the run methods of the class Thread.
    * We have to make an object of the class Thread.*/
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);

            //open login frame
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }

}
