/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.jansen.oop.tutorial.models;

import java.util.Date;

/**
 *
 * @author Rolf
 * @param <T>
 */
public class Erreichbarkeit<T extends IErreichbarkeit> {

    public enum ErreichbarAls {
        Mobil,
        Festnetz,
        Wohnung,
        Arbeitsstelle
    }

    private T _erreichbarArt;
    private ErreichbarAls _erreichbarAls;
    private Date _erreichbarVon;
    private Date _erreichbarBis;

    public Erreichbarkeit(T erreichbarArt) {
        _erreichbarArt = erreichbarArt;
    }

    /**
     * @return the _erreichbarArt
     */
    public T getErreichbarArt() {
        return _erreichbarArt;
    }

    /**
     * @return the _erreichbarAls
     */
    public ErreichbarAls getErreichbarAls() {
        return _erreichbarAls;
    }

    /**
     * @param _erreichbarAls the _erreichbarAls to set
     */
    public void setErreichbarAls(ErreichbarAls _erreichbarAls) {
        this._erreichbarAls = _erreichbarAls;
    }

    /**
     * @return the _erreichbarVon
     */
    public Date getErreichbarVon() {
        return _erreichbarVon;
    }

    /**
     * @param _erreichbarVon the _erreichbarVon to set
     */
    public void setErreichbarVon(Date _erreichbarVon) {
        this._erreichbarVon = _erreichbarVon;
    }

    /**
     * @return the _erreichbarBis
     */
    public Date getErreichbarBis() {
        return _erreichbarBis;
    }

    /**
     * @param _erreichbarBis the _erreichbarBis to set
     */
    public void setErreichbarBis(Date _erreichbarBis) {
        this._erreichbarBis = _erreichbarBis;
    }

}
