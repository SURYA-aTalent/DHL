package com.dhl.dhltalentlinkapp.inputfiledetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class UploadDateComparator implements Comparator<Inputfiledetails> {

	@Override
	public int compare(Inputfiledetails o1, Inputfiledetails o2) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date d1=null;
		Date d2=null;
		try {
			d1=sdf.parse(o1.getUploadDate().get());
			d2=sdf.parse(o2.getUploadDate().get());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d1.compareTo(d2);
	}

	

}
