
package task4;
import java.util.*;
public class ArrayListTaskRunner{
   static Scanner sc=new Scanner(System.in);
   public static List<String> createStringArrayList(){
   // Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Strings:");
    int num=sc.nextInt();
    List<String> stringList=new ArrayList<String>(num);
    System.out.println("Enter the strings:");
    for(int i=0;i<num;i++)
    {
    stringList.add(sc.next());

   }
    return stringList;
  }
   public static List<Integer> createIntegerArrayList(){
    //Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Integers:");
    int num=sc.nextInt();
    List<Integer> integerList=new ArrayList<Integer>(num);
    System.out.println("Enter the integers:");
    for(int i=0;i<num;i++)
    {
    integerList.add(sc.nextInt());

   }
    return integerList;
  }
  public static List<Double> createDecimalArrayList(){
   // Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of decimals:");
    int num=sc.nextInt();
    List<Double> doubleList=new ArrayList<Double>(num);
    System.out.println("Enter the decimals:");
    for(int i=0;i<num;i++)
    {
    doubleList.add(sc.nextDouble());

   }
    return doubleList;
  }
  public static List<Long> createLongArrayList(){
   // Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of long values:");
    int num=sc.nextInt();
    List<Long> longList=new ArrayList<Long>(num);
    System.out.println("Enter the long values:");
    for(int i=0;i<num;i++)
    {
    longList.add(sc.nextLong());

   }
    return longList;
  }
  public static List<Student> createCustomList(){
     //Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
      List<Student> customList=new ArrayList<>();
      for(int i=0;i<size;i++){
         customList.add(new Student(rollNo[i],name[i],marks[i]));
      }
      return customList;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
   try( Scanner sc=new Scanner(System.in)){
    int number=sc.nextInt();
    switch(number){
    case 1:
       int length=ArrayListTask.findLength();
       System.out.println("Length of the ArrayList is:"+length);
       break;
   case 2:
       List<String> list=createStringArrayList();
       System.out.println("ArrayList elements are:");
       for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
       }
       int arrayLength=list.size();
       System.out.println("Length of the ArrayList with elements:"+arrayLength);
       break;
  case 3:
       List<Integer> intList=createIntegerArrayList();
        System.out.println("ArrayList elements are:");
        for(int i=0;i<intList.size();i++){
          System.out.println(intList.get(i));
       }
       int intListLength=intList.size();
       System.out.println("Length of the Integer ArrayList:"+intListLength);
       break;
  case 4:
       List<Student> customArrayList=createCustomList();
       System.out.println("Custom ArrayList elements:");
       for(int i=0;i<customArrayList.size();i++){
           System.out.println(customArrayList.get(i)+" ");
      }
       int customListLength=customArrayList.size();
       System.out.println("Custom ArrayList size:"+customListLength);
       break;
  case 5:
        List<String> listArray=createStringArrayList();
        List<Integer> listInteger=createIntegerArrayList();
       List<Student> customArrList=createCustomList();
       List<Object> objList=ArrayListTask.createList(listInteger,listArray,customArrList);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<objList.size();i++){
         System.out.println(objList.get(i)+" ");
      }
       int objLength=objList.size();
       System.out.println("ArrayList size:"+objLength);
       break;
  case 6:
       List<String> list3=createStringArrayList();
       System.out.println("Enter the string for which you want to find index:");
       String str=sc.next();
       List<String> strList=ArrayListTask.findIndex(list3,str);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<strList.size();i++){
         System.out.println(strList.get(i));
       }
       break;
  case 7:
       List<String> stringArrList=createStringArrayList();
       Iterator<String> iter=stringArrList.iterator();
       System.out.println("ArrayList elements using iterator:");
       while(iter.hasNext()){
          System.out.println(iter.next()+" ");
       }
       System.out.println("ArrayList elements using for loop:");
       for(int i=0;i<stringArrList.size();i++){
         System.out.println(stringArrList.get(i)+" ");
       }
       break;
  case 8:
       List<String> list5=createStringArrayList();
       System.out.println(list5);
     //  if(list5.isEmpty()==false){
        System.out.println("Enter the index:");
        int index=sc.nextInt();
        List<String> newList=ArrayListTask.findStringAtIndex(list5,index);
        int newLength=newList.size();
        System.out.println("Length of the string :"+newLength);
     /*  }
       else{
         System.out.println("Null pointer exception thrown");
     }*/
       break;
  case 9:
       List<String> list6=createStringArrayList();
       int lastIndex=ArrayListTask.findIndexOfDuplicate(list6);
       System.out.println("Last index of the duplicate element is:"+lastIndex);
       break;
  case 10:
       List<String> list7=createStringArrayList();
       System.out.println("Enter the string to be entered:");
       String strSecond=sc.next();
       System.out.println("Enter the position where string to be entered:");
       int position=sc.nextInt();
       List<String> addedList=ArrayListTask.addString(list7,strSecond,position);
       System.out.println("ArrayList elements after adding a string:");
       for(String arr:addedList){
         System.out.println(arr);
       }
      int addedListLength=addedList.size();
      System.out.println("Size of the ArrayList after adding a string:"+addedListLength);
       break;
  case 11:
       List<String> list8=createStringArrayList();
       System.out.println("Enter the index where second arraylist starts:");
       int startIndex=sc.nextInt();
       System.out.println("Enter the index where second arraylist ends:");
       int endIndex=sc.nextInt();
       List<String> secondList=ArrayListTask.createArrayList(list8,startIndex,endIndex);
       System.out.println("Second ArrayList elements:");
      /* for(String secondArray:secondList){
         System.out.println(secondArray);
       }*/
       System.out.println(secondList);
       int secondLength=secondList.size();
       System.out.println("Second ArrayList size:"+secondLength);
       break;
 case 12:
       List<String> list9=createStringArrayList();
       List<String> secondList2=createStringArrayList();
       List<String> thirdList=ArrayListTask.createThreeArrayList(list9,secondList2);
       System.out.println("Third ArrayList elements:");
      for(int i=0;i<thirdList.size();i++){
         System.out.println(thirdList.get(i)+" ");
      }
      int thirdArrLength=thirdList.size();
       System.out.println("third ArrayList size:"+thirdArrLength);
       break;
  case 13:
       List<String> list10=createStringArrayList();
       List<String> secondArrList=createStringArrayList();
       List<String> thirdArrList=ArrayListTask.createThreeArrayList(list10,secondArrList);
       System.out.println("Third ArrayList elements:");
       for(int i=0;i<thirdArrList.size();i++){
         System.out.println(thirdArrList.get(i)+" ");
      }
       int thirdLength=thirdArrList.size();
       System.out.println("third ArrayList size:"+thirdLength);
       break;
 case 14:
       List<Double> doubleList=createDecimalArrayList();
       System.out.println("enter the value to be removed:");
       double decimalValue=sc.nextDouble();
       List<Double> decimalList=ArrayListTask.removeDecimalValue(doubleList,decimalValue);
       int decimalListLength=decimalList.size();
       System.out.println("Arraylist after removing an element:");
       for(Double arr:decimalList){
         System.out.println(arr);
       }
       System.out.println("ArrayList size after removing an element:"+decimalListLength);
       break;
 case 15:
       List<Double> doubleList1=createDecimalArrayList();
       System.out.println("Enter the index where the value to be removed:");
       int removePosition=sc.nextInt();
       List<Double> deciList=ArrayListTask.removeDecimalValueAtIndex(doubleList1,removePosition);
       int deciLength=deciList.size();
       System.out.println("Arraylist after removing an element at given position:");
       for(Double deciArray:deciList){
         System.out.println(deciArray);
       }
       System.out.println("ArrayList size after removing an element:"+deciLength);
       break;
 case 16:
       List<Long> longList1=createLongArrayList();
       System.out.println("Enter the start index:");
       int stIndex=sc.nextInt();
       System.out.println("Enter the end index:");
       int edIndex=sc.nextInt();
       List<Long> longArrayList=ArrayListTask.removeLongValue(longList1,stIndex,edIndex);
       int removedListLength=longArrayList.size();
        System.out.println("Arraylist after removing the elements:"+longArrayList);
      /*  for(Long arrayLong:longArrayList){
           System.out.println(arrayLong);
        }*/
        System.out.println("ArrayList size:"+removedListLength);
       break;
 case 17:
       List<String> list11=createStringArrayList();
       List<String> secList=createStringArrayList();
       List<String> firstList=ArrayListTask.removeElements(list11,secList);
       System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:");
       for(int i=0;i<firstList.size();i++){
         System.out.println(firstList.get(i)+" ");
       }
       int firstLength=firstList.size();
       System.out.println("First ArrayList size after removing elements which are present in 2nd arraylist:"+firstLength);
       break;
 case 18:
       List<String> list12=createStringArrayList();
       List<String> secondList1=createStringArrayList();
       List<String> firstArrList=ArrayListTask.removeNonDuplicateElements(list12,secondList1);
       System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:");
       for(int i=0;i<firstArrList.size();i++){
         System.out.println(firstArrList.get(i)+" ");
       }
       int firstListLength=firstArrList.size();
       System.out.println("ArrayList size after removing elements which are not present in 2nd arraylist:"+firstListLength);
       break;
  case 19:
       List<Long> longList=createLongArrayList();
       List<Long> longArrList=ArrayListTask.removeAllLongValue(longList);
       int longListSize=longArrList.size();
       System.out.println("Arraylist after removing the elements:");
       for(Long longArr:longList){
          System.out.println(longArr);
       }
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       List<String> list13=createStringArrayList();
       System.out.println("Enter the string to be checked:");
       String checkStr=sc.next();
       List<String> checkList=ArrayListTask.checkString(list13,checkStr);
       int checkListLength=checkList.size();
       System.out.println("ArrayList elements are:");
       for(String checkArr:checkList){
          System.out.println(checkArr);
       }
       System.out.println("ArrayList size:"+checkListLength);
       break;
   default:
       System.out.println("No program");
       break;
   }
  }
  catch(Exception e){
     System.out.println("Exception coming");
  }
 }
}
