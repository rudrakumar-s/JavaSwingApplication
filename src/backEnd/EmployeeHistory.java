/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;
 
import java.util.ArrayList;

/**
 *
 * @author sunilrudrakumar
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
        
    }
     public Employee updateEmployee(){
         
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
     }
    public void deleteEmployee(Employee eh){
        history.remove(eh);
    }
    
}
