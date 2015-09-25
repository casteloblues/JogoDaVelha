/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.jogada;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 31240550
 */
public interface Jogada extends Remote {
    public void novoJogo(String nome) throws RemoteException;
    public void jogada()
}
