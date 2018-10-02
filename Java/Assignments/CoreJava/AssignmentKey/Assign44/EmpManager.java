/*Define a class Employee having private members – id, name, department, salary. Define  default and parameterized constructors. Create a subclass called “Manager” with private  member bonus. Define methods accept and display in both the classes. Create n objects of  the Manager class and display the details of the manager having the maximum total  salary (salary+bonus) 
*/
import java.io.*;
class employee
{
        private int id;
        private String name,department;
        private float salary;

        public employee()
        {
                id=0;
                department="";
                name="";
                salary=0;
        }

        public employee(int i,String dept,String nm,float sal)
        {
                id=i;
                department=dept;
                name=nm;
                salary=sal;
        }

        public void accept()throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter ID = ");
                id=Integer.parseInt(br.readLine());
                System.out.println("Enter Name = ");
                name=(br.readLine());
                System.out.println("Enter Department = ");
                department=(br.readLine());
                System.out.println("Enter Salary = ");
                salary=Float.parseFloat(br.readLine());
        }

        public void display()
        {
                System.out.println("Id = "+id);
                System.out.println("Name = "+name);
                System.out.println("Department = "+department);
                System.out.println("Salary = "+salary);
        }

        public float salary()
        {
                return salary;
        }

}

class manager extends employee
{
         private float bonus;

        public manager()
        {
                bonus=0;
        }

        public manager(float b)
        {
                bonus=b;
        }

        public void accept()throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                super.accept();
                System.out.println("Enter Bonus = ");
                bonus=Float.parseFloat(br.readLine());
        }

        public void display()
        {
                super.display();
                System.out.println("Bonus = "+bonus);
        }


        float computesal()
        {
                return(super.salary()+bonus);
        }

}

class EmpManager
{
        public static void main(String[] arg)throws IOException
        {
                int i,n;
                float max;

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number of objects = ");
                n=Integer.parseInt(br.readLine());


                manager m[] = new manager[n];
                float tot[] = new float[n];

                for(i=0;i<n;i++)
                {
                        m[i] = new manager();
                        m[i].accept();
                }

                System.out.println("\nRecords Are\n");

                for(i=0;i<n;i++)
                {
                        m[i].display();
                        tot[i]=m[i].computesal();
                }

                max=tot[0];

                for(i=1;i<n;i++)
                {
                        if(tot[i]>max)
                                max=tot[i];
                }

                System.out.println("\n\nManger with Maximum Total Salary is \n");

                for(i=0;i<n;i++)
                {
                        if(tot[i] == max)
                        {
                                m[i].display();
                                System.out.println("Maximum salary is = "+max);
                        }
                }
        }
}
