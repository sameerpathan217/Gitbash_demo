package Genric_Utility;

import java.util.Date;

public class Java_Utility {
	
	
	public String getSysdate() {
		Date d=new Date();
	String[] arr = d.toString().split(" ");
	
	String curdate = arr[2]+"-"+arr[1]+"-"+arr[5]+"-"+arr[3].replace(":", "-");
	return curdate;
	}
   //git pull the changes back from git to eclipse
	
	
	//git push again to master branch from eclipse to git
}
