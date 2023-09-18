package yomuka.cornel.hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import yomuka.cornel.Yomukka;
import yomuka.cornel.course.ClassHistory;
import yomuka.cornel.course.Course;


public class ClinicTest {
	Yomukka goodYomukka = Yomukka.getInstance();
	//public static final String TITLE = " 성심 성의껏 진료하도록 하겠습니다 \t\t\n";	
	public static final String LINE = "-----------------------------------------------\n";
	
	
	//GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {	
		ClinicTest test = new ClinicTest();
		
		test.createHospital();
		test.createCourse();
		
		test.menuSelect();
				
		//String report = test.gradeReport.getReport();
		//System.out.println(report);
		
		
	}
	
//	//과목별 학생 점수를 추가하는 메서드
//	public void addScoreForStudent(Student stu, Subject sub, int point) {
//		Score score = new Score(stu.getStuId(), sub, point);
//		stu.addSubjectScore(score);
//	}

	private void createHospital() {		
		goodYomukka.HOSPITAL_COUNT++;
		Hospital hsp1 = new Hospital(goodYomukka.HOSPITAL_COUNT, "평안병원", "월~금 오전9:00~오후6시", "가산로 91");
		ClinicKind ck1 = new ClinicKind(10, "내과", "소화기, 순환기, 호흡기 등"); 
		hsp1.addClinicKind(ck1);
		
		goodYomukka.HOSPITAL_COUNT++;
		Hospital hsp2 = new Hospital(goodYomukka.HOSPITAL_COUNT, "으뜸병원", "월~금 오전9:00~오후7시", "가산로 92");
		ClinicKind ck2 = new ClinicKind(20, "외과", "일반외과, 대장항문외과, 위장관외과 등");
		hsp2.addClinicKind(ck2);
		
		goodYomukka.HOSPITAL_COUNT++;
		Hospital hsp3 = new Hospital(goodYomukka.HOSPITAL_COUNT, "제일병원", "월~금 오전9:00~오후8시", "가산로 93");
		ClinicKind ck3 = new ClinicKind(30, "정형외과", "척추, 수부, 족부, 슬관절 등");
		hsp3.addClinicKind(ck3);
		
		goodYomukka.HOSPITAL_COUNT++;
		Hospital hsp4 = new Hospital(goodYomukka.HOSPITAL_COUNT, "사랑병원", "월~금 오전9:00~오후9시", "가산로 94");
		ClinicKind ck4 = new ClinicKind(40, "치과", "치아교정, 턱교정, 양악수술교정 등");
		hsp4.addClinicKind(ck4);
		ck4 = new ClinicKind(30, "정형외과", "척추, 수부, 족부, 슬관절 등");
		hsp4.addClinicKind(ck4);
		
		goodYomukka.HOSPITAL_COUNT++;
		Hospital hsp5 = new Hospital(goodYomukka.HOSPITAL_COUNT, "영원병원", "월~금 오전9:00~오후10시", "가산로 95");
		ClinicKind ck5 = new ClinicKind(50, "안과", "외안부, 백내장, 녹내장 등");
		hsp5.addClinicKind(ck5);
					
		//병원 생성
		goodYomukka.addHospital(hsp1);
		goodYomukka.addHospital(hsp2);
		goodYomukka.addHospital(hsp3);
		goodYomukka.addHospital(hsp4);
		goodYomukka.addHospital(hsp5);			
	}
	
	private void createCourse() {		
		goodYomukka.COURSE_COUNT++;
		Course cls1 = new Course(goodYomukka.COURSE_COUNT, "제1부 : 애완동물 개요", "내용1", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls2 = new Course(goodYomukka.COURSE_COUNT, "제2부 : 애완동물 분양받기", "내용2", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls3 = new Course(goodYomukka.COURSE_COUNT, "제3부 : 애완동물 등록과 절차", "내용3", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls4 = new Course(goodYomukka.COURSE_COUNT, "제4부 : 애완동물 기르기", "내용4", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls5 = new Course(goodYomukka.COURSE_COUNT, "제5부 : 애완동물 건강관리", "내용5", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls6 = new Course(goodYomukka.COURSE_COUNT, "제6부 : 애완동물 분실과 습득", "내용6", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls7 = new Course(goodYomukka.COURSE_COUNT, "제7부 : 애완동물 관리 규정과 처벌", "내용7", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls8 = new Course(goodYomukka.COURSE_COUNT, "제8부 : 동물보호감시원의 역할", "내용8", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls9 = new Course(goodYomukka.COURSE_COUNT, "제9부 : 애완동물 장례 치르기", "내용9", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls10 = new Course(goodYomukka.COURSE_COUNT, "제10부 : 애완동물에 대한 백문백답", "내용10", 100);
		
		goodYomukka.COURSE_COUNT++;
		Course cls11 = new Course(goodYomukka.COURSE_COUNT, "제11부 : 애완동물 관련 법령", "내용11", 100);
		
		//교육과정 생성
		goodYomukka.addCourse(cls1);
		goodYomukka.addCourse(cls2);
		goodYomukka.addCourse(cls3);
		goodYomukka.addCourse(cls4);
		goodYomukka.addCourse(cls5);
		goodYomukka.addCourse(cls6);
		goodYomukka.addCourse(cls7);
		goodYomukka.addCourse(cls8);
		goodYomukka.addCourse(cls9);
		goodYomukka.addCourse(cls10);
		goodYomukka.addCourse(cls11);
	}
	
	
	public void menuSelect() {
		Scanner scn = new Scanner(System.in);
		String menu = "";
		
		boolean result1 = true;
		while (result1) {			
			System.out.println(LINE);			
			System.out.println(" [요람에서 무덤까지] 오신 것을 환경합니다 \n");
			System.out.println(" 서비스를 선택하세요 >>> \n");
			System.out.println("1.진료 | 2.교육 | 3.END \n");
			System.out.println(LINE);
			System.out.println();
			menu = scn.nextLine();

			switch (menu) {
			case "1": // 진료 START
				goClinic(scn);
				break;
			case "2":
				goClass(scn);
				break;
			case "3":
				result1 = false;
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다");
				System.out.println();
			}
		}
		
	}		//menu select END
	
	//메뉴 대분류에서 [교육]을 선택한 경우
	public void goClass(Scanner scn) {
		
		String menu = ""; 		// 메뉴선택
		String menu2 = "";
		String menu3 = "";
		int iMenu2 	= 0; 		// 선택된 메뉴값 변환
		int iMenu3 	= 0;
		int iCount 	= 0; 		// 병원명세 선택		
		String date = "";	 	// 예약일자	

		boolean result1 = true;
		boolean result2;		

		while (result1) {
			result2 = true; // 하위 메뉴 다시 선택
			System.out.println(LINE);			
			System.out.println(" 교육과정 서비스를 선택해 주세요 >>> \n");
			System.out.println("1.수강신청 | 2.수강이력조회 | 3.END \n");
			System.out.println(LINE);
			System.out.println();
			menu = scn.nextLine();

			switch (menu) {
			case "1": // 수강신청 영역 START

				while (result2) {					
					iCount = 0;					

					// 수강과목을 표시 
					System.out.println(LINE);
					System.out.println(" 수강하실 과목을 선택해 주세요 >>> \n");

					for (Course c : goodYomukka.getCourseList()) {
						iCount++; // 강의 일련번호 제공
						System.out.println(String.valueOf(iCount) + "." + c.getcourseKindName() + " \n");
					}										
					System.out.println(String.valueOf(iCount + 1) + ".Back \n");
					System.out.println(LINE);
					System.out.println();
					menu2 = scn.nextLine();

					if (Integer.valueOf(menu2) < 1 || Integer.valueOf(menu2) > (iCount + 1)) {
						System.out.println("메뉴를 잘못 입력하셨습니다");
						System.out.println();
						continue;
					}
					
					iMenu2 = Integer.valueOf(menu2) + 1000;		//코스 아이디는 1000번 부터 시작
					for (Course c : goodYomukka.getCourseList()) {						
						if (c.getcourseKindId() == iMenu2) {							
							//강의 내용을 표시
							System.out.println();
							System.out.println(LINE);
							System.out.println(c.getcourseKindContents());
							System.out.println(LINE);
							System.out.println();
							
							// 수강이력 객체를 생성	
							LocalDateTime currentDateTime = LocalDateTime.now();
							date = new SimpleDateFormat("yyyy-MM-dd hh:MM").format(Date.from(currentDateTime.atZone(ZoneId.systemDefault()).toInstant()));
							
							ClassHistory ch1 = new ClassHistory(c.getcourseKindId(), date, 100001); // customerId 변경 필요
							c.addClassHistory(ch1);
							
							System.out.println("강의를 마쳤으면 Enter Key를 클릭하세요 >>>");							
							menu2 = scn.nextLine();							
							result2 = false; // 교육 메뉴로 돌아가기		
							break;
						}						
					}				

				} // 수강하기 영역 END
				break;

			case "2": // 수강이력 조회 START
				System.out.println("수강이력 현황입니다");
				System.out.println(LINE);
				System.out.println("     수강일정       |   과목명   ");
				System.out.println(LINE);
				for (Course c : goodYomukka.getCourseList()) {
					for (ClassHistory ch : c.getClassHistoryList()) {
						if (ch.getCustomerId() == 100001) { // 고객ID 로그인 ID로 변경 필요
							System.out.print(ch.getDate() + "  | ");
							System.out.println(c.getcourseKindName());
							System.out.println();
						}
					} // 수강이력 리스트 END
				} // 강의리스트 END
				break;

			case "3":
				result1 = false;
				System.out.println();
				System.out.println("서비스를 종료합니다~");
				break;

			default:
				System.out.println("메뉴를 잘못 입력하셨습니다");
				System.out.println();
			} // 교육 하위 메뉴 END
		} // 교육 END
	} //교육 메뉴 END
	
	//메뉴 대분류에서 [진료]를 선택한 경우
	public void goClinic(Scanner scn) {
		
		String menu = ""; // 메뉴선택
		String menu2 = "";
		String menu3 = "";
		int iMenu2 = 0; // 선택된 메뉴값 변환
		int iMenu3 = 0;
		int iCount = 0; // 병원명세 선택
		int[] hospitalId2 = new int[100];
		String date = ""; // 예약일자
		String time = ""; // 예약시간

		boolean result1 = true;
		boolean result2;
		boolean result3;

		while (result1) {
			result2 = true; // 하위 메뉴 다시 선택
			System.out.println(LINE);			
			System.out.println(" 진료 서비스를 선택해 주세요 >>> \n");
			System.out.println("1.예약하기 | 2.진료기록조회 | 3.END \n");
			System.out.println(LINE);
			System.out.println();
			menu = scn.nextLine();

			switch (menu) {
			case "1": // 예약하기 영역 START

				while (result2) {
					iMenu2 = 0;
					iCount = 0;
					String hospitalInfo = "";

					System.out.println(LINE);
					System.out.println(" 원하시는 진료과목을 선택해 주세요 >>> \n");
					System.out.println("1.내과 | 2.외과 | 3.정형외과 | 4.치과 | 5.안과 | 6.Back \n");
					System.out.println(LINE);
					System.out.println();
					menu2 = scn.nextLine();

					switch (menu2) {
					case "1":
						iMenu2 = 10; // 내과
						break;
					case "2":
						iMenu2 = 20; // 외과
						break;
					case "3":
						iMenu2 = 30; // 정형외과
						break;
					case "4":
						iMenu2 = 40; // 치과
						break;
					case "5":
						iMenu2 = 50; // 안과
						break;
					case "6": // Back
						result2 = false;
						continue;
					default:
						System.out.println("메뉴를 잘못 입력하셨습니다");
						System.out.println();
						continue;
					}

					// 해당 진료과목의 병원 추출
					StringBuffer buffer = new StringBuffer();
					buffer.append(LINE);
					buffer.append(" 원하시는 병원을 선택해 주세요 >>> \n");

					for (Hospital h : goodYomukka.getHospitalList()) {
						for (ClinicKind ck : h.getClinicKindList()) {
							if (ck.getClinicKindId() == iMenu2) {
								iCount++; // 병원선택 일련번호 제공
								hospitalInfo = String.valueOf(iCount) + "."
										+ (h.getHospitalName() + " , " + h.getClinicTime() + " , " + h.getAddress());
								buffer.append(hospitalInfo + " \n");
								hospitalId2[iCount - 1] = h.getHospitalId();
							}
						}
					}
					if (iCount == 0) { // 해당 진료과목에 일치하는 병원이 없는 경우
						System.out.println("해당 진료과목에 해당하는 병원이 없습니다. 다른 진료과목을 선택해 주세요");
						break;
					}
					buffer.append(String.valueOf(iCount + 1) + ".Back \n");
					buffer.append(LINE);
					System.out.println(buffer.toString());
					System.out.println();
					menu3 = scn.nextLine();

					if (Integer.valueOf(menu3) == (iCount + 1)) {
						continue;
					} else if (Integer.valueOf(menu3) < 1 || Integer.valueOf(menu3) > (iCount + 1)) {
						System.out.println("메뉴를 잘못 입력하셨습니다");
						System.out.println();
						continue;
					}

					iMenu3 = hospitalId2[Integer.valueOf(menu3) - 1]; // 선택된 병원id
					for (Hospital h : goodYomukka.getHospitalList()) {
						if (iMenu3 == h.getHospitalId()) { // 선택한 병원의 예약현황을 표시
							result3 = true;

							while (result3) {
								System.out.println(LINE);
								System.out.println(h.getHospitalName() + " 의 예약현황입니다");
								System.out.println("   예약일자  | 예약시간 ");
								iCount = 0;

								for (Reserved r : h.getReservedList()) {
									iCount++;
									System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(r.getDate()) + " | "
											+ new SimpleDateFormat("HH:mm").format(r.getTime()));
								}
								if (iCount == 0) { // 해당 병원에 예약 현황이 없는 경우
									System.out.println("예약내용이 없습니다. 자유롭게 선택하셔도 됩니다");
								}

								System.out.println();
								System.out.println("예약일자를 입력해 주세요(yyyy-mm-dd 형태로 입력) >>>");
								date = scn.nextLine();

								System.out.println();
								System.out.println("예약시간을 입력해 주세요(hh 형태로 입력. 오후 1시는 13, 오후 2시는 14) >>>");
								time = scn.nextLine();
								if (time.length() == 1) {
									time = "0" + time;
								}

								// 기존 예약시간과 중복된 경우 재입력 요청
								iCount = 0;
								for (Reserved r : h.getReservedList()) {
									String d1 = new SimpleDateFormat("yyyy-MM-dd").format(r.getDate());
									String t1 = new SimpleDateFormat("hh").format(r.getTime());

									if (d1.equals(date) && t1.equals(time)) {
										iCount++;
									}
								}

								if (iCount > 0) {
									System.out.println("이미 예약된 일자 시간입니다. 다시 입력해 주세요");
								} else {
									result3 = false; // 예약입력 종료
								}

							} // 예약일자 입력 END

							// 예약시간 객체를 생성
							Reserved rsv1 = new Reserved(h.getHospitalId(), date, time, 100001); // customerId 변경 필요
							h.addReserved(rsv1);
							result2 = false; // 최초 메뉴로 돌아가기
						}
					} // 선택한 병원 END

				} // 예약하기 영역 END
				break;

			case "2": // 진료기록 조회 START
				System.out.println("진료기록 현황입니다");
				System.out.println(LINE);
				System.out.println("  진료일자   | 진료시간 |   병원명   |   병원주소");
				System.out.println(LINE);
				for (Hospital h : goodYomukka.getHospitalList()) {
					for (Reserved r : h.getReservedList()) {
						if (r.getCustomerId() == 100001) { // 고객ID 로그인 ID로 변경 필요
							System.out.print(new SimpleDateFormat("yyyy-MM-dd").format(r.getDate()) + " | "
									+ new SimpleDateFormat("HH:mm").format(r.getTime()) + "  | ");
							System.out.println(h.getHospitalName() + "   | " + h.getAddress());
							System.out.println();
						}
					} // 진료 및 예약리스트 END

				} // 병원리스트 END
				break;

			case "3":
				result1 = false;
				System.out.println();
				System.out.println("서비스를 종료합니다~");
				break;

			default:
				System.out.println("메뉴를 잘못 입력하셨습니다");
				System.out.println();
			} // 진료 하위 메뉴 END
		} // 진료 END
	} //진료 메뉴 END
	
	
}
