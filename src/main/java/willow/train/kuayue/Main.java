package willow.train.kuayue;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import willow.train.kuayue.init.BlockInit;
import willow.train.kuayue.init.ItemInit;
import willow.train.kuayue.tabs.CatenaryTab;
import willow.train.kuayue.tabs.DietTab;
import willow.train.kuayue.tabs.GroundTab;
import willow.train.kuayue.tabs.MainTab;

@Mod("kuayue")
public class Main {


    public static final String MOD_ID = "kuayue";
    public static final MainTab KUAYUE_MAIN = new MainTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(BlockInit.CR_LOGO.get());
        }
    };
    public static final DietTab KUAYUE_DIET = new DietTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemInit.CA_25T.get());
        }
    };
    public static final CatenaryTab KUAYUE_CATENARY = new CatenaryTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() { return new ItemStack(BlockInit.Catenary_Pole.get());}
    };

    public static final GroundTab KUAYUE_GROUND = new GroundTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() { return new ItemStack(BlockInit.Station_Entrance_Signal.get());}
    };


    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        //添加物品，方块的初始化信息
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::clientSetup);
        //KUAYUE_DIET.setBackgroundImage(new ResourceLocation("kuayue","textures/item/ca_25t.png"));
    }
    protected void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25B_ORIGINAL_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25B_ORIGINAL_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25G_ORIGINAL_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25G_ORIGINAL_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25K_ORIGINAL_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25K_ORIGINAL_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25T_ORIGINAL_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WIDEPANEL_BSP25T_ORIGINAL_MID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25T_ORIGINAL_SKIRT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25T_ORIGINAL_SKIRT_SIDE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_25T_ORIGINAL_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANEL_XL25T_ORIGINAL_TOP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CARPORT_25BGZK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CARPORT_25T.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANTOGRAPH.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Catenary_Pole.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Catenary_Grid.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Hang_Catenary_Grid.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Station_Entrance_Signal.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Shunting_Signal.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.No_Double_Pantograph.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Switch_Off_Sign.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Switch_On_Sign.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Signal_Pole.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Signal_Pole_Light.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.Concrete_Pole.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.TactilePavingStraight.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.TactilePavingPin.get(),RenderType.translucent());
        //test text
    }
    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
    }

}