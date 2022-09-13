package willow.train.kuayue.init;

import com.google.common.base.Supplier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import willow.train.kuayue.Main;
//import willow.train.kuayue.init.ItemPreAttack;
import willow.train.kuayue.Items.foods.Food1;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    //注册机
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Main.MOD_ID);
    public static final RegistryObject<Item> CA_25T = register("ca_25t",
            () -> new Item(new Item.Properties()
                    //.tab(Main.KUAYUE_DIET)
            ));
    //火车餐1
    public static final RegistryObject<Item> TRAIN_DIET_1 = ITEMS.register("train_diet_1",
            () -> new Food1(new Item.Properties().tab(Main.KUAYUE_DIET).food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(2.5F).
                    effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1000, 0,false,true), 1.0F).
                    effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1000, 0,false,true), 1.0F).
                    alwaysEat().alwaysEat().build())));
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }

}