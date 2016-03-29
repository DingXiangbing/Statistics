import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Zifutongji {
	 public static void main(String[] args){
		 try {
			 	int a=0,c=0,d=0,m=0;
			 	int v=0;
	            Scanner in = new Scanner(new File("d:/abc.txt"));
	            while (in.hasNextLine()) {
	                String str = in.nextLine();
	                for(int i=0;i<str.length();i++){
	                	 char b=str.charAt(i);
	                	 if((b>=97&&b<=122)||(b>=65&&b<=90))
	                	 {
	                		 v++;
	                		 if((i==str.length()-1))
	                		 {
	                			 c++;
	                			 v=0;
	                		 }
	                	 }
	                	 else
	                	 {
	                		 if(v>0)
	                		 {
	                			 c++;
	                			 v=0;
	                		 }
	                	 }
	                	 m=i+1;
	                }
	                a+=m;
	                d++;
	            }
	            System.out.println("字符数为："+a);
	            System.out.println("单词数为："+c);
	            System.out.println("行数为："+d);
	        } catch (FileNotFoundException e) {
	        	System.out.print("请将需要统计的文本放至D盘，并命名为abc！！！");
	            //e.printStackTrace();
	        }
		 
	 }
}
