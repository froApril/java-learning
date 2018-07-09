class TD
{
	int y=6;
	 class Inner
	{
		 int y=3;
		 void show()
		{
			System.out.println(y);
		}
	}
}
class TC
{
	public static void main(String[] args)
	{
		TD.Inner a = new TD().new Inner();
    a.show();
	}
}
