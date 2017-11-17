package copyarrays;

public class HorseBarn {

	private Horse[] spaces;
	
	public HorseBarn(Horse[] huh)
	{
		this.spaces = huh;
	}

	public int findHorseSpace(String name)
	{
		for (int i =0;i < this.spaces.length;i++)
		{
			if(this.spaces[i]!=null && name.equals(this.spaces[i].getName()))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate()
	{
		Horse[] newArr = new Horse[this.spaces.length];
		int count = 0;
		for (Horse nextHorse : this.spaces)
		{
			if (nextHorse != null)
			{
				newArr[count] = nextHorse;
				count++;
			}
		}
		this.spaces = newArr;
	}
	
	public String toString()
	{
		for(int i = 0; i < this.spaces.length;i++)
		{
			if(this.spaces[i] != null)
			{
				System.out.print("[" +spaces[i].getName() + "] ");
			}
			else
			{
				System.out.print("[null] ");
			}
		}
		return "";
	}
}
