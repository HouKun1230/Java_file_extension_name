package fileextension;

import java.io.File;

public class extend {
	
	private boolean canrevert = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("test.txt");
		extend exf = new extend();
		exf.extendsfile(f);
		exf.canrevert = true;
		
		if(exf.canrevert)
		{
			File rf = new File("test.txt.BAK");
			extend rexf = new extend();
			rexf.revert(rf);
		}
		

	}
	
	public void extendsfile(File f)
	{
		int findpoint = f.getName().indexOf(".");
		System.out.println(f.getName().substring(0, findpoint));
		System.out.println(f.getName().substring(findpoint));
		String ex = "BAK";
		f.renameTo(new File(f.getName()+"."+ex));
	}
	
	public void revert(File f)
	{
		int findbak = f.getName().indexOf("BAK");
		f.renameTo(new File(f.getName().substring(0, findbak)));
	}

}
