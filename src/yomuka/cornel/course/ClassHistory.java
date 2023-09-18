package yomuka.cornel.course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassHistory {
	private int 		courseKindId;	//수강과목아이디 
	private String 		date;			//일자 시간 
	private int	 		customerId;  	//고객아이디
		
	//예약정보
	public ClassHistory(int	courseKindId, String date,  int customerId) {
		this.courseKindId 	= courseKindId;
		this.date 			= date;		
		this.customerId 	= customerId;									
	}

	public int getCourseKindId() {
		return courseKindId;
	}

	public void setCourseKindId(int courseKindId) {
		this.courseKindId = courseKindId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}	
	
	
}
