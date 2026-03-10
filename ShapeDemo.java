import java.awt.*;
import javax.swing.*;

interface Printable
{
    void print();
}

interface Computable
{
    double calculate();
}

interface Drawable
{
    void draw(Graphics g);   // ✅ Fixed
}

class Rectangle implements Printable, Computable, Drawable
{
    double length, width;
    int x, y;   // ✅ Added

    Rectangle(double l, double w, int x, int y)   // ✅ Fixed constructor
    {
        length = l;
        width = w;
        this.x = x;
        this.y = y;
    }

    public void print()
    {
        System.out.println("Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }

    public double calculate()
    {
        return length * width;   // Area
    }

    public void draw(Graphics g)
    {
        System.out.println("Drawing Rectangle");
        g.setColor(Color.BLUE);
        g.drawRect(x, y, (int)(length * 10), (int)(width * 10));
    }
}

class Sphere implements Printable, Computable, Drawable
{
    double radius;
    int x, y;

    Sphere(double r, int x, int y)
    {
        radius = r;
        this.x = x;
        this.y = y;
    }

    public void print()
    {
        System.out.println("Sphere");
        System.out.println("Radius = " + radius);
    }

    public double calculate()
    {
        return (4.0/3.0) * Math.PI * radius * radius * radius;  // Volume
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.RED);
        int d = (int)(radius * 20);
        g.drawOval(x, y, d, d);
    }
}

class DrawingPanel extends JPanel
{
    Rectangle r;
    Sphere s;

    DrawingPanel(Rectangle r, Sphere s)
    {
        this.r = r;
        this.s = s;
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        r.draw(g);
        s.draw(g);
    }
}

public class ShapeDemo
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(6, 4, 50, 50);
        Sphere s = new Sphere(3, 150, 50);

        JFrame frame = new JFrame("Graphical Shapes");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawingPanel(r, s));
        frame.setVisible(true);

        r.print();
        System.out.println("Area = " + r.calculate());
        System.out.println();

        s.print();
        System.out.println("Volume = " + s.calculate());
    }
}