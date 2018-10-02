package com.emertxe;

public class Emp 
{
	/** Dependency on Employee class. */
	
	    private Employee e;
	
	
	    /** a constructor so that the Spring container can 'inject' a Employee*/
	
	    public Emp(Employee e){
	
	       this.e = e;
	
	    }
	
	    public String toString()
	    {
	
	        return " welcome! employee : \n " + e;
	
	    }
	
	}


