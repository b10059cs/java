package chegg;

import java.sql.Timestamp;

public class NormalizedTime
{
	public static void main( String[] args )
	{
		java.util.Date date= new java.util.Date();
		System.out.println(new Timestamp(0).getDay()+"_"+new Timestamp(0).getMonth());
	}
}

