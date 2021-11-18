/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.jansen.oop.tutorial.dataccess;

import java.util.Calendar;
import java.util.Date;
import local.jansen.oop.tutorial.models.*;

/**
 *
 * @author Rolf
 */
public class TestContext extends DataContext {
    
    public TestContext() {
        CreateTestData();
    }
    
    private void CreateTestData() {
        // Wird zur korrekten Initialisierung von Date gebraucht
        Calendar calendar=Calendar.getInstance();
        
        // Personen erzeugen und der Liste hinzufügen
        Person rolf = new Person();
        calendar.set(1962,2,24);
        rolf.setGeburtsdatum(calendar.getTime());
        rolf.setGeburtsname("Jansen");
        rolf.setGeburtsort("Anrath jetzt Willich");
        rolf.setNachname("Jansen");
        rolf.setVorname("Rolf");
        getPersonen().add(rolf);

        Person susanne = new Person();
        getPersonen().add(susanne);
        Person max = new Person();
        getPersonen().add(max);
        Person alex = new Person();
        getPersonen().add(alex);
        Person lars = new Person();
        getPersonen().add(lars);
        // Personen erzeugen und der Liste hinzufügen
        
        
        // Adressen erzeugen und der Liste hinzufügen
        Adresse suechtelnWeberstrasse44 = new Adresse();
        getAdressen().add(suechtelnWeberstrasse44);
        
        Erreichbarkeit rolfErreichbarWohnschrift = new Erreichbarkeit(suechtelnWeberstrasse44);
        calendar.set(2000,4,11);
        rolfErreichbarWohnschrift.setErreichbarVon(calendar.getTime());
        rolfErreichbarWohnschrift.setErreichbarAls(Erreichbarkeit.ErreichbarAls.Wohnung);
        rolf.getErreichbarkeiten().add(rolfErreichbarWohnschrift);
    }
}
