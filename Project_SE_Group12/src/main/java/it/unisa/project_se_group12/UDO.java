/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * this class allows us to manage custom operation that user can create and the structure where they are stored. The attribute of the class is the structure
 * that we have described before that is an hash map
 */
public class UDO {
    HashMap<String, String> map;
    
    final static String filePath = new File("udo.txt").getAbsolutePath();

    /**
     * create an empty hash map
     */
    public UDO() {
        this.map = new HashMap<>();
    }
 
    /**
     * insert into a map a name that we use like a key of the map and a custom operation that is associated to that name
     * @param name name of the UDO
     * @param operation User Defined Operation
     */
    public void insertUDO(String name,String operation){
        this.map.put(name, operation);
    }
  
    /**
     * remove an element by key
     * @param name name of the UDO
     */
    public void deleteUDO(String name){
        this.map.remove(name);
    }
   
    /**
     * return map
     * @return an HashMap
     */
    public HashMap<String, String> getMap() {
        return map;
    }

    /**
     * print the hash map as a string
     * @return a string
     */
    @Override
    public String toString() {
        String str = "";
        Set<String> set =map.keySet();
        for(String s: set){
            str = str + s + '\n';
        }
        return str;
    }
    
    /**
     * The function allows to execute custom UDO operation
     * @param key UDO's name
     * @param stack GUI's stack
     * @return true if the the operation is correctly execute, false otherwise
     */
    public boolean executeOperation(String key, StackManage stack){
        String operation = map.get(key);
        String[] step = operation.split(" ");
        
        ComplexOperations op = new ComplexOperations();
        
        for(int i=0;i<step.length;i++){
            if(step[i].equals("+")){
                if(!stack.addOperation())
                    return false;
            }else if(step[i].equals("-")){
                if(!stack.divisionOperation())
                    return false;
            }else if(step[i].equals("*")){
                if(!stack.multiplyOperation())
                    return false;
            }else if(step[i].equals("÷")){
                if(!stack.divisionOperation())
                    return false;
            }else if(step[i].equals("√")){
                if(!stack.squareRootOperation())
                    return false;
            }else if(step[i].equals("+-")){
                if(!stack.invertSignOperation())
                    return false;
            }else if(step[i].equals("Clear")){
                stack.clearStack();
            }else if(step[i].equals("Drop")){
                 if(!stack.isEmpty()){
                    stack.popFromStack();
                 }else{
                     return false;
                 }
            }else if(step[i].equals("Dup")){
               if(!stack.dupLastElement())
                   return false;
            }else if(step[i].equals("Swap")){
               if(!stack.swap())
                   return false;
            }else if(step[i].equals("Over")){
                if(!stack.over())
                    return false;
            }else if(map.containsKey(step[i])){
                this.executeOperation(step[i], stack);
            }
        }
        return true;
    }  
    
    /**
     * The funtion allows to save the user defined operations in a file
     * @return true if the file is correctly saved, false otherwise
     */
    public boolean saveToFile(){
        File file = new File(filePath);
        BufferedWriter bf = null;
  
        try {
  
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
  
            // iterate map entries
            for (Map.Entry<String, String> entry :
                 map.entrySet()) {
  
                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                         + entry.getValue());
  
                // new line
                bf.newLine();
            }
  
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
  
            try {
  
                // always close the writer
                bf.close();
            }
            catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * The function allows to load the user defined operations from a file
     * @return true if the file is correctly saved, false otherwise
     */
    public boolean loadFromFile(){
        BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File(filePath);
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(":");
  
                // first part is nameOperation, second is udoOperation
                String nameOperadion = parts[0].trim();
                String udoOperation = parts[1].trim();
  
                // put name, udo in HashMap if they are
                // not empty
                if (!nameOperadion.equals("") && !udoOperation.equals(""))
                    map.put(nameOperadion, udoOperation);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}