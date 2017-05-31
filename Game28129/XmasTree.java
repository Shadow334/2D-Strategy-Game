import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container
import java.io.*;
import javax.imageio.ImageIO;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class XmasTree 
{  
    public static void main (String[] args)
    {
        BufferedImage img = null;
        
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;

        win = new JFrame("My Chirstmas Tree");  // window setup
        win.setSize(1000,1000);
        win.setLocation(100,100);
        win.setVisible(true);

        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
        g.setColor(new Color(200,200,200));
        try {Thread.sleep(400);} catch(Exception e){}
        g.fillRect(0,0,550,550);
        int route=0;

        //         for(int j = 0; j<500; j+=50)
        //         {
        //             for(int i = 0; i<500; i+=50)
        //             {
        //                 g.setColor(Color.BLUE);
        //                 g.fillRect(j-50,i,50,50);
        //                 try {Thread.sleep(100);} catch(Exception e){}
        //                 g.setColor(Color.RED);
        //                 g.fillRect(j,i,50,50);
        //             }
        //         }
        try
        {
            img = ImageIO.read(new File("../../MyPicture.jpg"));
        }
        catch(IOException exc)
        {
            System.out.println("Failed");
        }
        g.drawImage(img,0,0,contentPane);
    }
    
    public void keyPressed (KeyEvent e)
    {
        if (KeyCode == KeyEvent.VK_W)
        {
            KeyLabel.setText("You pressed W");
        }
        else
        {
            KeyLabel.setText("Somethings Wrong");
        }
    }
}
