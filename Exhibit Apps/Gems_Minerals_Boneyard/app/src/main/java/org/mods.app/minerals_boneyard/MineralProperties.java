package org.mods.app.minerals_boneyard;

import java.io.File;

public class MineralProperties {
    String mineralName;
    String Info;
    File image;

    public MineralProperties(String name,String info, String imageLocation){
        this.mineralName=name;
        this.Info=info;
        this.image= new File(imageLocation);

    }
}
