package ru.alexanurin.lib.Chap5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List inventory;

    public Inventory() {
        this.inventory = new LinkedList<>();
    }

    public List<Instrument> getGuitarList() {
        return inventory;
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List<Instrument> matchingGuitars = new LinkedList<>();
        for (Iterator i = inventory.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec) {
        List<Instrument> matchingMandolins = new LinkedList<>();
        for (Iterator i = inventory.iterator(); i.hasNext();) {
            Mandolin mandolin = (Mandolin) i.next();
            if (mandolin.getSpec().matches(searchSpec)) {
                matchingMandolins.add(mandolin);
            }
        }
        return matchingMandolins;
    }

    //  method for basic type Instrument, not for specific classes
    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList<>();
        for (Iterator i = inventory.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSpec().matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }

}