package p11api.p01textbook.exercises.p04;

public class Member {			//교재 568쪽 확인문제 4
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//여기 코드를 작성하세요
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + ": " + name;
	}
}
