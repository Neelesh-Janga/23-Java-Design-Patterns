package com.neelesh.design.patterns.structural.adapter.classes;

public class English {

    private String content;

    public English() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "English {" +
                "content='" + content + '\'' +
                '}';
    }
}
