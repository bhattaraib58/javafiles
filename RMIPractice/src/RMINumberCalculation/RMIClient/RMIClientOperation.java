/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMINumberCalculation.RMIClient;

/**
 *
 * @author bhattaraib58
 */
import RMINumberCalculation.RMIInterface.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMIClientOperation 
{
    private static RMIInterface registryLookup;
    public static void main(String[] args)
    {
        try
        {
            registryLookup=(RMIInterface)Naming.lookup("//localhost/RMIDemoServer");//Returns a reference for the remote object associated with given server
//            
//            Registry registry = LocateRegistry.getRegistry();
//            RmiInterface registryLookup = (RmiInterface) registry.lookup("Hello");
            
            Scanner scan=new Scanner(System.in);
            
            System.out.println("Enter First Number For Calculation::");
            double firstInputNumber=scan.nextDouble();
            
            System.out.println("Enter Second Number For Calculation::");
            double secondInputNumber=scan.nextDouble();
            
            //as we have got the rmiinterface object associated implementation in registryLookup we can access its method
            double additionResult=registryLookup.AddNumber(firstInputNumber, secondInputNumber);
            double subtractionResult=registryLookup.subtractNumber(firstInputNumber, secondInputNumber);
            
            System.out.println("Addition of Two Numbers is::"+additionResult);
            System.out.println("Subtraction of Two Numbers is::"+subtractionResult);
        } 
        catch (NotBoundException | MalformedURLException | RemoteException ex)
        {
            System.out.println(ex);
        }
    }
}
