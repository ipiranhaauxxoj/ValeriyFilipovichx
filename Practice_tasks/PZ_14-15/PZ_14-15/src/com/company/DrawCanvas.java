package com.company;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class DrawCanvas extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public DrawCanvas () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });

    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
    public static void main(String s[]) {
        final JFrame f = new JFrame("Draw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(750, 500);

        final Canvas c = new DrawCanvas();

        Canvas cs = new Canvas(){
            public void paint(Graphics g){
                // 1
                g.drawLine(0, 0, 200, 100);
                g.drawLine(0, 100, 200, 0);
                // 2
                g.drawLine(250,0+1,450, 100);
                g.drawLine(250,100, 450,0);
                g.drawRect(250,0+1,200, 100);
                // 3
                g.drawRect(500, 0+1, 200, 100);
                g.drawOval(500, 0+1, 200, 100);
                // 4
                g.setFont(new Font("Consolas", Font.PLAIN, 25));
                g.drawString("abcdefgh", 0, 150);
                g.drawLine(0, 150, 150, 150);
                // 5
                for (int i=0; i<4; i++) {
                    for (int j=0; j<4; j++) {
                        int c = (int)((i+j)*255/6);
                        g.setColor(new Color(c, c, c));
                        g.fillRect(i*200/4, (j*200/4)+200, 200/4, 200/4);
                    }
                }
                // 6
                Color c = new Color(
                        (int)(Math.random()*255),
                        (int)(Math.random()*255),
                        (int)(Math.random()*255));
                g.setColor(c);
                //g.setClip(null);
                g.fillRect(250, 200, 200, 100);
                // 7
                int height = 100,
                        width = 450;
                double k=2*Math.PI*5/width;
                int sy = calcY(0, width, height, k);
                for (int i=250; i<width; i++) {
                    int nsy = calcY(i, width, height, k);
                    g.drawLine(i, sy+300, i, nsy+300);
                    sy=nsy;
                }
            }
        };

        Frame felements= new Frame("Checkbox Example");
        felements.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                felements.dispose();
            }
        });
        Checkbox payment  = new Checkbox("Оплата в кредит");
        payment.setBounds(10,20, 150,50);
        Checkbox delivery = new Checkbox("Доставка", true);
        delivery.setBounds(10,50, 150,50);
        felements.add(payment);
        felements.add(delivery);
        felements.setSize(400,400);
        felements.setLayout(null);
        felements.setVisible(true);

        CheckboxGroup deliverygroup = new CheckboxGroup();
        Checkbox fast = new Checkbox("Срочная (1 день)", deliverygroup, true);
        fast.setBounds(10, 100, 150, 20);
        felements.add(fast);
        Checkbox normal = new Checkbox("Обычная (1 неделя)", deliverygroup, false);
        normal.setBounds(10, 120, 150, 20);
        felements.add(normal);
        Checkbox postal = new Checkbox("По почте (до 1 месяца)",deliverygroup, false);
        postal.setBounds(10, 140, 150, 20);
        felements.add(postal);

        Choice color = new Choice();
        color.add("Белый");
        color.add("Зеленый");
        color.add("Синий");
        color.add("Черный");
        felements.add(color);
        color.setBounds(10, 180, 150, 20);

        List accessories = new List(3);
        accessories.add("Чехол");
        accessories.add("Наушники");
        accessories.add("Аккумулятор");
        accessories.add("Блок питания");
        felements.add(accessories);
        accessories.setBounds(200, 180, 150, 30);

        TextField tf = new TextField();
        tf.setText("Enter your name");
        tf.selectAll();
        felements.add(tf);
        tf.setBounds(10, 220, 150, 80);

        int height = felements.getHeight(), width = felements.getWidth();
        int thickness = 25;
        Scrollbar hs = new Scrollbar(Scrollbar.HORIZONTAL, 50,width/10, 0, 100);
        Scrollbar vs = new Scrollbar(Scrollbar.VERTICAL, 50,height/2, 0, 100);
        felements.add(hs); felements.add(vs);
        hs.setBounds(0, height - thickness,width - thickness, thickness);
        vs.setBounds(width - thickness, 0, thickness,height - thickness);

        final Frame fy = new Frame("Flaw");
        fy.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fy.dispose();
            }
        });
        fy.setSize(400, 300);
        fy.setLayout(new FlowLayout(FlowLayout.LEFT));
        fy.add(new Label("Test"));
        fy.add(new Button("Long string"));
        fy.add(new TextArea(2, 20));
        fy.add(new Button("short"));
        fy.add(new TextArea(4, 20));
        fy.add(new Label("Long-long text"));
        fy.setVisible(true);

        final Frame fb = new Frame("Border");
        fb.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fb.dispose();
            }
        });
        fb.setSize(200, 150);
        fb.add(new Button("North"),
                BorderLayout.NORTH);
        fb.add(new Button("South"),
                BorderLayout.SOUTH);
        fb.add(new Button("West"),
                BorderLayout.WEST);
        fb.add(new Button("East"),
                BorderLayout.EAST);
        fb.add(new Button("Center"),
                BorderLayout.CENTER);
        fb.setVisible(true);

        final Frame fs = new Frame("Grid");
        fs.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fs.dispose();
            }
        });
        fs.setSize(200, 200);
        fs.setLayout(new GridLayout(3, 3));
        for (int i=0; i<8; i++) {
            fs.add(new Button("-"+(i+1)+"-"));
        }
        fs.setVisible(true);

        f.add(c);
        f.add(cs);
        f.setVisible(true);
    }



    private static int calcY(int x, int width,
                             int height, double k) {
        double dx = (x-width/2.)*k;
        return (int)(height/2.*(1-Math.sin(dx)));
    }
}