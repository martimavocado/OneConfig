package io.polyfrost.oneconfig.test;

import io.polyfrost.oneconfig.config.annotations.ConfigPage;
import io.polyfrost.oneconfig.config.annotations.Option;
import io.polyfrost.oneconfig.config.data.Mod;
import io.polyfrost.oneconfig.config.data.ModType;
import io.polyfrost.oneconfig.config.data.OptionType;
import io.polyfrost.oneconfig.config.data.PageLocation;
import io.polyfrost.oneconfig.config.interfaces.Config;

public class TestConfig extends Config {

    @Option(
            name = "Test dual thing",
            subcategory = "Test",
            min = 3f, max = 127f,
            type = OptionType.SLIDER
    )
    public static float sliderText;

    @Option(
            name = "Test string",
            subcategory = "Test",
            options = {"NO", "YES"},
            type = OptionType.DUAL_OPTION
    )
    public static boolean switchTest1;

    @Option(
            name = "Test dual option",
            subcategory = "Test",
            options = {"HI", "BYE"},
            type = OptionType.DUAL_OPTION
    )
    public static boolean switchTest2;


    @Option(
            name = "Test option",
            subcategory = "Test",
            options = {"Hello", "World", "Fish", "Cat"},
            type = OptionType.UNI_SELECTOR
    )
    public static int switchTest3;

    @ConfigPage(
            name = "Test Page",
            location = PageLocation.TOP
    )
    public static TestPage testPage = new TestPage();

    @ConfigPage(
            name = "Test Page width description",
            description = "Wow, an epic description",
            location = PageLocation.BOTTOM
    )
    public static TestPage testPage2 = new TestPage();

    @Option(
            name = "Test switch",
            subcategory = "Other subcategory",
            type = OptionType.SWITCH
    )
    public static boolean switchTest4;

    @Option(
            name = "Test switch",
            subcategory = "Other subcategory",
            type = OptionType.SWITCH
    )
    public static boolean switchTest5;

    @Option(
            name = "Test check",
            subcategory = "Other subcategory",
            type = OptionType.CHECKBOX
    )
    public static boolean switchTest6;

    public TestConfig() {
        super(new Mod("hacks", ModType.UTIL_QOL, "ShadyDev", "1.0"), "hacksConfig.json");
    }
}

