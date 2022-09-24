package willow.train.kuayue.init;

import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willow.train.kuayue.Blocks.*;
import willow.train.kuayue.Main;

import java.util.function.Function;

public class BlockInit {
    //注册机
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;


    public static final RegistryObject<Block> CR_LOGO = register("cr_logo",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties()));
    //25B
    public static final RegistryObject<TrainDoorBlock> PANEL_25B_ORIGINAL_DOOR = register("original_25b_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25b_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_BOTTOM = register("panel_25b_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25b_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_MID = register("panel_25b_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25b_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_WINDOW = register("panel_25b_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25b_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP = register("panel_25b_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP_B = register("panel_25b_original_top_b",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25B_ORIGINAL_TOP = register("slab_25b_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //25G
    public static final RegistryObject<TrainDoorBlock> PANEL_25G_ORIGINAL_DOOR = register("original_25g_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_BOTTOM = register("panel_25g_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_MID = register("panel_25g_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_WINDOW = register("panel_25g_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_TOP = register("panel_25g_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25G_ORIGINAL_TOP = register("slab_25g_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //25K

    public static final RegistryObject<TrainDoorBlock> PANEL_25K_ORIGINAL_DOOR = register("original_25k_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25k_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_BOTTOM = register("panel_25k_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_LINE = register("panel_25k_original_bottom_line",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25k_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_MID = register("panel_25k_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25k_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_WINDOW = register("panel_25k_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25k_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_TOP = register("panel_25k_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25K_ORIGINAL_SYMBOL = register("panel_25k_original_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25BGZK = register("carport_25bgzk",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25K_ORIGINAL_TOP = register("slab_25k_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //25T
    public static final RegistryObject<TrainDoorBlock> PANEL_25T_ORIGINAL_DOOR = register("original_25t_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25t_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_BOTTOM = register("panel_25t_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25t_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_MID = register("panel_25t_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_MID_B = register("panel_25t_original_mid_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_TOP_B = register("panel_25t_original_top_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_BOTTOM_B = register("panel_25t_original_bottom_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //panel_25t_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_WINDOW = register("panel_25t_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25t_original_top
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_TOP = register("panel_25t_original_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TrainPanelBlock> PANEL_XL25T_ORIGINAL_TOP = register("panel_xl25t_original_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_SKIRT = register("panel_25t_original_skirt",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_SKIRT_SIDE = register("panel_25t_original_skirt_side",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25T = register("carport_25t",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25T_ORIGINAL_TOP = register("slab_25t_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //widepanel_bsp25t_original_mid
    public static final RegistryObject<TrainPanelBlock> WIDEPANEL_BSP25T_ORIGINAL_MID = register("widepanel_bsp25t_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //受电弓
    public static final RegistryObject<PantographBlock> PANTOGRAPH = register("pantograph",
            () -> new PantographBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlockHalf> SMOOTH_QUARTZ_PANEL_HALF = register("smooth_quartz_panel_half",
            () -> new PanelBlockHalf(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock4> SMOOTH_QUARTZ_PANEL_4 = register("smooth_quartz_panel_4",
            () -> new PanelBlock4(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock2> SMOOTH_QUARTZ_PANEL_2 = register("smooth_quartz_panel_2",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<AngleBlock22> SMOOTH_QUARTZ_ANGLE_22_UP = register("smooth_quartz_angle_22_up",
            () -> new AngleBlock22(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //粘土板
    public static final RegistryObject<Block> CLAY_SLAB = register("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //clay_stairs
    public static final RegistryObject<StairBlock> CLAY_STAIRS = register("clay_stairs",
            () -> new StairBlock(Blocks.CLAY::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //车棚

    //接触网
    //Catenary_Pole
    public static final RegistryObject<CatenaryPoleBlock> Catenary_Pole = register("catenary_pole",
            () -> new CatenaryPoleBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));
    public static final RegistryObject<CatenaryGridBlock> Catenary_Grid = register("catenary_grid",
            () -> new CatenaryGridBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));
    public static final RegistryObject<SeatedSignalBlock> Station_Entrance_Signal = register("station_entrance_signal",
            () -> new SeatedSignalBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_GROUND)));
    public static final RegistryObject<TrainSignBlock> No_Double_Pantograph = register("no_double_pantograph",
            () -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_GROUND)));



    private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                                                                     final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }


    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
    private static <T extends Block> RegistryObject<T> register2(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        //ITEMS.register(name, item.apply(obj));
        return obj;
    }
}

