package ru.alexanurin.lib.Chap5;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes =
                new GuitarSpec(BuilderEnum.FENDER, "Stratocastor",
                        TypeEnum.ELECTRIC, 4,  WoodEnum.ALDER, WoodEnum.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = (GuitarSpec) guitar.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("11277", 3999.95,
                new GuitarSpec(BuilderEnum.COLLINGS, "CJ", TypeEnum.ACOUSTIC, 4,
                        WoodEnum.INDIAN_ROSEWOOD, WoodEnum.SITKA));
        inventory.addInstrument("V95693", 1499.95,
                new GuitarSpec(BuilderEnum.FENDER, "Stratocastor", TypeEnum.ELECTRIC, 4,
                        WoodEnum.ALDER, WoodEnum.ALDER));

        /*
        inventory.addInstrument(new Guitar("V9512", 1549.95,
                new GuitarSpec(BuilderEnum.FENDER, "Stratocastor", TypeEnum.ELECTRIC,5,
                        WoodEnum.ALDER, WoodEnum.ALDER)));
        inventory.addInstrument(new Guitar("122784", 5495.95,
                new GuitarSpec(BuilderEnum.MARTIN, "D-18", TypeEnum.ACOUSTIC, 5,
                        WoodEnum.MAHOGANY, WoodEnum.ADIRONDACK)));
        inventory.addInstrument(new Guitar("76531", 6295.95,
                new GuitarSpec(BuilderEnum.MARTIN, "OM-28", TypeEnum.ACOUSTIC,5,
                        WoodEnum.BRAZILIAN_ROSEWOOD, WoodEnum.ADIRONDACK)));
        inventory.addInstrument(new Guitar("70108276", 2295.95,
                new GuitarSpec(BuilderEnum.GIBSON, "Les Paul", TypeEnum.ELECTRIC,5,
                        WoodEnum.MAHOGANY, WoodEnum.MAHOGANY)));
        inventory.addInstrument(new Guitar("82765501", 1890.95,
                new GuitarSpec(BuilderEnum.GIBSON, "SG '61 Reissue", TypeEnum.ELECTRIC,5,
                        WoodEnum.MAHOGANY, WoodEnum.MAHOGANY)));
        inventory.addInstrument(new Guitar("77023", 6275.95,
                new GuitarSpec(BuilderEnum.MARTIN, "D-28", TypeEnum.ACOUSTIC,5,
                        WoodEnum.BRAZILIAN_ROSEWOOD, WoodEnum.ADIRONDACK)));
        inventory.addInstrument(new Guitar("1092", 12995.95,
                new GuitarSpec(BuilderEnum.OLSAN, "SJ", TypeEnum.ACOUSTIC,5,
                        WoodEnum.INDIAN_ROSEWOOD, WoodEnum.CEDAR)));
        inventory.addInstrument(new Guitar("566-62", 8999.95,
                new GuitarSpec(BuilderEnum.RYAN, "Cathedral", TypeEnum.ACOUSTIC,5,
                        WoodEnum.COCOBOLO, WoodEnum.CEDAR)));
        inventory.addInstrument(new Guitar("6 29584", 2100.95,
                new GuitarSpec(BuilderEnum.PRS, "Dave Navarro Signature", TypeEnum.ELECTRIC,5,
                         WoodEnum.MAHOGANY, WoodEnum.MAPLE)));*/
    }
}