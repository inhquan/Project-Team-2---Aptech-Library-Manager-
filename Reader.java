 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class Reader 
{
	private int readerId;
	private String name;
	private String identityCard;
	private String phoneNo;
	private String cardIssueDate;
	private String job;
	
	public Reader() 
	{

	}

	public Reader(int readerId, String name, String identityCard, String phoneNo,
			String cardIssueDate, String job)
	{
                this.readerId = readerId;
		this.name = name;
		this.identityCard = identityCard;
		this.phoneNo = phoneNo;
		this.cardIssueDate = cardIssueDate;
		this.job = job;
	}



    Reader(String name, String identityCard, String phoneNo, String cardIssueDate, String job) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


	public int getReaderId() 
	{
		return readerId;
	}

	public void setReaderId(int readerId) 
	{
		this.readerId = readerId;
	}

	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name = name;
	}

	public String getIdentityCard()
	{
		return identityCard;
	}

	public void setIdentityCard(String identityCard)
	{
		this.identityCard = identityCard;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}

	public String getCardIssueDate()
	{
		return cardIssueDate;
	}

	public void setCardIssueDate(String cardIssueDate) 
	{
		this.cardIssueDate = cardIssueDate;
	}
	

	public String getJob() 
	{
		return job;
	}
	

	public void setJob(String job) 
	{
		this.job = job;
	}

    void setReaderId(JTextField readerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
	
	
	
	
	
}

