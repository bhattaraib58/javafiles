/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMINumberCalculation.RMIInterface;

/**
 *
 * @author bhattaraib58
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote
{
    public double AddNumber(double firstNumber, double secondNumber) throws RemoteException;
    public double subtractNumber(double firstNumber, double secondNumber) throws RemoteException;
}
