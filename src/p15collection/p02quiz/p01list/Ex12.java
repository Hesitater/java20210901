package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex12 {
	public boolean mirror(List<Integer> list) {
		// list 중간 인덱스 기준으로 왼쪽과 오른쪽이 거울(데칼코마니);
		// 1,2,3,4,3,2,1
		int left = 0;
		int right = list.size() - 1;
		boolean run = true;

		while (left < right) { // 왼쪽이 오른쪽보다 클 경우 까지만.
			int leftValue = list.get(left);
			int rightValue = list.get(right);

			if (leftValue == rightValue) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;

	}

	public <T> boolean mirror2(List<T> list) { // String으로 받을때
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			T leftValue = list.get(left);
			T rightValue = list.get(right);

			if (leftValue.equals(rightValue)) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;
	}

}
