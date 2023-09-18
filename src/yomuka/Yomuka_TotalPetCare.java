package yomuka;

import java.util.Iterator;
import java.util.Scanner;

import yomuka.cornel.Yomukka;
import yomuka.cornel.hospital.Clinic;
import yomuka.garden.customer_part.Customer;
import yomuka.garden.customer_part.CustomerHash;
import yomuka.garden.method.Main;
import yomuka.garden.pet_part.PetHash;
import yomuka.purple.dailycare.ChooseMenu;
import yomuka.purple.monthly.ChooseMenu3;
import yomuka.purple.weekly.ChooseMenu2;
import yomuka.rayson.method.Subscribe;
import yomuka.rayson.template.Screen;

public class Yomuka_TotalPetCare {
	
	//static 전역변수 선언
	private static CustomerHash customerHash;
	private static PetHash petHash;
	private static Customer customer;
	Yomukka goodYomukka = Yomukka.getInstance();

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		//필요한 객체들 생성
		Main main = new Main();
		customer = new Customer();
		Clinic clinic = new Clinic();
		Subscribe sub = new Subscribe();
		customerHash = new CustomerHash();
		petHash = new PetHash();
		ChooseMenu chooseMenu = new ChooseMenu();
		ChooseMenu2 chooseMenu2 = new ChooseMenu2();
		ChooseMenu3 choosemenu3 = new ChooseMenu3();
		Screen screen = new Screen();
		Scanner sc = new Scanner(System.in);

		// 기존 고객과 반려동물 설정
		main.setCustomerPet(customerHash, petHash);

		// 프로그램 첫 화면
		boolean ymain = true;

		while (ymain) {
			screen.main();
			int mainMenu = sc.nextInt();
			// 로그인
			if (mainMenu == 1) {

				boolean login = true;
				while (login) {
					boolean tryLogin = true;
					while (tryLogin) {
						System.out.println();
						System.out.println("｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡");
						System.out.println();
						System.out.println("            요람부터 무덤까지 YOMUKA!");
						System.out.println();
						System.out.print("      ID : ");
						sc.nextLine();
						String loginId = sc.nextLine();
						System.out.print("      PW : ");
						String loginPassword = sc.nextLine();
						System.out.println();
						System.out.println("｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡");
						System.out.println();

						int iCount = 0;

						Iterator<Integer> ir = customerHash.customerHash.keySet().iterator();
						while (ir.hasNext()) {
							int key = ir.next();
							Customer cust = customerHash.customerHash.get(key);
							if (cust.getId().equals(loginId) && cust.getPw().equals(loginPassword)) {
								iCount++;
								customer = cust;
								System.out.println(customer.getName() + "고객님 반갑습니다!");
								
								// 로그인 시 이용가능한 메뉴들
								boolean afterLogin = true;
								while (afterLogin) {
									screen.loginMain();
									Scanner sc2 = new Scanner(System.in);
									int loginMenu = sc2.nextInt();
									//회원정보
									if (loginMenu == 1) {
										boolean customerLogin = true;
										while (customerLogin) {
											screen.customerMain();
											int customerMenu = sc.nextInt();
											if (customerMenu == 1) {
												System.out.println("회원 정보:");
												System.out.println(cust.showCustomerInfo());
											} else if (customerMenu == 2) {
												System.out.println("구독회원권은 월 5000원입니다. 가입하시겠습니까?");
												System.out.println("가입을 원하시면 1번 그렇지 않다면 2번을 눌러주세요");
												int customerSub = sc.nextInt();
												if (customerSub == 1) {
													if (cust.grade != "구독고객") {
														cust.grade = "구독고객";
														cust.ratio = 0.03;
														System.out.println("구독등록되었습니다. 감사합니다.");
														System.out.println(cust.showCustomerInfo());
													} else {
														System.out.println("이미 구독고객입니다.");
													}
												} else if (customerSub == 2) {
													System.out.println("메인화면으로 전환하겠습니다.");
													customerLogin = false;
												}
											} else if (customerMenu == 3) {
												System.out.println("메인화면으로 전환하겠습니다.");
												customerLogin = false;
											} else {
												System.out.println("잘못누르셨습니다.");
											}
										}
									// 반려동물 등록
									} else if (loginMenu == 2) {
										main.newPetSign(petHash, cust);
									} 
									// 반려동물 정보 조회
									else if (loginMenu == 3) {
										if(petHash.existence(cust)) {
											petHash.displayAllPets(cust);
										} else {
											System.out.println("등록된 반려동물이 없습니다.");
										}
									} 
									// purple의 역작1
									else if (loginMenu == 4) {
										boolean caremenu = true;
										while (caremenu) {
											screen.careMenu();
											int careChoice = sc2.nextInt();
											if (careChoice == 1) {
												chooseMenu.choosemenu(cust, petHash);
											} else if (careChoice == 2) {
												chooseMenu2.choosemenu2(cust, petHash);
											} else if (careChoice == 3) {
												choosemenu3.choosemenu3(cust, petHash);
											} else if (careChoice == 4) {
												caremenu = false;
											}
											else {
												System.out.println("메뉴번호를 잘못 입력했습니다.");
											}
										}
									} // 반려동물 용품 정기구독
									else if (loginMenu == 5) {
										sub.subscribe(customer);
									} // 반려동물 병원관리
									else if (loginMenu == 6) {
										clinic.createHospital();
										clinic.goClinic(sc);
									} // 반려인 교육
									else if (loginMenu == 7) {
										clinic.createCourse();
										clinic.goClass(sc);
									} else if (loginMenu == 8) {
										System.out.println("      ˚✧₊⁎준비 중입니다. 기다려 주세요⁎⁺˳✧˚");
									} else if (loginMenu == 9) {
										System.out.println("      ˚✧₊⁎준비 중입니다. 기다려 주세요⁎⁺˳✧˚");
									} else if (loginMenu == 0) {
										System.out.println("˚✧₊⁎ 다음엔 꼭 이용해주세요 ⁎⁺˳✧˚");
										tryLogin = false;
										afterLogin = false;
										login = false;
										ymain = false;
									} else {
										System.out.println("메뉴 번호를 올바르게 입력해주세요.");
									}
								} // while(afterLogin) end

							} // if(로그인) end
						} // while(ir.hasNext()) end
						if (iCount == 0) {
							System.out.println("로그인을 실패했습니다. 아이디와 비밀번호를 확인해주세요.");
						}
					} // while(tryLogin) end
						// 로그인 시 이용가능한 메뉴 끝
				}
				login = false;

				// 회원가입
			} else if (mainMenu == 2) {
				System.out.println("회원가입");
				System.out.print("이름을 입력해주세요: ");
				sc.nextLine(); // 위의 mainMenu 스캐너가 엔터값을 남겨서 name값 입력이
				// 불가하여 오류 수정을 위해 추가

				String name = sc.nextLine();
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String password = sc.nextLine();

				Customer Customer_ = new Customer(name, id, password);
				customerHash.addCustomer(Customer_.customerNum, Customer_);

				System.out.println("회원가입이 완료되었습니다.");
				System.out.println();
				System.out.println("회원 정보");
				System.out.println(Customer_.showCustomerInfo());
				// 종료
			} else if (mainMenu == 3) {
				System.out.println("˚✧₊⁎ 다음엔 꼭 이용해주세요 ⁎⁺˳✧˚");
				ymain = false;
			} else {
				System.out.println("메인 메뉴 선택이 잘못되엇소");
			}
		}
		sc.close();
	}
}