/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RmiBitShiftOperation.RMIInterface;

/**
 *
 * @author bhattaraib58
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote 
{
        public int leftShiftOperation(int input) throws RemoteException;
        public int unsignedRightShiftOperation(int input) throws RemoteException;
        public int signedRightShiftOperation(int input) throws RemoteException;
}
