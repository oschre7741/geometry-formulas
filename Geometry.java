/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{   
    // area
    /**
     * Calculates the area of a trapezoid.
     *
     * @param base1  base1 of base of trapezoid
     * @param base2  base2 of base of trapezoid
     * @param height  height of the trapezoid
     * @return   area of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height) 
    {
        return (base1 + base2)/2.0 * height;
    }
    
    /**
     * Calculates the area of a parallelogram.
     *
     * @param base  base of base of parallelogram
     * @param height  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double base, double height) 
    {
        return base * height;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param base base of base of triangle
     * @param height height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param a leg of triangle
     * @param b leg of the triangle
     * @param c hypotenuse of the triangle
     * @return   area of the triangle
     */
    public static double triangleHeronsArea(double a, double b, double c) 
    {
        double S = a + b + c / 2.0;
        
        double area = Math.sqrt(S * ((S - a) * (S - b) * (S - c)));
        
        return area;
    }
    
    // volume
    /**
     * Calculates the volume of a sphere.
     *
     * @param radius  radius of the sphere
     * @return   volume of the sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param width  width of rectangular prism
     * @param height  height of the rectangular prism
     * @param length  length of the rectangular prism
     * @return   volume of the rectangular prism
     */
    public static double rpVolume(double width, double height, double length) 
    {
        return width * height * length;
    }
    
    /**
     * Calculates the volume of a cone.
     *
     * @param radius  radius of the cone
     * @param height  height of the cone
     * @return   volume of the cone
     */
    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * Math.pow(radius, 2) * height / 3.0;
    }
    
    // surface area
    /**
     * Calculates the surface area of a rectangular prism.
     *
     * @param width  width of rectangular prism
     * @param height  height of the rectangular prism
     * @param length  length of the rectangular prism
     * @return   surface area of the rectangular prism
     */
    public static double rpSA(double width, double height, double length) 
    {
        return 2.0 * ((width * height) + (height * length) + (width * length));
    }
    
    /**
     * Calculates the surface area of a sphere.
     *
     * @param radius  radius of the sphere
     * @return   surface area of the sphere
     */
    public static double sphereSA(double radius) 
    {
        return 4.0  * Math.PI * Math.pow(radius, 2);
    }
    
    // hypotenuse
    /**
     * Calculates the hypotenuse of a triange.
     *
     * @param a  one leg of the triangle
     * @param b  one leg of the triangle
     * @return   hypotenuse(c) of the triangle
     */
    public static double triangleHypotenuse(double a, double b) 
    {
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        return hypotenuse;
    }
    
    //distance
    /** 
     * Calculates distance between two points
     * 
     * @param x1  x of first point
     * @param x2  x of second point
     * @param y1  y of first point
     * @param y2  y of second point
     * @return    distance
     */
    public static double distanceFormula(double x1, double x2, double y1, double y2)
    {
        double distance = Math.sqrt((Math.pow((Math.pow(x2, 2) - Math.pow(x1, 2)), 2)) + (Math.pow((Math.pow(y2, 2) - Math.pow(y1, 2)), 2)));
        
        return distance;
    }
    
    //slope 
    /**
     * Calculates the slope between two points
     * 
     * @param x1  x of first point
     * @param x2  x of second point
     * @param y1  y of first point
     * @param y2  y of second point
     * @return    slope
     */
    public static double slopeFormula(double x1, double x2, double y1, double y2)
    {
        double slope = (x2 - x1)/(y2 - y1);
        
        return slope;
    }
    
    public static void main(String[] args) 
    {
        double ta1 = trapezoidArea(4, 8, 12);
        double pa = parallelogramArea(4, 8);
        double ta2 = triangleArea(4, 8);
        double ta3 = triangleHeronsArea(4, 8, 12);
        double sv = sphereVolume(4);
        double rpv = rpVolume(4, 8, 12);
        double cv = coneVolume(4, 8);
        double rps = rpSA(4, 8, 12);
        double ssa = sphereSA(4);
        double th = triangleHypotenuse(4, 8);
        double df = distanceFormula(4, 8, 12, 16);
        double sf = slopeFormula(4, 8, 12, 16);
        
        System.out.println(ta1);
        System.out.println(pa);
        System.out.println(ta2);
        System.out.println(ta3);
        System.out.println(sv);
        System.out.println(rpv);
        System.out.println(cv);
        System.out.println(rps);
        System.out.println(ssa);
        System.out.println(th);
        System.out.println(df);
        System.out.println(sf);
    }
}
