package com.ssll.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class TransportPinyin {
	
	public static String transport(char str){
		HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();   
		
		// UPPERCASE：大写  (ZHONG)  
		// LOWERCASE：小写  (zhong)  
		format.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
		
		// WITHOUT_TONE：无音标  (zhong)  
		// WITH_TONE_NUMBER：1-4数字表示英标  (zhong4)  
		// WITH_TONE_MARK：直接用音标符（必须WITH_U_UNICODE否则异常）  (zhòng)  
		format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
		  
		// WITH_V：用v表示ü  (nv)  
		// WITH_U_AND_COLON：用"u:"表示ü  (nu:)  
		// WITH_U_UNICODE：直接用ü (nü)  
		format.setVCharType(HanyuPinyinVCharType.WITH_V);  
		          
		try {
			String[] pinyin = PinyinHelper.toHanyuPinyinStringArray(str, format);
			String res = "";
			res = res+pinyin[0].charAt(0);
			return res;
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ""; 
	}
	
	/**
	 * 
	 * @param String str
	 * @return 返回汉字对应的Pinyin拼写,带数字会去除原有字母
	 */
	public static String pinyin(String str){
		String num = str;
		String reg = "[^\u4e00-\u9fa5]";
		str = str.replaceAll(reg, "");
		char[] charArray = str.toCharArray();
		String result = "";
		for(int i=0;i<charArray.length;i++){
			String res = transport(charArray[i]);
			result = result+res;
		}
		
		String regEx="[^0-9]";   
		Pattern p = Pattern.compile(regEx);   
		Matcher m = p.matcher(num); 
		result = result + m.replaceAll("").trim();
		return result;
	}
	
	/*public static void main(String[] args) {
		TransportPinyin test = new TransportPinyin();
		String str = test.pinyin("aaaa里程碑9988");
		System.out.println(str);
	}*/
}
