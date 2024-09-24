package BookApp;

public class Book 
{
	String title;
	boolean isComplete;
	public Book(String title) 
	{
		super();
		this.title = title;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public boolean getisComplete() 
	{
		return isComplete;
	}
	public void setisComplete(boolean isComplete) 
	{
		this.isComplete = isComplete;
	}
}
