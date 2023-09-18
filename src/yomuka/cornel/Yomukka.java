package yomuka.cornel;

import java.util.ArrayList;

import yomuka.cornel.course.Course;
import yomuka.cornel.hospital.Hospital;

public class Yomukka {
		private static Yomukka instance = new Yomukka();
		
		private static String CLINIC_NAME 	= "good yomukka";
		public static int SUBJECT_COUNT		= 10;				//10번부터 시작 - 진료과목아이디
		public static int COURSE_COUNT 		= 1000;				//1천번부터 시작 - 교육과정아이디
		public static int HOSPITAL_COUNT 	= 10000;			//1만번부터 시작 -병원아이디
		public static int CUSTOMER_COUNT 	= 100000;			//10만번부터 시작 -고객아이디
		
		private ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
		private ArrayList<Course> courseList = new ArrayList<Course>();
				
		private Yomukka() {}
		
		public static Yomukka getInstance() {
			if(instance == null) {
				instance = new Yomukka();				
			}
			return instance;
		}

		public ArrayList<Hospital> getHospitalList() {
			return hospitalList;
		}

		public void addHospital(Hospital hospital) {
			hospitalList.add(hospital);
		}

		public ArrayList<Course> getCourseList() {
			return courseList;
		}

		public void addCourse(Course course) {
			courseList.add(course);
		}
		
		
				
}
