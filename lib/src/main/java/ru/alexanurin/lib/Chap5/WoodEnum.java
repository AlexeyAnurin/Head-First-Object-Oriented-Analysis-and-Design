package ru.alexanurin.lib.Chap5;

public enum WoodEnum {
    INDIAN_ROSEWOOD("Indian Rosewood"),
    BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
    MAHOGANY("Mahogany"),
    MAPLE("Maple"),
    COCOBOLO("Cocobolo"),
    CEDAR("Cedar"),
    ADIRONDACK("Adirondack"),
    ALDER("Alder"),
    SITKA("Sitka");

    String name;

    WoodEnum(String wood) {
        this.name = wood;
    }
}
