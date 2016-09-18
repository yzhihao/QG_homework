package chap3;

import java.text.*;
import java.util.Date;
public  class Chap3_26{
    public static void main(String[] args) 
    {
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh时mm分");
          System.out.println(sdf.format(new Date()));
    }
}