package yomuka.cornel.hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserved {
	private int 		hospitalId;	//병원아이디 
	private Date 		date;		//일자
	private Date 		time;		//시간
	private int	 		customerId;  //고객아이디
		
	//예약정보
	//
	public Reserved(int	hospitalId, String date, String time,  int	customerId) {
		this.hospitalId = hospitalId;
		this.customerId = customerId;
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh");
			
		try {
			this.date = sdf1.parse(date);
		} catch (ParseException e) {
			System.out.println(e);
			return;
		}		
		
		try {
			this.time = sdf2.parse(time);
		} catch (ParseException e) {
			System.out.println(e);
			return;
		}
					
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}
