package com.gmail.rishabh23jain.isnotes;

/**
 * Created by ST7 on 8/26/2017.
 */

public class Note
{
    private int id;
    private String title="";
    private String description="";

    public Note(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
