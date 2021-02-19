package ru.alexanurin.lib.Chap5;

public class MandolinSpec extends InstrumentSpec{

    private StyleEnum style;

    public MandolinSpec(BuilderEnum builder, String model, TypeEnum type, WoodEnum backWood, WoodEnum topWood, StyleEnum style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public StyleEnum getStyle() {
        return style;
    }

    public boolean matches(InstrumentSpec other_Spec){
        if (!super.matches(other_Spec))
            return false;
        if (!(other_Spec instanceof MandolinSpec))
            return false;
        MandolinSpec mandolinSpec = (MandolinSpec) other_Spec;
        if (style.equals(mandolinSpec.style))
            return false;
        return true;
    }
}
