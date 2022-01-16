package StringsPrgms;

import java.util.Arrays;

public class SortArray2 {

	public static void main(String[] args) {
		String[] exmp= {"ram", "sham","java","is","the"};
		System.out.println("before sorting"+ Arrays.toString(exmp));
		Arrays.sort(exmp);
		System.out.println("after sorting"+ Arrays.toString(exmp));
	}

}
