package yomuka.rayson.method;


import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.rayson.product.ProductCat;
import yomuka.rayson.product.ProductDog;
import yomuka.rayson.product.ProductList;
import yomuka.rayson.template.Define;
import yomuka.rayson.template.Screen;



public class Subscribe {
	
	public void subscribe(Customer customer) {
		// 임시 객체 생성
		ProductList pdl = new ProductList();
		ProductDog pdd = new ProductDog();
		ProductCat pdc = new ProductCat();
		Subscribe sub = new Subscribe();
		Screen screen = new Screen();
		Scanner sc = new Scanner(System.in);

		ProductDog productDog1 = new ProductDog("챠르르멍(오메가3)", Define.SUPPLEMENT, 20, 32500);
		ProductDog productDog2 = new ProductDog("사이노퀸(관절)", Define.SUPPLEMENT, 10, 29750);
		ProductDog productDog3 = new ProductDog("잘나와굳(유산균)", Define.SUPPLEMENT, 2, 12500);
		ProductDog productDog4 = new ProductDog("개탱탱(콜라겐)", Define.SUPPLEMENT, 30, 19250);
		ProductDog productDog5 = new ProductDog("멍리보여(루테인)", Define.SUPPLEMENT, 15, 38500);

		ProductDog productDog6 = new ProductDog("로얄캐닌 베이비 1kg", Define.FEED, 3, 17500);
		ProductDog productDog7 = new ProductDog("로얄캐닌 말티즈 3.5kg", Define.FEED, 7, 38500);
		ProductDog productDog8 = new ProductDog("지위픽 소고기 900g", Define.FEED, 50, 23500);
		ProductDog productDog9 = new ProductDog("The realDog 연어 1.5kg", Define.FEED, 0, 14500);

		ProductDog productDog10 = new ProductDog("바삭 연어트릿", Define.SNACK, 11, 9900);
		ProductDog productDog11 = new ProductDog("퍼피프루트(동결건조과일)", Define.SNACK, 4, 7900);
		ProductDog productDog12 = new ProductDog("달콤고구마말랭", Define.SNACK, 1, 5500);
		ProductDog productDog13 = new ProductDog("불리스틱(강아지껌)", Define.SNACK, 42, 2500);

		ProductCat productCat1 = new ProductCat("Noble Cat(오메가3)", Define.SUPPLEMENT, 5, 29800);
		ProductCat productCat2 = new ProductCat("시스테이드(방광)", Define.SUPPLEMENT, 10, 28000);
		ProductCat productCat3 = new ProductCat("굳푸푸(유산균)", Define.SUPPLEMENT, 8, 13800);
		ProductCat productCat4 = new ProductCat("튼튼하다냥(종합)", Define.SUPPLEMENT, 23, 23500);
		ProductCat productCat5 = new ProductCat("잘보인다냥(루테인)", Define.SUPPLEMENT, 15, 53000);

		ProductCat productCat6 = new ProductCat("오리젠 식스피쉬 1.3kg", Define.FEED, 8, 33500);
		ProductCat productCat7 = new ProductCat("아카나 와일드프레이야 1.8kg", Define.FEED, 1, 32850);
		ProductCat productCat8 = new ProductCat("뉴트로 연어&현미 2.45kg", Define.FEED, 20, 21500);
		ProductCat productCat9 = new ProductCat("게더 치킨 2.8kg", Define.FEED, 5, 42000);

		ProductCat productCat10 = new ProductCat("촉촉 북어트릿", Define.SNACK, 11, 11900);
		ProductCat productCat11 = new ProductCat("츄르 가다랑어맛", Define.SNACK, 5, 3900);
		ProductCat productCat12 = new ProductCat("츄르 연어맛", Define.SNACK, 1, 3900);
		ProductCat productCat13 = new ProductCat("츄르 대게맛", Define.SNACK, 12, 6900);
		ProductCat productCat14 = new ProductCat("바사삭 캣닢 비스킷", Define.SNACK, 8, 2900);
		
		

		pdl.addProduct(pdd.ProductNumber(productDog1), productDog1);
		pdl.addProduct(pdd.ProductNumber(productDog2), productDog2);
		pdl.addProduct(pdd.ProductNumber(productDog3), productDog3);
		pdl.addProduct(pdd.ProductNumber(productDog4), productDog4);
		pdl.addProduct(pdd.ProductNumber(productDog5), productDog5);
		pdl.addProduct(pdd.ProductNumber(productDog6), productDog6);
		pdl.addProduct(pdd.ProductNumber(productDog7), productDog7);
		pdl.addProduct(pdd.ProductNumber(productDog8), productDog8);
		pdl.addProduct(pdd.ProductNumber(productDog9), productDog9);
		pdl.addProduct(pdd.ProductNumber(productDog10), productDog10);
		pdl.addProduct(pdd.ProductNumber(productDog11), productDog11);
		pdl.addProduct(pdd.ProductNumber(productDog12), productDog12);
		pdl.addProduct(pdd.ProductNumber(productDog13), productDog13);

		pdl.addProduct(pdc.ProductNumber(productCat1), productCat1);
		pdl.addProduct(pdc.ProductNumber(productCat2), productCat2);
		pdl.addProduct(pdc.ProductNumber(productCat3), productCat3);
		pdl.addProduct(pdc.ProductNumber(productCat4), productCat4);
		pdl.addProduct(pdc.ProductNumber(productCat5), productCat5);
		pdl.addProduct(pdc.ProductNumber(productCat6), productCat6);
		pdl.addProduct(pdc.ProductNumber(productCat7), productCat7);
		pdl.addProduct(pdc.ProductNumber(productCat8), productCat8);
		pdl.addProduct(pdc.ProductNumber(productCat9), productCat9);
		pdl.addProduct(pdc.ProductNumber(productCat10), productCat10);
		pdl.addProduct(pdc.ProductNumber(productCat11), productCat11);
		pdl.addProduct(pdc.ProductNumber(productCat12), productCat12);
		pdl.addProduct(pdc.ProductNumber(productCat13), productCat13);
		pdl.addProduct(pdc.ProductNumber(productCat14), productCat14);

		boolean subs = true;
		while (subs) {
			screen.askSubscribe();
			String choice1 = sc.nextLine();
			// 구독하시겠습니까?
			if (choice1.equals("1")) {
				boolean kind = true;
				while (kind) {
					screen.askDogOrCat();
					String choice2 = sc.nextLine();
					// 강아지 물건을 보고 싶을 때
					if (choice2.equals(Define.DOG)) {
						boolean purchaseDog = true;
						while (purchaseDog) {
							// 강아지 물건 리스트
							System.out.println();
							pdl.dogOrCatList(Integer.parseInt(Define.DOG));
							screen.purchaseTop();
							System.out.print("     물건번호 : ");
							int orderNum = sc.nextInt();
							boolean amountgo = true;
							while (amountgo) {
								// 정기구독 물품 입력
								if (pdl.productList.containsKey(orderNum)) {
									System.out.print("     수량 : ");
									int orderAmount = sc.nextInt();
									// 수량이 재고보다 같거나 적을 때, 0보다 클때 주문 성공
									if (orderAmount <= pdl.productList.get(orderNum).amount && orderAmount > 0) {
										pdl.productList.get(orderNum).amount -= orderAmount;
										customer.point += pdl.productList.get(orderNum).price * customer.ratio
												* orderAmount;
										System.out.println();
										System.out.println(
												customer.getName() + "님 " + pdl.productList.get(orderNum).productName + " "
														+ orderAmount + "개 주문이 완료되었습니다!");
										System.out.println("정기 구독고객님은 포인트를 3%로 더 적립해 드려요!");
										System.out.println();
										System.out.println((int) (pdl.productList.get(orderNum).price
												* customer.ratio * orderAmount) + " 포인트 적립되었습니다!");
										System.out.println("고객님의 현재 포인트는 " + customer.point + "입니다.");
										screen.purchaseBottom();

										boolean periodCheck = true;
										while (periodCheck) {
											screen.askPeriodTop();
											System.out.println("        " + customer.getName() + "님!        ");
											screen.askPeriodBottom();
											int choice3 = sc.nextInt();
											if (choice3 == 1) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 한달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseDog = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											} else if (choice3 == 2) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 두달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseDog = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											}
										}
										// 재고가 없을 때
									} else if (pdl.productList.get(orderNum).amount == 0) {
										System.out.println("죄송합니다, 해당 제품은 재고가 없습니다ㅜㅜ");
										amountgo = false;
										// 재고보다 주문량이 많을 때
									} else if (orderAmount > pdl.productList.get(orderNum).amount) {
										System.out.println("죄송합니다. " + pdl.productList.get(orderNum).productName
												+ "의 수량이 주문하신 수량보다 적습니다ㅠㅠ");
										System.out.println(pdl.productList.get(orderNum).productName + "은 현재 "
												+ pdl.productList.get(orderNum).amount + "개 남아있습니다.");
										System.out.println();
										// 수량 입력 받는 값이 잘못되었을 때
									} else {
										System.out.println("잘못된 수량을 입력하셨습니다.");
									}
									// 주문을 그만하고 싶을 때
								} else if (orderNum == 12345) {
									System.out.println("˚✧₊⁎ 다음엔 꼭 이용해주세요 ⁎⁺˳✧˚");
									amountgo = false;
									purchaseDog = false;
									kind = false;
									subs = false;
								}
								// 물건 번호 잘못 입력했을 때
								else {
									System.out.println("물건 번호를 잘못 입력하셨습니다.");
									amountgo = false;
								}
							}
						}
					} else if (choice2.equals(Define.CAT)) {
						boolean purchaseCat = true;
						while (purchaseCat) {
							// 고양이 물건 리스트
							System.out.println();
							pdl.dogOrCatList(Integer.parseInt(Define.CAT));
							screen.purchaseTop();
							System.out.print("     물건번호 : ");
							int orderNum = sc.nextInt();
							boolean amountgo = true;
							while (amountgo) {
								// 정기구독 물품 입력
								if (pdl.productList.containsKey(orderNum)) {
									System.out.print("     수량 : ");
									int orderAmount = sc.nextInt();
									// 수량이 재고보다 같거나 적을 때, 0보다 클때 주문 성공
									if (orderAmount <= pdl.productList.get(orderNum).amount && orderAmount > 0) {
										pdl.productList.get(orderNum).amount -= orderAmount;
										customer.point += pdl.productList.get(orderNum).price * customer.ratio
												* orderAmount;
										System.out.println();
										System.out.println(
												customer.getName() + "님 " + pdl.productList.get(orderNum).productName + " "
														+ orderAmount + "개 주문이 완료되었습니다!");
										System.out.println((int) (pdl.productList.get(orderNum).price
												* customer.ratio * orderAmount) + " 포인트 적립되었습니다!");
										System.out.println("고객님의 현재 포인트는 " + customer.point + "입니다.");
										screen.purchaseBottom();
										boolean periodCheck = true;
										while (periodCheck) {
											screen.askPeriodTop(); // 추후 수정해야함
											System.out.println("        " + customer.getName() + "님!        ");
											screen.askPeriodBottom();
											int choice3 = sc.nextInt();
											if (choice3 == 1) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 한달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseCat = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											} else if (choice3 == 2) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 두달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseCat = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											}
										}
										// 재고가 없을 때
									} else if (pdl.productList.get(orderNum).amount == 0) {
										System.out.println("죄송합니다, 해당 제품은 재고가 없습니다ㅜㅜ");
										amountgo = false;
										// 재고보다 주문량이 많을 때
									} else if (orderAmount > pdl.productList.get(orderNum).amount) {
										System.out.println("죄송합니다. " + pdl.productList.get(orderNum).productName
												+ "의 수량이 주문하신 수량보다 적습니다ㅠㅠ");
										System.out.println(pdl.productList.get(orderNum).productName + "은 현재 "
												+ pdl.productList.get(orderNum).amount + "개 남아있습니다.");
										System.out.println();
										// 수량 입력 받는 값 꼬라지가 난리일 때
									} else {
										System.out.println("잘못된 수량을 입력하셨습니다.");
									}
									// 주문을 그만하고 싶을 때
								} else if (orderNum == 12345) {
									System.out.println("˚✧₊⁎ 다음엔 꼭 이용해주세요 ⁎⁺˳✧˚");
									amountgo = false;
									purchaseCat = false;
									kind = false;
									subs = false;
								}
								// 물건 번호 잘못 입력했을 때
								else {
									System.out.println("물건 번호를 잘못 입력하셨습니다.");
									amountgo = false;
								}
							}
						}
						// 고양이, 강아지 물품 구매
					} else if (choice2.equals("3")) {
						boolean purchaseAll = true;
						while (purchaseAll) {
							// 모든 물건 리스트
							System.out.println();
							pdl.showList();
							screen.purchaseTop();
							System.out.print("     물건번호 : ");
							int orderNum = sc.nextInt();
							boolean amountgo = true;
							while (amountgo) {
								// 정기구독 물품 입력
								if (pdl.productList.containsKey(orderNum)) {
									System.out.print("     수량 : ");
									int orderAmount = sc.nextInt();
									// 수량이 재고보다 같거나 적을 때, 0보다 클때 주문 성공
									if (orderAmount <= pdl.productList.get(orderNum).amount && orderAmount > 0) {
										pdl.productList.get(orderNum).amount -= orderAmount;
										customer.point += pdl.productList.get(orderNum).price * customer.ratio
												* orderAmount;
										System.out.println();
										System.out.println(
												customer.getName() + "님 " + pdl.productList.get(orderNum).productName + " "
														+ orderAmount + "개 주문이 완료되었습니다!");
										System.out.println((int) (pdl.productList.get(orderNum).price
												* customer.ratio * orderAmount) + " 포인트 적립되었습니다!");
										System.out.println("고객님의 현재 포인트는 " + customer.point + "입니다.");
										screen.purchaseBottom();
										boolean periodCheck = true;
										while (periodCheck) {
											screen.askPeriodTop(); // 추후 수정해야함
											System.out.println("        " + customer.getName() + "님!        ");
											screen.askPeriodBottom();
											int choice3 = sc.nextInt();
											if (choice3 == 1) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 한달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseAll = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											} else if (choice3 == 2) {
												boolean additional = true;
												while (additional) {
													System.out.println("네 고객님! 두달 주기로 물건을 정기배송해드리겠습니다!추가 주문하시겠습니까?");
													System.out.println();
													System.out.println("         1.추가주문하기  |  2. 주문 그만하기");
													int choice4 = sc.nextInt();
													if (choice4 == 1) {
														additional = false;
														periodCheck = false;
														amountgo = false;
													} else if (choice4 == 2) {
														System.out.println("        ˚✧₊⁎ 주문을 완료합니다 ⁎⁺˳✧˚    ");
														additional = false;
														periodCheck = false;
														amountgo = false;
														purchaseAll = false;
														kind = false;
														subs = false;
													} else {
														System.out.println("정확히 입력해주세요.");
													}
												}
											}
										}
										// 재고가 없을 때
									} else if (pdl.productList.get(orderNum).amount == 0) {
										System.out.println("죄송합니다, 해당 제품은 재고가 없습니다ㅜㅜ");
										amountgo = false;
										// 재고보다 주문량이 많을 때
									} else if (orderAmount > pdl.productList.get(orderNum).amount) {
										System.out.println("죄송합니다. " + pdl.productList.get(orderNum).productName
												+ "의 수량이 주문하신 수량보다 적습니다ㅠㅠ");
										System.out.println(pdl.productList.get(orderNum).productName + "은 현재 "
												+ pdl.productList.get(orderNum).amount + "개 남아있습니다.");
										System.out.println();
										// 수량 입력 받는 값 꼬라지가 난리일 때
									} else {
										System.out.println("잘못된 수량을 입력하셨습니다.");
									}
									// 주문을 그만하고 싶을 때
								} else if (orderNum == 12345) {
									System.out.println("˚✧₊⁎ 다음엔 꼭 이용해주세요 ⁎⁺˳✧˚");
									amountgo = false;
									purchaseAll = false;
									kind = false;
									subs = false;
								}
								// 물건 번호 잘못 입력했을 때
								else {
									System.out.println("물건 번호를 잘못 입력하셨습니다.");
									amountgo = false;
								}
							}
						}
					} else {
						System.out.println("1과 3 사이의 숫자를 입력해주세요");
					}
				}
				// 구독하러 들어와놓곤 안 하고 바로 나갈 때
			} else if (choice1.equals("2")) {
				System.out.println("˚✧₊⁎ 다음에 이용해주세요, 감사합니다 ⁎⁺˳✧˚");
				subs = false;
			}
		}

	}
}
