package com.emertxe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="weekann")  
@PrimaryKeyJoinColumn(name="ID")  
public class Weekend_Student_Ann  extends StudentAnn
{
	@Column(name="no_of_days")
	private int no_of_days;
	@Column(name="fee_per_day")
	private	int fee_per_day;
	public int getNo_of_days()
	{
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) 
	{
		this.no_of_days = no_of_days;
	}
	public int getFee_per_day()
	{
		return fee_per_day;
	}
	public void setFee_per_day(int fee_per_day)
	{
		this.fee_per_day = fee_per_day;
	}
	
}
