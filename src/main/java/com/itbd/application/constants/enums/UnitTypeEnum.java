package com.itbd.application.constants.enums;

public enum UnitTypeEnum {
    METERS("m"),
    FEET("ft"),
    INCHES("in"),
    CENTIMETERS("cm"),
    MILLIMETERS("mm"),
    KILOMETERS("km"),
    MILES("mi"),
    YARDS("yd"),
    NAUTICAL_MILES("nmi"),
    ACRES("ac"),
    HECTARES("ha"),
    SQUARE_METERS("m²"),
    SQUARE_FEET("ft²"),
    SQUARE_INCHES("in²"),
    SQUARE_CENTIMETERS("cm²"),
    SQUARE_MILLIMETERS("mm²"),
    SQUARE_KILOMETERS("km²"),
    SQUARE_MILES("mi²"),
    SQUARE_YARDS("yd²"),
    SQUARE_NAUTICAL_MILES("nmi²"),
    SQUARE_ACRES("ac²"),
    SQUARE_HECTARES("ha²"),
    CUBIC_METERS("m³"),
    CUBIC_FEET("ft³"),
    CUBIC_INCHES("in³"),
    CUBIC_CENTIMETERS("cm³"),
    CUBIC_MILLIMETERS("mm³"),
    CUBIC_YARDS("yd³"),
    CUBIC_MILES("mi³"),
    // BEGIN: be15d9bcejpp
    MILLIGRAMS("mg"),
    GRAMS("g"),
    KILOGRAMS("kg"),
    METRIC_TONNES("t"),
    OUNCES("oz"),
    POUNDS("lb"),
    STONES("st"),
    TONNES("ton"),
    LITERS("L"),
    MILLILITERS("mL"),
    CUBIC_NAUTICAL_MILES("nmi³"),
    CUBIC_ACRES("ac³"),
    CUBIC_HECTARES("ha³"),
    GALLONS("gal"),
    QUARTS("qt"),
    PINTS("pt"),
    CUPS("cup"),
    FLUID_OUNCES("fl oz"),
    TABLESPOONS("tbsp"),
    TEASPOONS("tsp"),
    KILOJOULES("kJ"),
    CALORIES("cal"),
    KILOCALORIES("kcal"),
    WATTS("W"),
    KILOWATTS("kW"),
    MEGAWATTS("MW"),
    GIGAWATTS("GW"),
    HORSEPOWER("hp"),
    BTU("BTU"),
    KILOBTU("kBTU"),
    MEGABTU("MBTU"),
    GIGABTU("GBTU"),
    KILOJOULES_PER_KILOGRAM("kJ/kg"),
    CALORIES_PER_GRAM("cal/g"),
    KILOCALORIES_PER_GRAM("kcal/g"),
    WATTS_PER_SQUARE_METER("W/m²"),
    KILOWATTS_PER_SQUARE_METER("kW/m²"),
    MEGAWATTS_PER_SQUARE_METER("MW/m²"),
    GIGAWATTS_PER_SQUARE_METER("GW/m²"),
    BTU_PER_SQUARE_FOOT("BTU/ft²"),
    KILOBTU_PER_SQUARE_FOOT("kBTU/ft²"),
    MEGABTU_PER_SQUARE_FOOT("MBTU/ft²"),
    GIGABTU_PER_SQUARE_FOOT("GBTU/ft²"),
    KILOJOULES_PER_CUBIC_METER("kJ/m³"),
    CALORIES_PER_CUBIC_CENTIMETER("cal/cm³"),
    KILOCALORIES_PER_CUBIC_CENTIMETER("kcal/cm³"),
    WATTS_PER_CUBIC_METER("W/m³"),
    KILOWATTS_PER_CUBIC_METER("kW/m³"),
    MEGAWATTS_PER_CUBIC_METER("MW/m³"),
    GIGAWATTS_PER_CUBIC_METER("GW/m³"),
    BTU_PER_CUBIC_FOOT("BTU/ft³"),
    KILOBTU_PER_CUBIC_FOOT("kBTU/ft³"),
    MEGABTU_PER_CUBIC_FOOT("MBTU/ft³"),
    GIGABTU_PER_CUBIC_FOOT("GBTU/ft³"),
    KILOJOULES_PER_KILOGRAM_KELVIN("kJ/(kg·K)"),
    CALORIES_PER_GRAM_CELSIUS("cal/(g·°C)"),
    KILOCALORIES_PER_GRAM_CELSIUS("kcal/(g·°C)"),
    WATTS_PER_SQUARE_METER_KELVIN("W/(m²·K)"),
    KILOWATTS_PER_SQUARE_METER_KELVIN("kW/(m²·K)"),
    MEGAWATTS_PER_SQUARE_METER_KELVIN("MW/(m²·K)"),
    GIGAWATTS_PER_SQUARE_METER_KELVIN("GW/(m²·K)"),
    BTU_PER_SQUARE_FOOT_HOUR_FAHRENHEIT("BTU/(ft²·h·°F)"),
    KILOBTU_PER_SQUARE_FOOT_HOUR_FAHRENHEIT("kBTU/(ft²·h·°F)"),
    MEGABTU_PER_SQUARE_FOOT_HOUR_FAHRENHEIT("MBTU/(ft²·h·°F)"),
    GIGABTU_PER_SQUARE_FOOT_HOUR_FAHRENHEIT("GBTU/(ft²·h·°F)"),
    KILOJOULES_PER_KILOGRAM_HOUR("kJ/(kg·h)"),
    CALORIES_PER_GRAM_HOUR("cal/(g·h)"),
    KILOCALORIES_PER_GRAM_HOUR("kcal/(g·h)"),
    WATTS_PER_SQUARE_METER_HOUR("W/(m²·h)"),
    KILOWATTS_PER_SQUARE_METER_HOUR("kW/(m²·h)"),
    MEGAWATTS_PER_SQUARE_METER_HOUR("MW/(m²·h)"),
    GIGAWATTS_PER_SQUARE_METER_HOUR("GW/(m²·h)"),
    BTU_PER_SQUARE_FOOT_HOUR("BTU/(ft²·h)"),
    KILOBTU_PER_SQUARE_FOOT_HOUR("kBTU/(ft²·h)"),
    MEGABTU_PER_SQUARE_FOOT_HOUR("MBTU/(ft²·h)"),
    GIGABTU_PER_SQUARE_FOOT_HOUR("GBTU/(ft²·h)"),
    KILOJOULES_PER_KILOGRAM_SECOND("kJ/(kg·s)"),
    CALORIES_PER_GRAM_SECOND("cal/(g·s)"),
    KILOCALORIES_PER_GRAM_SECOND("kcal/(g·s)"),
    WATTS_PER_SQUARE_METER_SECOND("W/(m²·s)"),
    KILOWATTS_PER_SQUARE_METER_SECOND("kW/(m²·s)"),
    MEGAWATTS_PER_SQUARE_METER_SECOND("MW/(m²·s)"),
    GIGAWATTS_PER_SQUARE_METER_SECOND("GW/(m²·s)"),
    BTU_PER_SQUARE_FOOT_SECOND("BTU/(ft²·s)"),
    KILOBTU_PER_SQUARE_FOOT_SECOND("kBTU/(ft²·s)"),
    MEGABTU_PER_SQUARE_FOOT_SECOND("MBTU/(ft²·s)"),
    GIGABTU_PER_SQUARE_FOOT_SECOND("GBTU/(ft²·s)");

    private String abbreviation;

    UnitTypeEnum(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }
}
