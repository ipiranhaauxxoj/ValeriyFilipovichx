package com.company;
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class TimerApplet extends Applet implements Runnable
{
    private Rectangle rect = new Rectangle(1, 1, 100, 60);
    private Thread clock;
    private boolean isLeft;
    private Color randomColor = Color.black;

    private class AppletMouseListener//блок обработки событий
            implements MouseListener {
        /* реализация всех пяти методов интерфейса MouseListener */
        @Override
        public void mouseClicked(MouseEvent me) {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            randomColor = new Color(r, g, b);
            System.out.println("New color: " + randomColor.toString());
            if(isLeft) isLeft = false;
            else { isLeft = true;
                setBackground(randomColor);
            }
        }

        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }

    public void destroy()
    {
        clock.stop();
    }

    public void init()
    {
        addMouseListener(new AppletMouseListener());
        String parameter;

        if(clock == null)
        {
            clock = new Thread(this);
            clock.start();
        }
    }

    public void paint(Graphics gr)
    {
        gr.setColor(Color.black);
        if(isLeft){
            rect.x++;
            if(rect.x == getWidth()-100) isLeft=false;
        }
        if(!isLeft){
            rect.x--;
            if(rect.x == 0) isLeft=true;
        }
        gr.fillRect(rect.x, rect.y, rect.width, rect.height);
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

