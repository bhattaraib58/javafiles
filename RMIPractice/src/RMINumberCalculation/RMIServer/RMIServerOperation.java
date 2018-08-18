/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMINumberCalculation.RMIServer;

/**
 *
 * @author bhattaraib58
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMINumberCalculation.RMIInterface.RMIInterface;

public class RMIServerOperation extends UnicastRemoteObject implements RMIInterface
{
     /* indicate compatibility with JDK 1.1.x version of class */
    //its in parent class Vraiable
    private static final long serialVersionUID = 1L;
    //initializing the UnicastRemoteObject check UnicastRemoteObject Decleration for more Info
    //we should initilize it because default constructor only initialize the RMIServerOperation and not UnicastRemoteObject
    // and as UnicastRemoteObject is parent its Constructor should be called first so we are initializing it.
    
    RMIServerOperation() throws RemoteException
    {
        super();
    }
    @Override
    public double AddNumber(double firstNumber, double secondNumber) throws RemoteException
    {
        double result=firstNumber+secondNumber;
        return result;
    }

    @Override
    public double subtractNumber(double firstNumber, double secondNumber) throws RemoteException
    {
        double result=firstNumber-secondNumber;
        return result;
    }
    public static void main(String[] args)
    {
        //making rmi interface implementation class object to add to registry
//        RmiInterfaceImp rmiImp=new RmiInterfaceImp();
        try
        {
            //adding the implementation object to registry and binding it
            Naming.rebind("//localhost/RMIDemoServer",new RMIServerOperation());
            
             // Bind the remote object's stub in the registry

//            RmiInterface stub = (RmiInterface) UnicastRemoteObject.exportObject(rmiImp, 0);
//
//            // Bind the remote object's stub in the registry
//            Registry registry = LocateRegistry.getRegistry();
//            registry.bind("Hello", stub);
////            
//            Registry registry = LocateRegistry.getRegistry();
//            registry.bind("Hello", rmiImp); 
            
            System.out.println("Rmi Server Running !!");
        } 
        catch (RemoteException| MalformedURLException ex)//  
        {
            System.out.println(ex);
        } 
    }
}
