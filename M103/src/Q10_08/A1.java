package Q10_08;

import java.io.*;
import java.util.*;

public class A1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GregorianCalendar cal = new GregorianCalendar();
		int year;
		boolean bool;

		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = Integer.parseInt(br.readLine());

		bool = cal.isLeapYear(year);

		if (bool)
			System.out.println("����");
		else
			System.out.println("���");
	}

}