package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chap5_3 {
	public static void main(String[] args) {
		Map<String, String[]> A = new HashMap<>();
		String guang = "广州，中山，珠海，东莞，深圳，惠州，河源，汕尾，汕头，梅州，潮州，揭阳，清远，韶关，肇庆，佛山，云浮，江门，阳江，茂名，湛江";
		String XI = "南宁市　柳州市　桂林市　梧州市　北海市　防城港市　钦州市　贵港市　玉林市　百色市　贺州市　河池市　来宾市　崇左市";
		String YUN = "昆明市 曲靖市 玉溪市 保山市 昭通市 丽江市 普洱市 临沧市 文山壮族苗族自治州 红河哈尼族彝族自治州 西双版纳 楚雄 大理 德宏 怒江傈僳族自治州 迪庆藏族自治州";
		String[] guang1 = guang.split("，");
		String[] XI1 = XI.split("　");
		String[] YUN1 = YUN.split(" ");
		A.put("广东", guang1);
		A.put("云南", YUN1);
		A.put("广西", XI1);
		//测试
		Scanner s = new Scanner(System.in);
		String str = null;
		System.out.println("请输入省名：");
		str = s.next();
		if(str.equals("广东")){
			for (String string : A.get("广东")) {
				System.out.print(string+",");
			}
		}
		else if(str.equals("广西")){
			for (String string : A.get("广西")) {
				System.out.print(string+",");
			}
		}else if(str.equals("云南")){
			for (String string : A.get("云南")) {
				System.out.print(string+",");
			}
		}else
			System.out.println("输入错误");
	}
}