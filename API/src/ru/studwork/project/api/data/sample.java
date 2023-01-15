package ru.studwork.project.api.data;

import java.io.Serializable;


public class sample implements Serializable {
    private String id;
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

    public void setPaleoaleo(String paleo) {
        this.paleo = paleo;
    }

}

