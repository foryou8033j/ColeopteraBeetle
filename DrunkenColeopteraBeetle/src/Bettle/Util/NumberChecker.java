package Bettle.Util;

/**
 * ���� Ȯ�� Ŭ����
 * @author Jeongsam
 *
 */
public class NumberChecker {

	/**
	 * �Էµ� ���ڿ��� ������������ Ȯ���Ѵ�.
	 * @param str
	 * @return {@link boolean}
	 */
	public static boolean Check(String str){
		
		try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
		
	}
	
}
