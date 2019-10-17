package com.company;

public class DoubleCheckedLocking {
    private volatile static Element element;

    public DoubleCheckedLocking(Element element){
        this.element = element;
    }

    public static Element getElement(String name){
        if(element == null){
            synchronized (Element.class){
                if(element == null) {
                    element = new Element(name);
                }
            }
        }
        return element;
    }
}
