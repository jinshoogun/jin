package ex07_10;

public class Numbers {
	int num[];

	Numbers(int num[]) {
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
			total += num[cnt];
		return total;
	}

	int getAverage() {
		int total;
		total = getTotal();
		int average = total / num.length;
		return average;
	}

	int Max() {
		int max;
		max = num[0];
		for (int n = 0; n < num.length; n++) {
			if (max > num[n])
				max = max;
			else
				max = num[n];
		}
		return max;
	}

	int Min() {
		int min;
		min = num[0];
		for (int n = 0; n < num.length; n++) {
			if (min < num[n])
				min = min;
			else
				min = num[n];
		}
		return min;
	}
}
