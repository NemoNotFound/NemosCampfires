package com.nemonotfound.nemos.campfires;

import com.nemonotfound.nemos.campfires.world.item.NemosCampfiresCreativeModeTabs;
import com.nemonotfound.nemos.campfires.world.item.NemosCampfiresItems;
import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;

public class NemosCampfiresCommon {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Campfires");

        NemosCampfiresBlocks.init();
        NemosCampfiresItems.init();
        NemosCampfiresCreativeModeTabs.init();
    }
}