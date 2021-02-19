package ru.alexanurin.lib.Chap5;

public abstract class InstrumentSpec {

    private BuilderEnum builder;
    private String model;
    private TypeEnum type;
    private WoodEnum backWood;
    private WoodEnum topWood;

    public InstrumentSpec(BuilderEnum builder, String model, TypeEnum type, WoodEnum backWood, WoodEnum topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public BuilderEnum getBuilder() {
        return builder;
    }

    public WoodEnum getTopWood() {
        return topWood;
    }

    public TypeEnum getType() {
        return type;
    }

    public WoodEnum getBackWood() {
        return backWood;
    }

    public String getModel() {
        return model;
    }

    public boolean matches(InstrumentSpec other_InstrumentSpec){
        if (this.builder != other_InstrumentSpec.builder)
            return false;
        if (this.model != null && !this.model.equals("") && !this.model.equals(other_InstrumentSpec.model))
            return false;
        if (this.type != other_InstrumentSpec.type)
            return false;
        if (this.backWood != other_InstrumentSpec.backWood)
            return false;
        if (this.topWood != other_InstrumentSpec.topWood)
            return false;

        return true;
    }
}
