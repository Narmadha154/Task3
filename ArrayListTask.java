
package task4;
import java.util.*;
public class ArrayListTask{
    public static int findLength(){
      List<String> list=new ArrayList<>();
      int length=list.size();
      return length;
    }
    public static List<Object> createList(List<Integer> list,List<String> stringList,List<Student> customArrList){
       List<Object> arrList=new ArrayList<>();
       arrList.addAll(list);
       arrList.addAll(stringList);
       arrList.addAll(customArrList);
      return arrList;
    }
     public static List<String> findIndex(List<String> list,String str){
      int length=list.size();
      int index=list.indexOf(str);
      System.out.println("Index of the element is:"+index);
      System.out.println("Length of the ArrayList :"+length);
      return list;
    }
   public static List<String> findStringAtIndex(List<String> list,int index){
    //if(list!=null){
      String str=list.get(index);
      System.out.println("String at the given index is:"+str);
     //}
    /* else{
       list=null;
     }*/
     /*catch(NullPointerException e){
      System.out.println("Null pointer exception thrown");
     }*/
      return list;
    }
   public static int findIndexOfDuplicate(List<String> list){
      String str=null;
      for(int i=0;i<list.size();i++){
         for(int j=i+1;j<list.size();j++){
            if(list.get(i).equals(list.get(j))){
               str=list.get(j);
            }
         }
      }
      int firstIndex=list.indexOf(str);
      System.out.println("First index of the duplicate element is:"+firstIndex);
      int lastIndex=list.lastIndexOf(str);
      return lastIndex;
    }
   public static List<String> addString(List<String> list,String str,int position){
      list.add(position,str);
      return list;
    }
     public static List<String> createArrayList(List<String> list,int startIndex,int endIndex){
      List<String> secondList=new ArrayList<>();
     /* for(int i=startIndex;i<endIndex;i++){
           secondList.add(list.get(i));
      }*/
      int size=list.size();
      if(size>=endIndex){
          secondList=list.subList(startIndex,endIndex);
      }
      else{
         System.out.println("length of the index is not enough");
      }
      return secondList;
    }
   public static List<String> createThreeArrayList(List<String> firstList,List<String> secondList){
      List<String> thirdList=new ArrayList<String>();
      thirdList.addAll(firstList);
      thirdList.addAll(secondList);
      return thirdList;
    }
   public static List<Double> removeDecimalValue(List<Double> decimalList,double decimalValue){
      if(decimalList.contains(decimalValue)==true){
         decimalList.remove(decimalValue);
      }
       else{
         System.out.println("given value is not in the list");
      }
      return decimalList;
    }   
   public static List<Double> removeDecimalValueAtIndex(List<Double> decimalList,int position){
   int size=decimalList.size();
      if(size>=position){ 
          decimalList.remove(position);
      }
       else{
         System.out.println("given index is greater than the list length");
      }
      return decimalList;
    } 
    public static List<Long> removeLongValue(List<Long> longList,int startIndex,int endIndex){
    int size=longList.size();
      if(size>=endIndex){ 
         longList.subList(startIndex,endIndex).clear();
       }
       else{
         System.out.println("length of the list is not enough");
      }
      return longList;
    }
   public static List<String> removeElements(List<String> firstList,List<String> secondList){
      firstList.removeAll(secondList);
      return firstList;
    }
   public static List<String> removeNonDuplicateElements(List<String> firstList,List<String> secondList){
      firstList.retainAll(secondList);
      return firstList;
    }
  public static List<Long> removeAllLongValue(List<Long> longList){
      longList.removeAll(longList);
      return longList;
    }
  public static List<String> checkString(List<String> list,String str){
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
       else{
           System.out.println("Given string is not present in the ArrayList");
       }
      return list;
    } 
}
    class Student{
       int rollNo;
       String name;
       int marks;
       Student(int rollNo,String name,int marks){
          this.rollNo=rollNo;
          this.name=name;
          this.marks=marks;
      }
      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }

