/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 *
 */
public class rectangle {
    private int length;
    private int breadth;
    private int area;
    rectangle(int length,int breadth){
       this.length=length;
       this.breadth=breadth;
       area=length*breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "rectangle{" + "length=" + length + ", breadth=" + breadth + ", area=" + area + '}';
    }


    
}
