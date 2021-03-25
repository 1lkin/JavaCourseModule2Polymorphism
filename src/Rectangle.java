/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.util.Objects;

/**
 * IKIN HASANOV's response to Homework "Polymorphism", Module 2.
 *
 *   Task:
 *      Create and implement  two interfaces for your class
 *
 * @version 1.10
 * @Since 25-03-2021  22:46
 * @class Rectangle
 * @author Ilkin Hasanov
 */
public class Rectangle implements IGeometry, IPacking{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length >= 0) ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 0) ? width : 0;
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    public boolean isSquare() {
        if (this.getLength() == this.getWidth()) {
            return true;
        } else { return false;}
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getLength(),2)
                + Math.pow(this.getWidth(),2));
    }

    @Override
    public double getPerimeter() {
        return (this.getLength() + this.getWidth()) * 2;
    }

    public String wideOrTall() {
        if (this.getWidth() > this.getLength()) {
            return "wide";
        } else if (this.getWidth() < this.getLength()) {
            return "tall";
        } else {
            return "square";
        }
    }

    @Override
    public String toString() {
        return "inheritance.Rectangle\n===========================\n" +
                "||\tlength:\t\t" + this.getLength() +
                "\n||\twidth:\t\t" + this.getWidth() +
                "\n||\tperimeter:\t" + this.getPerimeter() +
                "\n||\tarea:\t\t" + this.getArea() +
                "\n||\tdiagonal:\t" + this.getDiagonal() +
                "\n||\tsquare:\t\t" + this.isSquare() +
                "\n===========================\n";
    }
    public String toString(String name){
        return name +
                "length=" + this.getLength() +
                ", width=" + this.getWidth() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getLength(), getLength()) == 0 &&
                Double.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toJSON() {
        String json = "{length: " + this.getLength() +
                ", width: " + this.getWidth() +
                ", diagonal: " + this.getDiagonal() +
                ", perimeter: " + this.getPerimeter() +
                ", area: " + this.getArea() + "};";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<length>" + this.getLength() + "</length>" +
                "<width>" + this.getWidth() + "<width>" +
                "<diagonal>" + this.getDiagonal() + "</diagonal>" +
                "<perimeter>" + this.getPerimeter() + "</perimmeter>" +
                "<area>" + this.getArea() + "</area>";
        return xml;
    }
}