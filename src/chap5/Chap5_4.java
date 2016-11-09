package chap5;

import java.util.HashSet;
import java.util.Set;

public class Chap5_4 {

    public static void main(String[] args) {
        Set<String> result = new HashSet<String>();
        
        Set<String> set1 = new HashSet<String>(){{
        	add("广州");
        	add("中山");
        	add("珠海");
        	add("东莞");
        	add("深圳");
        	add("惠州");
        	add("河源");
        	add("汕尾");
        	add("梅州");
        	add("江门");
        	add("阳江");
        	add("茂名");
        	add("湛江");
        	add("汕头");
        	add("肇庆");
        	add("韶关");
        	add("揭阳");
        }};

        Set<String> set2 = new HashSet<String>(){{
        	add("惠州");
        	add("茂名");
        	add("汕尾");
        	add("汕头");
        	add("珠海");
        	add("揭阳");
        	add("中山");
        	add("阳江");
        }};

      
        result.clear();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("差集："+result);
    }

}