/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.jansen.oop.tutorial.models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Rolf
 */
public class Person extends AbstractModel {

    private String _nachname;
    private String _geburtsname;
    private String _vorname;
    private String _geburtsort;
    private Date _geburtsdatum;
    private List<Erreichbarkeit> _erreichbarkeiten;

    /**
     * @return the _nachname
     */
    public String getNachname() {
        return _nachname;
    }

    /**
     * @param _nachname the _nachname to set
     */
    public void setNachname(String _nachname) {
        if (this._nachname != _nachname) {
            String oldValue = this._nachname;
            this._nachname = _nachname;
            firePropertyChange("Nachname", oldValue, _nachname);
        }
    }

    /**
     * @return the _geburtsname
     */
    public String getGeburtsname() {
        return _geburtsname;
    }

    /**
     * @param _geburtsname the _geburtsname to set
     */
    public void setGeburtsname(String _geburtsname) {
        this._geburtsname = _geburtsname;
    }

    /**
     * @return the _vorname
     */
    public String getVorname() {
        return _vorname;
    }

    /**
     * @param _vorname the _vorname to set
     */
    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }

    /**
     * @return the _geburtsort
     */
    public String getGeburtsort() {
        return _geburtsort;
    }

    /**
     * @param _geburtsort the _geburtsort to set
     */
    public void setGeburtsort(String _geburtsort) {
        this._geburtsort = _geburtsort;
    }

    /**
     * @return the _geburtsdatum
     */
    public Date getGeburtsdatum() {
        return _geburtsdatum;
    }

    /**
     * @param _geburtsdatum the _geburtsdatum to set
     */
    public void setGeburtsdatum(Date _geburtsdatum) {
        this._geburtsdatum = _geburtsdatum;
    }

    /**
     * @return the _erreichbarkeiten
     */
    public List<Erreichbarkeit> getErreichbarkeiten() {
        return _erreichbarkeiten;
    }
}
