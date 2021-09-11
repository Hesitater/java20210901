package p06class.p01textbook.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	// Account객체를 아이템으로 갖을 수 있음.
	// 참조타입이 아이템일 경우 null 초기화됨.
	private static Account[] accountArray = new Account[100];
	private static int size = 0; // 배열에 Account객체가 몇개 있는지 저장해놓은 변수를 선언해서 활용
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true; // while 문에서

		while (run) { // 조건식이 true이면 실행되고 run값 확인 반복 run이 true라 무조건 한번실행
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			// 정수 입력 받고 번호에따라 다른 메소드 실행 5번 종료
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
	}

	private static void createAccount() {
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");

		System.out.print("계좌번호:");
		String ano = scanner.next();

		System.out.print("계좌주:");
		String owner = scanner.next();

		System.out.print("초기입금액:");
		int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance); // 새 객체를 만들어서 계좌번호,게좌주,초기입금액 넣음
		accountArray[size] = account;
		size++; // 계좌가 나올때마다 0번부터 순서대로 넣어 저장
//			accountArray[size++] = account;		//위에 두줄을 한줄로도 가능
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");
		
		for (int i = 0; i < size; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.println(accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.println("----------------");
		System.out.println("예금");
		System.out.println("----------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		
		System.out.print("예금액:");
		int cash = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account != null ) {
		int balance = account.getBalance() + cash ;		// (기존에있는돈 + 입력받은값) 을 다시 넣는다.
		System.out.println("결과: 예금이 성공되었습니다.");

		}
	}

	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		
		System.out.print("출금액:");
		int cash = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		account.setBalance(account.getBalance() - cash);	// (기존에 있는돈 - 입력받은값) 을 다시 넣는다.
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 ACCount 객체찾기
	private static Account findAccount(String ano) {		// i번째 계좌번호 = parameter입력받은 계좌가 같으면
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];						// return 
			}
		}
		System.out.println("계좌번호가 존재하지 않습니다");
		
		return null;
	}

}
