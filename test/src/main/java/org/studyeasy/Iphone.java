package org.studyeasy;

public class Iphone implements phone,Ios {
    public String processor(){
        return "a15";
    }
    public int SpaceInGb(){
        return 128;
    }


    @Override
    public String Airdrop() {
        return "send and recieve msgs in apple";
    }
}




