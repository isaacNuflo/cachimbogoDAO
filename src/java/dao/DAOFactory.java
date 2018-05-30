/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import component.*;
import design.*;

/**
 *
 * @author isaac
 */
public class DAOFactory {
    private static DAOFactory daoFac;
    
    static{
        daoFac = new DAOFactory();
    }
    
    public static DAOFactory getInstance(){
        return daoFac;
    }
    
    public IAsignaturaDAO getAsignaturaDAO(){
        return new AsignaturaDAO();
    }
    
    public IDificultadDAO getDificultadDAO(){
        return new DificultadDAO();
    }
    
    public IPreguntaDAO getPreguntaDAO(){
        return new PreguntaDAO();
    }
    
    public IRespuestaDAO getRespuestaDAO(){
        return new RespuestaDAO();
    }
    
    public ISubtemaDAO getSubtemaDAO(){
        return new SubtemaDAO();
    }
    
    public ITemaDAO getTemaDAO(){
        return new TemaDAO();
    }
    
    public ITipoPreguntaDAO getTipoPreguntaDAO(){
        return new TipoPreguntaDAO();
    }
    
    public IUsuarioAsignaturaDAO getUsuarioAsignaturaDAO(){
        return new UsuarioAsignaturaDAO();
    }
    
    public IUsuarioDAO getUsuarioDAO(){
        return new UsuarioDAO();
    }
    
    public IUsuarioSubtemaDAO getUsuarioSubtemaDAO(){
        return new UsuarioSubtemaDAO();
    }
    
    public IUsuarioTemaDAO getUsuarioTemaDAO(){
        return new UsuarioTemaDAO();
    }
}
