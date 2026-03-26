package lambda;

@FunctionalInterface
interface SquareOfNumber {
	int square(int n);
}

@FunctionalInterface
interface Palindrome {
	boolean ifPalindrome(String word);
}

public class Exercise2 {

	public static void main(String[] args) {
		Palindrome p2 = (word) -> {
			String rev = new StringBuilder(word).reverse().toString();
			if (rev.equals(word)) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(p2.ifPalindrome("madam"));
	}
}
// TODO Auto-generated method stub
//		SquareOfNumber s = (n) -> n * n;
//		System.out.println(s.square(5));
//
//		
//		Palindrome p = (word) -> {
//			int start = 0;
//			int end = word.length() - 1;
//			while (start <= end) {
//				if (word.charAt(start) != word.charAt(end)) {
//					return false;
//				}
//				start++;
//				end--;
//			}
//			return true;
//		};
//		System.out.println(p.ifPalindrome("madam"));
//	}
