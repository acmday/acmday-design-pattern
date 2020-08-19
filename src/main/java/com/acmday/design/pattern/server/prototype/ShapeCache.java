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
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
