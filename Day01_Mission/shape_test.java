public class shape_test {

    public static void main(String[] args) {
        List<Shape> rect = find_shapes_by_type(Shape.shapes, "사각형");
        System.out.print("사각형 : ");
        System.out.println(rect);
        List<Shape> red_small_shapes = find_shapes_by_color_narea(Shape.shapes, "빨간색", 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(red_small_shapes);
    }

    static List<Shape> find_shapes_by_type(List<Shape> shapes, String type) {
        List<Shape> result = new ArrayList<>();
        for (Shape s : shapes) {
            if (s.getType().equals(type))
                result.add(s);
        }
        return result;
    }

    static List<Shape> find_shapes_by_color_narea(List<Shape> shapes, String color, Double area) {
        List<Shape> result = new ArrayList<>();
        for (Shape s : shapes) {
            if ((s.getColor().equals(color) && s.getArea()) <= area)
                result.add(s);
        }
        return result;
    }
}
