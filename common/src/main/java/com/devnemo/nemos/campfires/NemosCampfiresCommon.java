package com.devnemo.nemos.campfires;

import com.devnemo.nemos.campfires.world.item.NemosCampfiresCreativeModeTabs;
import com.devnemo.nemos.campfires.world.item.NemosCampfiresItems;
import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;

public class NemosCampfiresCommon {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Campfires");

        NemosCampfiresBlocks.init();
        NemosCampfiresItems.init();
        NemosCampfiresCreativeModeTabs.init();
    }
}