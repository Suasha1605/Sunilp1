package java_basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d= new Date();
		
		System.out.println(d.toString());
		SimpleDateFormat sfd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		System.out.println(sfd.format(d));
		
		
		
		System.out.println("#######################");
		
		
		
		Calendar cd= Calendar.getInstance();
		
		System.out.println(sfd.format(cd.getTime()));
		
		System.out.println(cd.WEEK_OF_MONTH);
		
		

	}

}
