package demo;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;


public class  EmptyTagDemo extends TagSupport 
{

	public int doStartTag()
	{
	try	{
		
	JspWriter out = pageContext.getOut();
	out.println("Satya,Vijayawada,Kanur");

	}
	catch (Exception  e)
	{
	System.err.println(e);
	}
	return SKIP_BODY;
	}
	
}
