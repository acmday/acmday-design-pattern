package com.acmday.design.pattern.server.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class ShapeCache {

    private static Map<String, AbstractShape> shapeMap = new HashMap<>();

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedShape = shapeMap.get(shapeId);
        return (AbstractShape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setName("circle");
        shapeMap.put(circle.getName(), circle);

        Square square = new Square();
        square.setName("square");
        shapeMap.put(square.getName(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        shapeMap.put(rectangle.getName(), rectangle);
    }
}
