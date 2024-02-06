import java.awt.*;
public class pakman {
    public static void main(String[] args) {
        DrawingPanel panel1= new DrawingPanel(400,400);
        Graphics p= panel1.getGraphics();
        panel1.setBackground(Color.black);
        int x=0;
        int sign=1;
        int s=1;
        int m=0;
        int startAngel=60;
        int arc=-120;
        while (true) {
        for (int i = 0; i < 350; i = i + 2) {
            p.setColor(Color.yellow);
            p.fillOval(m + i*sign, 175, 50, 50);
            p.setColor(Color.black);
            p.fillArc(m + i*sign-1, 174, 52, 52, startAngel - x*sign, arc + x*sign * 2);

            panel1.sleep(12);
            panel1.clear();
            x+=s;
            if (x==60 || x==0)
            {
               s*=-1;
            }
        }
        startAngel+=60*sign;
        arc*=sign;
        m+=350*sign;
        sign*=-1;
        arc*=sign;
    }
    }
}
