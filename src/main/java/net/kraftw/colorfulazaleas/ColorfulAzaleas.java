package net.kraftw.colorfulazaleas;

import net.kraftw.colorfulazaleas.decorators.*;
import net.kraftw.colorfulazaleas.registry.*;
import net.fabricmc.api.*;
import net.kraftw.colorfulazaleas.decorators.ColorfulTreeDecorator;
import net.kraftw.colorfulazaleas.registry.AzaleaBlocks;
import net.kraftw.colorfulazaleas.registry.ColorfulAzaleasItemGroups;
import net.minecraft.core.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.level.levelgen.feature.treedecorators.*;
import org.slf4j.*;

public class ColorfulAzaleas implements ModInitializer {
    public static final String MOD_ID = "colorfulazaleas";
    public static final String MOD_NAME = "Colorful Azaleas";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static final TreeDecoratorType<ColorfulTreeDecorator> COLORFUL_TREE_DECORATOR = Registry.register(BuiltInRegistries.TREE_DECORATOR_TYPE, id("colorful_tree_decorator"), new TreeDecoratorType<>(ColorfulTreeDecorator.CODEC));

    @Override
    public void onInitialize() {
        AzaleaBlocks.init();
        ColorfulAzaleasItemGroups.register();
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

}