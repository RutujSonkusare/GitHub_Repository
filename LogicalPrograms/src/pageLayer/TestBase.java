package pageLayer;

public class TestBase {

	public static void main(String [] args)
	{
		TestBase t = new TestBase();
		t.AmstrongNo();
	}
	
	public void AmstrongNo()
	{
		int n=1583;
		int t1=n;
		int l=0;
		while(t1!=0)
		{
			t1=t1/10;
			l=l+1;
		}
		int t2=n;
		int rem;
		int arm=0;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=l;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(n==arm)
		{
			System.out.println("It is an Amstrong Number");
		}
		else
		{
			System.out.println("It is not Amstrong Number");
		}
	}
}
