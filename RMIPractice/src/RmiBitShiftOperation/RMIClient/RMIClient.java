/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RmiBitShiftOperation.RMIClient;

/**
 *
 * @author bhattaraib58
 */
import RmiBitShiftOperation.RMIInterface.RMIInterface;
import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient 
{
    public static void main(String[] args)
    {
        try
        {
            RMIInterface rmiInterface;
            
            rmiInterface=(RMIInterface)Naming.lookup("//localhost/RMIBitShift");
            
            int leftShiftResult=rmiInterface.leftShiftOperation(6);
            int unsignedRightShiftResult=rmiInterface.unsignedRightShiftOperation(12);
            int signedRightShiftResult=rmiInterface.signedRightShiftOperation(-132);
            System.out.println("The Left Shift Operation of 6 is::"+leftShiftResult);
            System.out.println("The Unsigned Right Shift Operation of 12 is::"+unsignedRightShiftResult);
            System.out.println("The Signed Right Shift Operation of -132 is::"+signedRightShiftResult);
            
        } 
        catch (NotBoundException | MalformedURLException | RemoteException ex)
        {
            System.out.println(ex);
        }
        
    }
}
