package ReverseWords;

public class Solution {
	
    public String reverseWords(String s) {
    	
    	if(s == null||"".equals(s)){//判断是否为空，为空则直接返回
    		return "";
    	}
    	StringBuffer strBuffer = new StringBuffer();
    	String []tempArray = s.replaceAll("\\s{1,}", " ").split(" ");//去除多空格情况然后返回字符数组
    	for(int index = tempArray.length-1;index >= 0;index--){
    		strBuffer.append(tempArray[index]+" ");//拼接反转数组
    	}
    	return strBuffer.toString().trim();
    }
}