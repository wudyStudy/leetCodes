package ReverseWords;

public class Solution {
	
    public String reverseWords(String s) {
    	
    	if(s == null||"".equals(s)){//�ж��Ƿ�Ϊ�գ�Ϊ����ֱ�ӷ���
    		return "";
    	}
    	StringBuffer strBuffer = new StringBuffer();
    	String []tempArray = s.replaceAll("\\s{1,}", " ").split(" ");//ȥ����ո����Ȼ�󷵻��ַ�����
    	for(int index = tempArray.length-1;index >= 0;index--){
    		strBuffer.append(tempArray[index]+" ");//ƴ�ӷ�ת����
    	}
    	return strBuffer.toString().trim();
    }
}