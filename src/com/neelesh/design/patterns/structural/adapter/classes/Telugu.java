package com.neelesh.design.patterns.structural.adapter.classes;

public class Telugu {
    private String content;

    public Telugu() {
    }

    public Telugu(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Telugu {" +
                "content='" + content + '\'' +
                '}';
    }
}
