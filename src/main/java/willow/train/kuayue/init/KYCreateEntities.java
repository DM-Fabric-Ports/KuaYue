package willow.train.kuayue.init;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.logistics.trains.BogeyTileEntityRenderer;
import com.simibubi.create.content.logistics.trains.track.StandardBogeyTileEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import willow.train.kuayue.Blocks.Entities.BogeyEntities.DF11GBogeyTileEntity;
import willow.train.kuayue.Blocks.Entities.DF11GFrontTileEntity;
import willow.train.kuayue.Blocks.Supplier.FakeDF11GBogeyInstance;
import willow.train.kuayue.Main;
import willow.train.kuayue.renderer.DF11GTileEntityRenderer;
import willow.train.kuayue.renderer.FakeDF11GBogeyRenderer;

public class KYCreateEntities {
    public static final BlockEntityEntry<DF11GFrontTileEntity> DF11G_FRONT = Main.registrate()
            .tileEntity("df11g_front_block", DF11GFrontTileEntity::new)
            //.instance(() -> DF11GFrontInstance::new)
            .validBlocks(AllBlocks.MECHANICAL_CRAFTER)
            .renderer(() -> DF11GTileEntityRenderer::new)
            .register();
    public static final BlockEntityEntry<StandardBogeyTileEntity> DF11G_BOGEY = Main.registrate()
            .tileEntity("df11g_bogey", StandardBogeyTileEntity::new)
            .renderer(() -> BogeyTileEntityRenderer::new)
            .validBlocks(KYCreateBlock.DF11G_BOGEY)
            .register();



    public static final BlockEntityEntry<DF11GBogeyTileEntity> fake_DF11G_BOGEY = Main.registrate()
            .tileEntity("fake_bogey", DF11GBogeyTileEntity::new)
            .instance(() -> FakeDF11GBogeyInstance::new, false)
            .validBlocks(KYCreateBlock.fake_DF11G_BOGEY)
            .renderer(() -> FakeDF11GBogeyRenderer::new)
            .register();

    public static void register() {
    }
//    public static final BlockEntityEntry<SteamEngineTileEntity> STEAM_ENGINE = Create.registrate()
//            .tileEntity("steam_engine", SteamEngineTileEntity::new)
//            .validBlocks(AllBlocks.STEAM_ENGINE)
//            .renderer(() -> SteamEngineRenderer::new)
//            .register();
}
