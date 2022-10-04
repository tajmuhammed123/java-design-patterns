package clock;

import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.print.event.PrintJobListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

public class Clock extends JFrame {
	private static final long serialVersionUID = 1L;
	JFrame jf;
	SimpleDateFormat time,date,date1;
	JLabel jl,jl1,jl2,jtime,jdate;
	String timetext,datetext;
	Calendar cl;
	Date dt;
	Border border;
	BevelBorder bevel;
	
	Clock(){
		jf=new JFrame("Clock");
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setLocation(450,200);
		jf.getContentPane().setBackground(Color.YELLOW);
		time= new SimpleDateFormat("hh:mm:ss a");
		jtime=new JLabel("TIME:");
		jtime.setBounds(10,10,200,50);
		jdate=new JLabel("DATE:");
		jdate.setBounds(10,150,200,50);
		jl=new JLabel();
		jl.setBounds(40,70,300,50);
		Font font=new Font("digital-7 Mono", Font.BOLD, 50);
		jl.setFont(font);
		//jl.setHorizontalAlignment(JLabel.CENTER);
		//jl.setVerticalAlignment(JLabel.CENTER);
		jl.setVerticalAlignment(JLabel.TOP);
		jl.setBackground(Color.BLACK);
		jl.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		jl.setForeground(Color.GREEN);
		date= new SimpleDateFormat("EEEEEE");
		jl1=new JLabel();
		jl1.setBounds(120,210,150,50);
		Font font1=new Font("Arial", Font.BOLD, 30);
		jl1.setFont(font1);
		jl1.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		jl1.setHorizontalAlignment(JLabel.CENTER);
		jl1.setBackground(Color.WHITE);
		jl2=new JLabel();
		jl2.setBounds(90,270,210,50);
		jl2.setBackground(Color.WHITE);
		date1= new SimpleDateFormat("dd - MM - YYYY");
		jl2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		jl2.setHorizontalAlignment(JLabel.CENTER);
		jtime.setFont(font1);
		jl2.setFont(font1);
		jdate.setFont(font1);
		jl.setOpaque(true);
		jl1.setOpaque(true);
		jl2.setOpaque(true);
		jf.add(jl);
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jtime);
		jf.add(jdate);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TimeDisplay();
			
	}
	public void TimeDisplay() {
		while(true) {
			timetext=time.format(Calendar.getInstance().getTime());
			jl.setText(timetext);
			datetext=date.format(Calendar.getInstance().getTime());
			jl1.setText(datetext);
			datetext=date1.format(Calendar.getInstance().getTime());
			jl2.setText(datetext);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


public static void main(String[] args) {
	new Clock();
}
}
