package yomuka.cornel.course;

import java.util.ArrayList;

public class Course {
	int  	courseKindId;			//수강과목아이디
	String 	courseKindName;			//수강과목
	String 	courseKindContents;		//강의내용
	int		coursePoint;			//수강시 포인트
	
	private ArrayList<ClassHistory> classHistoryList = new ArrayList<ClassHistory>();
	
	public Course(int courseKindId, String courseKindName, String courseKindContents, int coursePoint) {
		this.courseKindId = courseKindId;
		this.courseKindName = courseKindName;
		this.courseKindContents = courseKindContents;
		this.coursePoint = coursePoint;
	}

	public int getcourseKindId() {
		return courseKindId;
	}

	public void setcourseKindId(int courseKindId) {
		this.courseKindId = courseKindId;
	}

	public String getcourseKindName() {
		return courseKindName;
	}

	public void setcourseKindName(String courseKindName) {
		this.courseKindName = courseKindName;
	}

	public String getcourseKindContents() {
		return courseKindContents;
	}

	public void setcourseKindContents(String courseKindContents) {
		this.courseKindContents = courseKindContents;
	}
	
	

	public int getCoursePoint() {
		return coursePoint;
	}

	public void setCoursePoint(int coursePoint) {
		this.coursePoint = coursePoint;
	}
	
	public ArrayList<ClassHistory> getClassHistoryList() {
		return classHistoryList;
	}

	public void addClassHistory(ClassHistory classHistory) {
		classHistoryList.add(classHistory);
	}

	public String toString() {
		return "수강과목아이디 : " + courseKindId + " , 수강과목 : " + courseKindName + " 강의내용 : " + courseKindContents ; 
	}
	
}
