import java.util.Scanner;
public class StringBuilderTask{
     public static int findLength(){
           StringBuilder sb=new StringBuilder();
           int length=sb.length();
           return length;
     }
     public static int finalLength(StringBuilder string){
           int length=string.length();
           return length; 
  }
     public static int finalString(StringBuilder string,String [] array){
            int initialLength=finalLength(string);
            System.out.println("Initial length of the string is:"+initialLength);
              for(int i=0;i<array.length;i++){
                      string.appendCodePoint(35);
                      string.append(array[i]);
             }
             System.out.println("Final string is:"+string);
             int finalStringLength=finalLength(string);
             return finalStringLength;
  }
       public static int finalMultipleString(StringBuilder string,String [] array){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the third string:");
              String str3=sc.next();
              string.insert(array[0].length(),str3);
              StringBuilder finalString=string.insert(array[0].length()," ");
              int finalLength=finalLength(finalString);
              System.out.println("Final string is:"+finalString);
              return finalLength;
      }  
      public static int deleteFirstString(StringBuilder string,String [] array){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=string.delete(0,array[0].length());
              System.out.println("Final string is:"+finalString);
              int finalLength=finalLength(finalString);
              return finalLength;
     }
     public static int replaceString(StringBuilder string,String [] array){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,"-");
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,"-");
              System.out.println("Final string is:"+finalString);
              int finalLength=finalLength(finalString);
              return finalLength;
    } 
    public static int reverseString(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=string.reverse();
              System.out.println("Final string is:"+finalString);
              int finalLength=finalLength(finalString);
              return finalLength;
    } 
    public static int deleteCharacters(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=string.delete(6,9);
              System.out.println("Final string is:"+finalString);
              int finalLength=finalLength(finalString);
              return finalLength;
   }
   public static int replaceCharacters(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=string.replace(6,9,"XYZ");
              System.out.println("Final string is:"+finalString);
              int finalLength=finalLength(finalString);
              return finalLength;
   }
   public static int findIndex(StringBuilder string,String [] array){
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,"#");
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,"#");
              System.out.println("Final string is:"+finalString);
              int length=finalLength(finalString);
              System.out.println("length of the string is:"+length);
              int firstIndex=finalString.indexOf("#");
              return firstIndex;
  }
  public static int findLastIndex(StringBuilder string,String [] array){
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,"#");
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,"#");
              System.out.println("Final string is:"+finalString);
              int length=finalLength(finalString);
              System.out.println("length of the string is:"+length);
              int lastIndex=finalString.indexOf("#",array[1].length());
              return lastIndex;
  }
}         
