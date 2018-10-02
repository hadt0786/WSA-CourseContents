/*
 * . Write a program to design a class to represent a bank account. Include the following members. 
Date members 
 Name of depositor 
 Account Number 
 Type of account 
Balance account in the account 
Methods:- 
 To assign initial values 
 To deposit an account 
 To withdraw an account after checking balance. 
 To display the name and balance 

 */
 import java.io.*;

 class BankDetails
 {
          final int max=20;
          final  int min=1;
          final double min_bal=500;
          private  String name[]=new String[20];
          private int accNo[]=new int[20];
          private  String accType[]=new String[20];
          private double amtbal[]=new double[20];
          static int totRec=0;
        //constructor
         BankDetails()
        {
             for(int i=0;i<max;i++)
             {
                name[i]="";
                accNo[i]=0;
                accType[i]="";
                amtbal[i]=0.0;
            }
        }

               
        //TO  create NEW RECORD
        public void createNewReecord()
        {
               String str;
               int acno;
               double amt;
               boolean flag;
                flag=true;

               if (totRec>max)
               {
                    System.out.println("******Sorry. Account cannot be created.******");
                    flag=false;
               }

               if(flag = true)   //Allows to create new record
               {
               	totRec++;         // total records get incremented             
               	System.out.println("\n\n\n*****Creating new Record*****");
              	 try
		{
                        accNo[totRec]=totRec;    //Account number is autoincrement
                        System.out.println("Account Number :  "+accNo[totRec]);
                        
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     System.out.print("Enter your Name :  ");
                     System.out.flush();
                     name[totRec]=br.readLine();

                     System.out.print("Enter Account Type : ");
                     System.out.flush();
                     accType[totRec]=br.readLine();

                    do{
                           System.out.print("Enter minimum 500 amount to be deposited : ");
                           System.out.flush();
                           str=br.readLine();
                           amtbal[totRec]=Double.parseDouble(str);
                     }while(amtbal[totRec]<min_bal);      //checks for minimum balance 500

                 	 System.out.println("\n\n\n");
                }
                 catch(Exception e)
                 {}
               }
        }

        
        
        //TO DISPLAY DETAILS OF RECORD
        public void show()
        {
              String str;
              int acno=0;
              boolean valid=true;
                           
              System.out.println("\n\n******CUSTOMER DETAILS*******\n");
              try
	       {
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter Account number : ");
                 System.out.flush();
                 str=br.readLine();
                 acno=Integer.parseInt(str);
                  if (acno<min || acno>totRec)   //Checking account number
                     {
                          System.out.println("\n\n\nAccount number is not matching\n\n");
                          valid=false;
                     }

                    if (valid==true)
                      {     
                        System.out.println("\n\nAccount Number : "+accNo[acno]);
                        System.out.println("Name : "+name[acno]);
                        System.out.println("Account Type : "+accType[acno]);
                        System.out.println("Balance Amount : "+amtbal[acno]+"\n\n\n");
                      }
               }
            catch(Exception e)
            {}
        }



          //DPOSITING AMOUNT
        public void deposit()
        {
              String str;
              double amt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n******DEPOSIT AMOUNT*****");
              
              try
	       {
                   //Reading deposit value
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);
                         if (acno<min|| acno>totRec)   //Checking account number
                         {
                             System.out.println("\n\n\nAccount number is not matching\n\n");
                              valid=false;
                         }
           
                        if (valid==true)
                       {
                            System.out.print("Enter the amount to Deposit  : ");
                            System.out.flush();
                            str=obj.readLine();
                            amt=Double.parseDouble(str);

                            amtbal[acno]=amtbal[acno]+amt;

                            //Details after depositing amount
                            System.out.println("\nAfter Updation...");
                            System.out.println("Account Number :  "+acno);
                            System.out.println("Balance Amount :  "+amtbal[acno]+"\n\n\n");
                        }
               }
            catch(Exception e)
            {}
       }



     //AMOUNT WITHDRAW
        public void withdraw()
        {
              String str;
              double amt,checkamt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n******WITHDRAW AMOUNT******");
              
              try
	       {
                  
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   
                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);

                          if (acno<min || acno>totRec)   //Checking account number
                             {
                                System.out.println("\n\n\nInvalid Account Number \n\n");
                                valid=false;
                             }

                        if (valid==true)
                        {
                                System.out.println("Balance is : "+amtbal[acno]);
                                System.out.print("Enter Amount to withdraw  : ");
                                System.out.flush();
                                str=obj.readLine();
                                amt=Double.parseDouble(str);

                                checkamt=amtbal[acno]-amt;

                                if(checkamt >= min_bal)
                                 {
                                    amtbal[acno]=checkamt;
                                    //Details after withdraw of amount
                                    System.out.println("\nAfter Updation...");
                                    System.out.println("Account Number :  "+acno);
                                    System.out.println("Balance Amount :  "+amtbal[acno]+"\n\n\n");
                                }
                                else
                                 {
                                    System.out.println("\n\nMinimum balance to be maintained in bank account is 500\n\n\n");
                                 }
                        }
               }
            catch(Exception e)
            {}
       }

};

class  Bank
{
    public static void main(String args[]) 
    {
        String str;
        int ch;
        ch = 0;

        BankDetails Bd = new BankDetails();
        

        do
        {
        	System.out.println("1. Create New Record ");
       		System.out.println("2. Display Record Details ");
        	System.out.println("3. Deposit...");
       		System.out.println("4. Withdraw...");
        	System.out.println("5. Exit");
        	System.out.print("Enter your choice :  ");
        	//System.out.flush();
              try
		{
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   str = obj.readLine();
                   ch = Integer.parseInt(str);

                          switch(ch)
                           {
                            case 1 :  //New Record Entry
                                            Bd.createNewReecord();
                                           break;
                            case 2 :  //Displaying Record Details
                                           Bd.show();
                                           break;
                            case 3 : //Deposit...
                                            Bd.deposit();
                                           break;
                            case 4 : //Withdraw...
                                            Bd.withdraw();
                                            break;
                            case 5  :  System.out.println("...Please visit again.... ");
                                            break;
                            default : System.out.println("please select from 1 to 5 only");
                         }
                }
                catch(Exception e)
                {}
        }while (ch!= 5);
    }
}
