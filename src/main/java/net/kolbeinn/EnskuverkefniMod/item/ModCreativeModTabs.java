package net.kolbeinn.EnskuverkefniMod.item;

import net.kolbeinn.EnskuverkefniMod.EnskuverkefniMod;
import net.kolbeinn.EnskuverkefniMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnskuverkefniMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Enskuverkefni_Tab = CREATIVE_MODE_TABS.register("enskuverkefni_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WALTER.get()))
                    .title(Component.translatable("creativetab.enskuverkefni_tab"))
                    .displayItems((pParameters, pOutput) -> {
                     pOutput.accept(ModItems.SWORD.get());
                     pOutput.accept(ModItems.WALTER.get());
                     pOutput.accept(ModBlocks.WEAPON_WORKBENCH.get());
                     pOutput.accept(ModBlocks.SIGURJON.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
