import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if(str=="") return 0;
		str+='\0';
		int max=0;
		int len=str.length();
		for(int i=0;i<len;i++){
			int j=i;
			int val=0;
			while(str.charAt(j)!='\0'&&str.charAt(j)==str.charAt(i)){
				val++;
				j++;
			}
			if(val>max) max=val;

		}

		return max; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz"
	 * a33txz
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		if(str=="") return "";
		int len=str.length();
		String result="";
		for(int i=0;i<len-1;i++){
			char ch=str.charAt(i);
			if('0'<=ch&&ch<='9'){
				char next=str.charAt(i+1);
				for(int j=0;j<(ch-'0');j++) result+=next;
			}else result+=ch;
		}
		char ch=str.charAt(len-1);
		if(!('0'<=ch&&ch<='9')) result+=ch;
		return result;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
//		HashSet<String> set1=new HashSet<>();
//		HashSet<String> set2=new HashSet<>();
//		int lenA=a.length();
//		int lenB=b.length();
//		int minLength=Math.min(lenA,lenB);
//		String lastSubString1="",lastSubString2="";
//		for(int i=0;i<=minLength-len;i++){
//			String subA=a.substring(i,i+len);
//			String subB=b.substring(i,i+len);
//			if(subA.equals(subB)) return true;
//			if((set1.contains(subA)&&set2.contains(subA))||(set1.contains(subB)&&set2.contains(subB))){
//				return true;
//			}else{
//				set1.add(subA);
//				set2.add(subB);
//			}
//			if(i==minLength-len){
//				lastSubString1=subA;
//				lastSubString2=subB;
//			}
//		}
//		/**
//		 * check sub cuoi.
//		 */
//		if((set1.contains(lastSubString1)&&set2.contains(lastSubString1))||(set1.contains(lastSubString2)&&set2.contains(lastSubString2))) {
//			return true;
//		}
//
//
//		return false; // YOUR CODE HERE
		HashSet<String> newSet=new HashSet<>();
		for(int i=0;i<=a.length()-len;i++){
			newSet.add(a.substring(i,i+len));
		}
		for(int i=0;i<=b.length()-len;i++){
			if(newSet.contains(b.substring(i,i+len))) return true;
		}

		return false;
	}
}
