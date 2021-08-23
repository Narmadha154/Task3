
package hashmap;
import java.util.Scanner;
import java.util.*;
public class HashMapTask{
   Scanner sc=new Scanner(System.in);
   Map<String,String> stringMap=new HashMap<>();
   Map<Integer,Integer> integerMap=new HashMap<>();
   Map<String,Integer> stringIntegerMap=new HashMap<>();
   public  Map<String,String> createStringHashMap(){
     System.out.println("Enter the no.of key value pairs for string,string Hashmap:");
     int num=sc.nextInt();
     for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String key=sc.next();
        System.out.println("Enter the value:");
        String value=sc.next();
        stringMap.put(key,value);
     }
     return stringMap;
    }
     public Map<Integer,Integer> createIntegerHashMap(){
      System.out.println("Enter the no.of key value pairs for int,int hashmap:");
      int num=sc.nextInt();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        int intKey=sc.nextInt();
        System.out.println("Enter the value:");
        int intValue=sc.nextInt();
        integerMap.put(intKey,intValue);
     }
     return integerMap;
    }
     public Map<String,Integer> createStringIntegerHashMap(){
      System.out.println("Enter the no.of key value pairs for string,int hashmap:");
      int num=sc.nextInt();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String strKey=sc.next();
        System.out.println("Enter the value:");
        int integerValue=sc.nextInt();
        stringIntegerMap.put(strKey,integerValue);
     }
     return stringIntegerMap;
    }
   public static int findSize(){
       Map map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
   public Map<String,String> findStringMapSize(){
       Map<String,String> map=createStringHashMap();
       return map;
   }
    public Map<Integer,Integer> findIntegerMapSize(){
       Map<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
      public Map<String,Integer> findStringIntegerMapSize(){
       Map<String,Integer> map=createStringIntegerHashMap();
       return map;
   }
     public Map<String,Student> createCustomMap(){
      Scanner sc=new Scanner(System.in);
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
      System.out.println("Enter the number of key value pair:");
       int keyValue=sc.nextInt();
       Map<String,Student> customMap=new HashMap<>();
       for(int i=0;i<keyValue;i++){
          System.out.println("Enter the key:");
          String key=sc.next();
          customMap.put(key,new Student(rollNo[i],name[i],marks[i]));
       }
      return customMap;
    }
   public Map<String,String> addNullValue(){
       Map<String,String> map=createStringHashMap();
       return map;
    }
   public Map<Integer,Integer> addNull(){
       Map<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
   public boolean checkKey(){
     Map<String,String> map=createStringHashMap();
     System.out.println("Enter the key to be checked:");
     String key=sc.next();
     boolean value= map.containsKey(key);
     return value;
   }
   public boolean checkValue(){
     Map<String,String> map=createStringHashMap();
     System.out.println("Enter the value to be checked:");
     String strValue=sc.next();
     boolean checkValue= map.containsValue(strValue);
     return checkValue;
   }
   public Map<String,String> changeValues(){
      Map<String,String> map=createStringHashMap();
      map.replaceAll((key, oldValue)
                            -> oldValue + oldValue);
      return map;                      
   }
   public int getValue(){
     Map<String,Integer> map=createStringIntegerHashMap();
     System.out.println("Enter the key for which you want the value:");
     String key=sc.next();
     int value=0;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
      }
      return value;
   } 
    public  String getValueForKey(){
     Map<String,String> map=createStringHashMap();
     System.out.println("Enter the non existing key for which you want the value:");
     String nonExistingKey=sc.next();
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     String value=null;
      if(map.containsKey(nonExistingKey)){
           value=map.get(nonExistingKey);
      }
      else{
          System.out.println("Given key is not existing");
          value="zoho";
      }
      return value;
   } 
   public Map<Integer,Integer> removeKey(){
     Map<Integer,Integer> map=createIntegerHashMap();
     System.out.println("Enter the key which you want to remove:");
     int removeKey=sc.nextInt();
      System.out.println("Hashmap elements before changes:");
           for(Map.Entry map1: map.entrySet()){    
                System.out.println(map1.getKey()+" "+map1.getValue());    
           } 
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     if(map.containsKey(removeKey)){
        map.remove(removeKey);
     }
     else{
       System.out.println("Given key is not existing");
     }
     return map;
   }
   public Map<String,String> removeMatchedValue(){
        Map<String,String> map=createStringHashMap();
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
         System.out.println("Hashmap elements before changes:");
           for(Map.Entry map2: map.entrySet()){    
                System.out.println(map2.getKey()+" "+map2.getValue());    
           } 
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
       if(map.containsKey(removedKey)){
            if(matchValue.equals(map.get(removedKey))){
                map.remove(removedKey);
            }
            else{
               System.out.println("Given value not matched with key value");
            }
       }
       else{
        System.out.println("Given key is not existing");   
       }
    return map;
   }
   public Map<String,Integer> replaceValue(){
         Map<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(replaceKey)){
              map.replace(replaceKey,replaceValue);
          }
         else{
        System.out.println("Given key is not existing");   
       }
    return map;
   } 
    public Map<String,Integer> replaceMatchedValue(){
          Map<String,Integer> map=createStringIntegerHashMap();
          System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
          System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(replaceKey1)){
             if(matchValue1==map.get(replaceKey1)){
                 map.replace(replaceKey1,replaceValue1);
             }
             else{
                 System.out.println("Given value not matched with key value");
             }
          }
         else{
           System.out.println("Given key is not existing");   
       }
    return map;
   } 
  public Map<String,Integer> transferKeysValues(){
        Map<String,Integer> firstMap=createStringIntegerHashMap();
        Map<String,Integer> secondMap=createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          for(Map.Entry hashMap1: firstMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size1=firstMap.size();
          System.out.println("Size of the HashMap1 before changes:"+size1);
           System.out.println("Hashmap2 elements before changes:");
          for(Map.Entry hashMap1: secondMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size2=secondMap.size();
          System.out.println("Size of the HashMap2 before changes:"+size2);
       secondMap.putAll(firstMap);
       System.out.println("Hashmap1 elements after changes:");
          for(Map.Entry hashMap: firstMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int size=firstMap.size();
          System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public Map<String,Integer> iterateHashMap(){
         Map<String,Integer> map=createStringIntegerHashMap();
         return map;
  }
  public Map<String,Integer> removeAllEntries(){
         Map<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
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
 
 
 
 
 
 
