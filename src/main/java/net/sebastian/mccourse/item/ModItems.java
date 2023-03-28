package net.sebastian.mccourse.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sebastian.mccourse.MCCourseMod;
import net.sebastian.mccourse.block.custom.SpeedyBlock;
import net.sebastian.mccourse.item.custom.CoalSilverItem;
import net.sebastian.mccourse.item.custom.DowsingRodItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> SAD_KAYLA_INGOT = ITEMS.register("sad_kayla_ingot",
            () -> new Item(new Item.Properties().food(Foods.CARROT).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> KAYLA_POTATO = ITEMS.register("kayla_potato",
            () -> new Item(new Item.Properties().food(Foods.POTATO).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> HASTE_APPLE = ITEMS.register("haste_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 500, 2), 100f)
                            .build())));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).durability(16)));

    public static final RegistryObject<Item> COAL_SILVER = ITEMS.register("coal_silver",
            () -> new CoalSilverItem(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).durability(16)));

    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new CoalSilverItem(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).food(ModFoods.TURNIP)));

    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(ModTiers.COBALT,  2 , 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModTiers.COBALT,  2 , 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(ModTiers.COBALT,  2 , 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModTiers.COBALT,  2 , 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ModTiers.COBALT,  2 , 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
