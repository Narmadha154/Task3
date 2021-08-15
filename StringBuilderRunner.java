
import java.util.Scanner;
public class StringBuilderRunner{
  public static StringBuilder getString(){
    StringBuilder sb=new StringBuilder();
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    sb.append(sc.next());
    System.out.println("The string is:"+sb);
    return sb;
  }
  public static String[] getMultipleString(){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no.of strings:");
              int size=sc.nextInt();
              System.out.println("Enter the strings:");
              String [] stringArray=new String[size];
              for(int i=0;i<size;i++){
                   stringArray[i]=sc.next();
              }
              return stringArray;
  }
  public static StringBuilder createStringBuilder(String [] array){
             StringBuilder initialString=new StringBuilder();
             for(int i=0;i<array.length;i++){
                      if(i!=array.length-1){
                      initialString.append(array[i]);
                      initialString.append(" "); 
                      }
                      else{
                      initialString.append(array[i]);
                      }
             }
             System.out.println("Initial string is:"+initialString);
             return initialString;
}
       
public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
  switch(number){
    case 1:
        int length=StringBuilderTask.findLength();
        System.out.println("Length of the string builder with no string is:"+length);
        StringBuilder sb=getString();
        int stringBuilderLength=StringBuilderTask.finalLength(sb);
        System.out.println("Length of the string builder with string is:"+stringBuilderLength);
        break;
    case 2:
        StringBuilder string=getString();
        String [] array=getMultipleString();
        int finalStringLength=StringBuilderTask.finalString(string,array);
        System.out.println("Final string length is:"+finalStringLength);
        break;
   
    case 3:
         String [] stringArr=getMultipleString();
         StringBuilder stringbuild1=createStringBuilder(stringArr);
         int finalLength=StringBuilderTask.finalMultipleString(stringbuild1,stringArr);
         System.out.println("Final string length is:"+finalLength);
         break;
    case 4:
         String [] stringArr1=getMultipleString();
         StringBuilder stringbuild2=createStringBuilder(stringArr1);
         int stringLength=StringBuilderTask.deleteFirstString(stringbuild2,stringArr1);
         System.out.println("Final string length is:"+stringLength);
         break;
    
    case 5:
         String [] arr=getMultipleString();
         StringBuilder string1=createStringBuilder(arr);
         int stringLen=StringBuilderTask.replaceString(string1,arr);
         System.out.println("Final string length is:"+stringLen);
         break;
    case 6:
         String [] arr1=getMultipleString();
         StringBuilder string2=createStringBuilder(arr1);
         int strLength=StringBuilderTask.reverseString(string2);
         System.out.println("Final string length is:"+strLength);
         break;
     case 7:
          StringBuilder stringbuilder=getString();
          int strLen=StringBuilderTask.deleteCharacters(stringbuilder);
          System.out.println("Final string length is:"+strLen);
          break;
      case 8:
          StringBuilder stringbuilder1=getString();
          int strLen1=StringBuilderTask.replaceCharacters(stringbuilder1);
          System.out.println("Final string length is:"+strLen1);
          break;
     case 9:
         String [] arr2=getMultipleString();
         StringBuilder string3=createStringBuilder(arr2);
         int index=StringBuilderTask.findIndex(string3,arr2);
         System.out.println("First index of # is:"+index);
         break;
    case 10:
         String [] arr3=getMultipleString();
         StringBuilder string4=createStringBuilder(arr3);
         int lastIndex=StringBuilderTask.findLastIndex(string4,arr3);
         System.out.println("Last index of # is:"+lastIndex);
         break;
    default:
        System.out.println("No program");
        break;
  }
}
}