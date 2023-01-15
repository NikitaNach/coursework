package ru.studwork.project.data;

import java.io.Serializable;


public class Sample implements Serializable {
    private String id;
    private int numbername;
    private String texture;
    private String structure;
    private String composition;
    private String paleo;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNumbername() {
        return numbername;
        //CODENAME FOR SAMPLE( ******,01-10 BRIGADE NUMB+01-20 AREA NUMB+01-99 SERIAL NUMBER)
    }

    public void setNumbername(String numbername) {
        this.numbername = numbername;
    }

    public String getTexture() {
        return texture;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getPaleo() {
        return paleo;
    }

    public void setPaleo(String paleo) {
        this.paleo = paleo;
    }
}

