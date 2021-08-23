
package hashmap;
import java.util.*;
public class HashMapTaskRunner{
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    HashMapTask obj=new HashMapTask();
    switch(number){
       case 1:
          int size=obj.findSize();
          System.out.println("Size of the Hashmap:"+size);
          break;
       case 2:
          Map<String,String> stringMap=obj.findStringMapSize();
          System.out.println("Hashmap elements:");
          for(Map.Entry str : stringMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int mapSize1=stringMap.size();
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          Map<Integer,Integer> integerMap=obj.findIntegerMapSize();
         System.out.println("Hashmap elements:");
          for(Map.Entry intMap : integerMap.entrySet()){    
           System.out.println(intMap.getKey()+" "+intMap.getValue());    
          }   
          int mapSize2=integerMap.size();
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          Map<String,Integer> strIntMap=obj.findStringIntegerMapSize();
          int mapSize=strIntMap.size();
           System.out.println("Hashmap elements:");
           for(Map.Entry map: strIntMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
          break;
     case 5:
          Map<String,Student> customHashMap=obj.createCustomMap();
          System.out.println("Hashmap elements:");
         for(Map.Entry str : customHashMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int customHashMapSize=customHashMap.size();
          System.out.println("Size of the String Hashmap:"+customHashMapSize);
          break;
     case 6:
          Map<String,String> strMap=obj.findStringMapSize();
          System.out.println("Hashmap elements:");
         for(Map.Entry str : strMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int strMapSize=strMap.size();
          System.out.println("Size of the String Hashmap:"+strMapSize);
          break;
     case 7:
           Map<Integer,Integer> nullMap=obj.addNull();
           System.out.println("HashMap elements:"+nullMap);
           int nullMapSize=nullMap.size();
           System.out.println("HashMap size:"+nullMapSize);
           break;
     case 8:
           boolean value=obj.checkKey();
           System.out.println("Given key is present in the hashmap:"+value);
           break;
     case 9:
           boolean booleanValue=obj.checkValue();
           System.out.println("Given value is present in the hashmap:"+booleanValue);
           break;
     case 10:
          Map<String,String> changedHash=obj.changeValues();
          System.out.println("Hashmap elements:");
           for(Map.Entry mapChange: changedHash.entrySet()){    
                System.out.println(mapChange.getKey()+" "+mapChange.getValue());    
           } 
           break;
     case 11:
         int valueForKey=obj.getValue();
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
         int valueKey=obj.getValue();
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
         String valueOfKey=obj.getValueForKey();
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
         Map<Integer,Integer> changedMap=obj.removeKey();
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
         Map<String,String> changedHashMap=obj.removeMatchedValue();
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
         Map<String,Integer> replacedHashMap=obj.replaceValue();
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
         Map<String,Integer> replacedHashMap1=obj.replaceMatchedValue();
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap1.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          System.out.println("Hashmap1 elements before changes:");
          Map<String,Integer> transferedHashMap=obj.transferKeysValues();
          System.out.println("Hashmap2 elements after transfers:");
          for(Map.Entry hashMap: transferedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          Map<String,Integer> map=obj.iterateHashMap();
          System.out.println("Hashmap elements:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
          }
         break;
      case 20:
          Map<String,Integer> clearedHashMap=obj.removeAllEntries();
          System.out.println("Hashmap elements after changes:"+clearedHashMap);
         /* for(Map.Entry hashMap1: clearedHashMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }*/
           int afterSize=clearedHashMap.size();
          System.out.println("Size of the HashMap after changes:"+afterSize);
          break;
     default:
         System.out.println("No program");
         break;
     }
  }
 }
