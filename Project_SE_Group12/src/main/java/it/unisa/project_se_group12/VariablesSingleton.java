/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

/**
 *
 * @author PC MSI
 */
public class VariablesSingleton {
    static private Variables instance = null;
    
    public static Variables getVariables() {
        if (instance==null)
            instance = new Variables();
        
            return instance;
    }
}
