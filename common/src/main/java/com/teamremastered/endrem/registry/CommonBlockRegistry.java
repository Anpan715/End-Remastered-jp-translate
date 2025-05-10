package com.teamremastered.endrem.registry;

import com.teamremastered.endrem.block.AncientPortalFrame;
import com.teamremastered.endrem.block.AncientPortalFrameEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CommonBlockRegistry {
    private static final List<ERRegistryObject<Block>> BLOCKS = new ArrayList<>();
    public static final Block ANCIENT_PORTAL_FRAME = createBlock(new AncientPortalFrame(), "ancient_portal_frame");
    public static final BlockEntityType<AncientPortalFrameEntity> ANCIENT_PORTAL_FRAME_ENTITY =
            new BlockEntityType<>(AncientPortalFrameEntity::new, Set.of(ANCIENT_PORTAL_FRAME));

    public static Block createBlock(Block block, String id) {
        BLOCKS.add(new ERRegistryObject<>(block, id));
        return block;
    }

    public static Collection<ERRegistryObject<Block>> registerERBlocks() {
        return BLOCKS;
    }
}

