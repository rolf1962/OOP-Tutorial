/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.jansen.oop.tutorial.dataccess;

import java.util.List;
import local.jansen.oop.tutorial.models.*;

/**
 *
 * @author Rolf
 */
public class DataContext {

    private List<Person> _personen;
    private List<Adresse> _adressen;
    private List<EmailAdresse> _emailAdressen;
    private List<TelefonAnschluss> _telefonAnschluesse;
    private List<WebSite> _webSites;

    /**
     * @return the _personen
     */
    public List<Person> getPersonen() {
        return _personen;
    }

    /**
     * @param _personen the _personen to set
     */
    protected void setPersonen(List<Person> _personen) {
        this._personen = _personen;
    }

    /**
     * @return the _adressen
     */
    public List<Adresse> getAdressen() {
        return _adressen;
    }

    /**
     * @param _adressen the _adressen to set
     */
    protected void setAdressen(List<Adresse> _adressen) {
        this._adressen = _adressen;
    }

    /**
     * @return the _emailAdressen
     */
    public List<EmailAdresse> getEmailAdressen() {
        return _emailAdressen;
    }

    /**
     * @param _emailAdressen the _emailAdressen to set
     */
    protected void setEmailAdressen(List<EmailAdresse> _emailAdressen) {
        this._emailAdressen = _emailAdressen;
    }

    /**
     * @return the _telefonAnschluesse
     */
    public List<TelefonAnschluss> getTelefonAnschluesse() {
        return _telefonAnschluesse;
    }

    /**
     * @param _telefonAnschluesse the _telefonAnschluesse to set
     */
    protected void setTelefonAnschluesse(List<TelefonAnschluss> _telefonAnschluesse) {
        this._telefonAnschluesse = _telefonAnschluesse;
    }

    /**
     * @return the _webSites
     */
    public List<WebSite> getWebSites() {
        return _webSites;
    }

    /**
     * @param _webSites the _webSites to set
     */
    protected void setWebSites(List<WebSite> _webSites) {
        this._webSites = _webSites;
    }
}
