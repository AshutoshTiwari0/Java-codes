class stud
{
    int rollno;
    int marks;
    String name;
}

public class aob {
    public static void main(String[] args) {

       /*  student obj1= new student();
       obj1.rollno=1;
        obj1.marks=80;
        obj1.name="Ashutosh";


        student obj2= new student();
        obj2.rollno=2;
        obj2.marks=82;
        obj2.name="Tiwari";


        student obj3= new student();
        obj3.rollno=3;
        obj3.marks=55;
        obj3.name="Kumar";

        student studentarray[]= new student[3];
        studentarray[0]=obj1;
        studentarray[1]=obj2;
       studentarray[2]=obj3;

      //  for(int i=0;i<studentarray.length;i++)
      //  {
       // System.out.println(studentarray[i].name+ ":" +studentarray[i].marks);
       //} 

       for(student stud: studentarray)
       {
        System.out.println(stud.name+" ");
       }*/


       // int nums[]= new int[4];
        //nums[0]=4;
        //nums[1]=5;
        //nums[2]=7;
        //nums[3]=6;
       // for(int i=0;i<nums.length;i++)
       // {
     // System.out.println(nums[i]);
      //  }

      //for(int n: nums)
      //{
       // System.out.println(n);
      //}

      
        stud obj=new stud();
        obj.marks=87;
        obj.name="Ashutosh";
        obj.rollno=071;

        // 2nd object 
        stud obj2=new stud();
        obj2.marks=97;
        obj2.name="Tiwari";
        obj2.rollno=0521;

        // 3rd object
         stud obj3=new stud();
        obj3.marks=57;
        obj3.name="kumar";
        obj3.rollno=021;

        // array of objects
        stud array[]=new stud[3];
        array[0]=obj;
        array[1]=obj2;
        array[2]=obj3;
        for(int i=0;i<array.length;i++)
        {
          System.out.println(array[i].marks+" "+array[i].name);
        }




    }
}
