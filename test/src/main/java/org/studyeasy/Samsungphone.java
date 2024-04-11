package org.studyeasy;

public class Samsungphone implements phone,Android {
    public String processor(){
        return "SD888";
    }

    @Override
    public int SpaceInGb() {
        return 256;
    }

    public String whatsapp(){
        return "send and recieve msg in android";
    }
}
