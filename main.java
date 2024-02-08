package pro1;
import java.util.Scanner;
public class MobileApplication1 {
private MobileDescription mobile[];
private int size;
private int count;
public MobileApplication1()
{
mobile=new MobileDescription[1];
size=1;
count=0;
}
private MobileDescription[] addDetails()
{
System.out.println("Enter Mobile "+(count+1)+" details :");
System.out.println("Enter the Mobile id");
long id=in.nextLong();
long model=0;
if(count==0)
{
System.out.println("Enter the Mobile model no");
model=in.nextLong();
}
else
{
model=checkUniqueModelNo(mobile);
}
System.out.println("Enter the price of the mobile");
int price=in.nextInt();
System.out.println("Enter the date of manufacture");
in.nextLine();
String date=in.nextLine();
mobile[count++]=new MobileDescription(id,model,price,date);
return mobile;
}
private void increaseSize()
{
System.out.println("increase");
MobileDescription[] temp=null;
if(size==count)
{
temp=new MobileDescription[size*2];
for(int i=0;i<size;i++)
{
temp[i]=mobile[i];
}
}
mobile=temp;
size=size*2;
}
private long checkUniqueModelNo(MobileDescription[] mobile) {
// TODO Auto-generated method stub
System.out.println("Enter the model no----method");
int model=in.nextInt();
boolean flag=false;
for(int i=0;i<mobile.length;i++)
{
if(mobile[i]!=null)
{
if(mobile[i].getModel()==model)
{
flag=true;
}
}
}long result=0;
if(flag==false)
{
result= model;
}
else
{
System.out.println("Model no is not unique \n please re_enter");
result=checkUniqueModelNo(mobile);
}
return result;
}
private void display() {
for(int i=0;i<count && i<size;i++)
{
System.out.println(mobile[i].getId() +" "+mobile[i].getModel()+" "
+ " "+mobile[i].getPrice()+" "+mobile[i].getDate());
}
}
private void shrinkSize() {
// TODO Auto-generated method stub
MobileDescription temp[]=null;
if(count>0)
{
temp=new MobileDescription[count];
for(int i=0;i<count;i++)
{
temp[i]=mobile[i];
}
size=count;
mobile=temp;
}
}
private void sort()
{
for(int i=0;i<count-1;i++)
{
for(int j=i+1;j<count;j++)
{
if(mobile[j].getModel() < mobile[i].getModel()) {
MobileDescription temp=mobile[i];
mobile[i]=mobile[j];
mobile[j]=temp;
}
}
}
}
private MobileDescription[] update(long id)
{
for(int i=0;i<count;i++)
{
if(mobile[i].getId()==id)
{
System.out.println("Enter the price thats needs to be updated");
mobile[i].setPrice(in.nextInt());
break;
}
}
return mobile;
}
private MobileDescription[] delete(long id)
{
//int index=0;
for(int i=0;i<count;i++)
{
if(id==mobile[i].getId())
{
id=i;
//System.out.println("----------------------------------------"+i);
}
}
System.out.println("deleting");
if(count>0)
{
for (int i = (int)id; i < count - 1; i++) { 
                  mobile[i] = mobile[i + 1]; 
                        } 
mobile[count-1]=new MobileDescription();
count--;
//System.out.println(index);
}
return mobile;
}
private void displayMenu()
{
System.out.println("Press 1 to Add the mobile details  \n "
+ "Press 2 sort the mobiles using model no     \n "
+ "Press 3 update the price for the mobiles id \n "
+ "press 4 delete the mobiles based on id      \n "
+ "press 5 exit");
}
static Scanner in=new Scanner(System.in);
public static void main(String[] args) {
// TODO Auto-generated method stub
MobileApplication1 object=new  MobileApplication1();
//sMobileDescription[] des=null;
do{
int i=0;
if(i==0) {
object.displayMenu();
}
int choice=in.nextInt();
switch(choice)
{
case 1:
if(object.size==object.count)
{
object.increaseSize();
}
System.out.println("count----------->"+object.count +"size---------------->"+object.size);
object.addDetails();
System.out.println("+++++++++++++++++++++++++++"+object.count);
object.display();
break;
case 2:
object.sort();
object.display();
break;
case 3:
System.out.println("enter the mobile id to be updated");
object.update(in.nextLong());
object.display();
break;
case 4:
System.out.println("enter the id to be deleted");
object.delete(in.nextLong());
object.display();
break;
case 5:
System.exit(0);
break;
default:
System.out.println("invalid choices select from this options Only \n"); object.displayMenu();
break;
}
i++;
System.out.println("------------------------------------------");
object.displayMenu();
//System.out.println("Press ______________________0 to exit");
}while(in.hasNextInt());
System.out.println(object.size+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+object.count);
object.shrinkSize();
System.out.println(object.size+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+object.count);
}
}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
