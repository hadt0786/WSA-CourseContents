package com.emertxe;
import javax.persistence.*;  

@Entity  
@Table(name="regann")  
@PrimaryKeyJoinColumn(name="ID")  
public class Regular_Student_Ann extends StudentAnn
{
	@Column(name="fee")
	private int fee;
	
	@Column(name="discount")
	int discount;

	public int getFee()
	{
		return fee;
	}

	public void setFee(int fee)
	{
		this.fee = fee;
	}

	public int getDiscount()
	{
		return discount;
	}

	public void setDiscount(int discount)
	{
		this.discount = discount;
	}
}
