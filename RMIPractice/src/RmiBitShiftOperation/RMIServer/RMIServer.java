/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RmiBitShiftOperation.RMIServer;

/**
 *
 * @author bhattaraib58
 */
import RmiBitShiftOperation.RMIInterface.RMIInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject  implements RMIInterface
{
    //will get marshalException and Notserilizable Exception
    RMIServer() throws RemoteException
    {
        super();
    }
    @Override
    public int leftShiftOperation(int input) throws RemoteException
    {
        int result=input<<1;
        return result;
    }

    @Override
    public int unsignedRightShiftOperation(int input) throws RemoteException
    {
        int result=input>>>1;
        return result;
    }

    @Override
    public int signedRightShiftOperation(int input) throws RemoteException
    {
        int result=input>>1;
        return result;
    }
    
    public static void main(String[] args)
    {
        try
        {
            Naming.rebind("//localhost/RMIBitShift", new RMIServer());
            System.out.println("Server Started Sucessfully");
            
        } 
        catch (RemoteException | MalformedURLException ex)
        {
            System.out.println(ex);
        }
    }
}
