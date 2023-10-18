public class Pangram 
{
	public static void main(String[] args) 
	{
		String str = "The quick brown fox jumps over a lazy dog";
		boolean rs = ispangram(str);
		if(rs)
		{
			System.out.println("given string is pangram");
		}
		else
		{
			System.out.println("given string is not pangram");
		}
	}
	private static boolean ispangram(String str)
	{
			if(str.length()<26)
				return false;
			int[]ct=new int[26];
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch>='A'&& ch<='Z')
					ct[ch-65]++;
				else if(ch>='A'&& ch<='z')
					ct[ch-97]++;
			}
			for(int i=0;i<26;i++)
			{
				if(ct[i]==0)
					return false;
			}
		return true;
	}
}