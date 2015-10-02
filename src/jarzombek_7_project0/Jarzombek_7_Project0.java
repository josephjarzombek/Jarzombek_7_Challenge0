/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarzombek_7_project0;

/**
 *
 * @author josephjarzombek
 */
public class Jarzombek_7_Project0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
    for(int i = 0; i < 502; i++) {
        if(divisTwo(i) & divisThree(i) & divisFive(i)){
            System.out.println("Team building");
        }else{
            if(divisTwo(i) & divisThree(i)){
                System.out.println("chisme");
            }else{
                if(divisThree(i) & divisFive(i)){
                    System.out.println("Old School");
                }else{
                    if(divisFive(i) & divisEleven(i)){
                        System.out.println("Animate This");
                    }else{
                        if(divisThree(i) & divisEleven(i)){
                            System.out.println("Herr Direktor");
                        }else{
                            if(divisTwo(i) & divisEleven(i)){
                                System.out.println("ninja");
                            }else{
                                if(divisFive(i)){
                                    System.out.println("Vidal");
                                }else{
                                    if(divisThree(i)){
                                        System.out.println("Claughton");
                                    }else{
                                        if(divisTwo(i)){
                                            System.out.println("Davis");
                                        }
                                    }
                                }
                            }
                            
                        }
                    }
                }
                
        }    
    }
    }
    }
    static boolean divisTwo (int somenumber) {
        return (somenumber % 2 == 0);
    }
    static boolean divisThree (int somenumber) {
        return (somenumber % 3 == 0);
    }
    static boolean divisFive (int somenumber) {
        return (somenumber % 5 == 0);
    }
    static boolean divisEleven (int somenumber) {
        return (somenumber % 11 == 0);
    }
}
  