package ru.alexanurin.lib.Chap5;

public class GuitarSpec extends InstrumentSpec {

    int numString;

    public GuitarSpec(BuilderEnum builder, String model, TypeEnum type, int numString, WoodEnum backWood, WoodEnum topWood) {
        super(builder, model, type, backWood, topWood);
        this.numString = numString;
    }

    public boolean matches(InstrumentSpec other_Spec){
        if (!super.matches(other_Spec))
            return false;
        if (!(other_Spec instanceof GuitarSpec))
            return false;
        GuitarSpec other_guitarSpec = (GuitarSpec) other_Spec;
        if (this.numString != other_guitarSpec.numString)
            return false;
        return true;
    }
}
