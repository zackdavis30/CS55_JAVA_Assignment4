
import java.util.Scanner;


public class Assignment4 {
    
    public static void main(String[] args){  
        
// Allowing user to input data
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("LAB STATUS");
        System.out.println("Lab # / Computer Stations");
        
// 2D Array
        String[][] cLabs = {
                    {"Empty","Empty","Empty","Empty","Empty"},
                    {"Empty","Empty","Empty","Empty","Empty","Empty"},
                    {"Empty","Empty","Empty","Empty"},
                    {"Empty","Empty","Empty"}
                }; 
// Printing the 2D Array with two loops        
        for (int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();
                }  
        
//Menu choices using a switch statment         
        System.out.println("MAIN MENU");
        System.out.println("0) Quit \n1) Simulate Login \n2) Simulate Logoff \n3) Search");
        
        int menuChoice = userInput.nextInt(); // switch using int to make a menu choice
        
// Switch case statment used for each menu option           
        switch(menuChoice){
            case 0:
                System.exit(0); // exit out the program
            case 1:
// Using the scanner to insert data in variables 
                System.out.println("Enter the 5 digit ID number of the user logging in:" );
                String idNumber = userInput.next(); // String
                System.out.println("Enter the lab number the user is logging in from (1-4):");
                int lNum = userInput.nextInt(); // integer
                System.out.println("Enter computer station number the user is logging into (1-6):");
                int cStation = userInput.nextInt(); // integer 
                 
/* 
looping through the 2D array to add the 5 digit number (idNumber) and placeing it into 
the correct Lab (lNum) and Computer Station (cStation)
*/
                for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        cLabs[(lNum-1)][(cStation-1)] = idNumber;
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();
                }    
              break;  
            case 2: 
// Second loop used to locate and replace the (idNumber) String back to "Empty" String
                System.out.println("Enter the 5 digit ID number of the user to logout:");
                String idNumber2 = userInput.next();
                
                for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        if(cLabs[i][j].equals(idNumber2)){
                            cLabs[i][j] = "Empty";
                        }       
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();
                    
                }              
                System.out.println("User " + idNumber2 + " is logged off");               
               break; 
            case 3: 
// searching the array for matching id numbers using a booling expression for an If Statement
                System.out.println("Search for A ID Number");
                String Search = userInput.next(); // ID number variable
                String stringToSearch = Search; // Unessary conversion
                boolean found = false; // boolean set to false 
// variable for the [i][j] coordinates
                int s = 0; 
                int l = 0;
// Looping through the array to see ID number equals to any of the strings in array
                    for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        if(cLabs[i][j].equals(stringToSearch)){
                            found = true; // If there is a match then boolean turns true
                            l = i; // variables for the coordinates
                            s = j;
                        }       
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();     
                      }  
                    
                    if(found){ // displays the array if found and boolean is true 
                        System.out.print("ID Number found");
                        System.out.println("ID Number: " + stringToSearch);
                        System.out.println("At Lab: " + (l+1)); 
                        System.out.println("Station: " + (s+1));
                    }else { // if no match then else statment executes
                        System.out.println("ID Number not found");
                    }
               break;    
            default :// Must have default for case statament
                System.out.println("Invalid input");
                break;
                  
            }
/*
The following code is the same as above but I have added a Do.. While loop so the program will keep
running until the user makes a choice of 0 and then the program will end.    
*/        
        do{ // To loop the program so we can keep login on and loggin
        System.out.println("MAIN MENU");
        System.out.println("0) Quit \n1) Simulate Login \n2) Simulate Logoff \n3) Search");
        menuChoice = userInput.nextInt();
        
        switch(menuChoice){
            case 0:
                System.exit(0); // exit out the program
            case 1:
// Using the scanner to insert data in variables 
                System.out.println("Enter the 5 digit ID number of the user logging in:");
                String idNumber = userInput.next();
                System.out.println("Enter the lab number the user is logging in from (1-4):");
                int lNum = userInput.nextInt();
                System.out.println("Enter computer station number the user is logging into (1-6):");
                int cStation = userInput.nextInt();
                 
/* 
looping through the 2D array to add the 5 digit number and placeing it into 
the correct Lab and Computer Station
*/
                for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        cLabs[(lNum-1)][(cStation-1)] = idNumber;
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();
                }    
              break;  
            case 2:
                System.out.println("Enter the 5 digit ID number of the user to logout:");
                String idNumber2 = userInput.next();
                
                for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        if(cLabs[i][j].equals(idNumber2)){
                            cLabs[i][j] = "Empty";                 
                        }         
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                    }
                    System.out.println();
                    
                }              
              System.out.println("User " + idNumber2 + " is logged off");
                
               break; 
            case 3: // searching the array for matching id numbers using a booling expression
                System.out.println("Search for A ID Number");
                String Search = userInput.next(); // inputing id number
                String stringToSearch = Search;
                boolean found = false;
                int l = 0;
                int s = 0;
                    for(int i = 0; i < cLabs.length; i++){
                    System.out.print(i+1 + " ");
                    for(int j = 0; j < cLabs[i].length; j++){
                        if(cLabs[i][j].equals(stringToSearch)){
                            found = true;
                            l = i;
                            s = j;
                            
                        }       
                        System.out.print((j+1) + ":" + cLabs[i][j] + " ");
                        
                        
                    }
                    System.out.println();     
                      }  
                    
                    if(found){ // displays the array if found 
                        System.out.println("ID Number found");
                        System.out.println("ID Number:" + stringToSearch);
                        System.out.println("At Lab:" + (l+1)); 
                        System.out.println("Station:" + (s+1));
                    }else {
                        System.out.println("ID Number not found");
                    }
               break; 
            default :
                System.out.println("Invalid input");
                break;
                  
            }
        
        }while(menuChoice !=0);
    
        
        }
  }
          

    

