package com.company;

import java.applet.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StringApplet extends Applet implements Runnable
{
    private Thread clock;
    private boolean isLeft;
    private Color randomColor = Color.black;
    private String text = "Some text";
    private int x = 1;
    private int y = 1;
    private List choices;
    private Graphics g;
    private Font stringFont = new Font("TimesRoman", Font.PLAIN, 16);

    class listListener implements ItemListener
    {
        public void itemStateChanged (ItemEvent event)
        {
            String choice = choices.getSelectedItem ();
            if (choice.equals ("TimesRoman"))
            {
                stringFont = new Font("TimesRoman", Font.PLAIN, 16);
            }
            else if (choice.equals ("Consolas"))
            {
                stringFont = new Font("Consolas", Font.PLAIN, 12);
            }
            else if (choice.equals ("Arial"))
            {
                stringFont = new Font("Arial", Font.PLAIN, 20);
            }
        }
    }

    public void destroy()
    {
        clock.stop();
    }

    public void init()
    {
        if(clock == null)
        {
            clock = new Thread(this);
            clock.start();
        }

        choices = new List (3, false);
        choices.add ("TimesRoman");
        choices.add ("Consolas");
        choices.add ("Arial");
        add (choices);
        choices.addItemListener (new listListener ());
        g = getGraphics();
    }

    public void paint(Graphics gr)
    {
        gr.setColor(Color.black);
        if(isLeft){
            x++; y++;
            if(y == getHeight() || x > getWidth() - 50) {
                isLeft=false;
                randomCase();
            }
        }
        if(!isLeft){
            x--; y--;
            if(y == 0) {
                isLeft=true;
                randomCase();
            }
        }
        gr.setFont(stringFont);
        gr.drawString(text, x, y);
    }

    private void randomCase() {
        for(int i=0; i < text.length(); i++) {
            int randomNum = 1 + (int) (Math.random() * 2);
            if(randomNum == 1) {
               text = text.replace(text.charAt(i), Character.toUpperCase(text.charAt(i)));
            }
            if(randomNum == 2) {
                text = text.replace(text.charAt(i), Character.toLowerCase(text.charAt(i)));
            }
        }
    }

    public void run()
    {
        while(true)
        {
            repaint();
            try
            {
                clock.sleep(10);
            }
            catch(InterruptedException e)
            {
            }
        }
    }

    public void start()
    {
        clock.resume();
    }

    public void stop()
    {
        clock.suspend();
    }
}


