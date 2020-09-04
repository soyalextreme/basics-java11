public class Functions {
    public static void main(String[] args) {

        Circle circleX = new Circle(40, "diameter");
        // default uses typeVal radius
        Circle circleY = new Circle(20);
        float resAreaCircle = circleX.calculateArea();
        float resAreaSphere = circleX.calculateSphereVol();
        System.out.println("Area de Circulox: " + resAreaCircle);
        System.out.println("Area de Esferax(vol): " + resAreaSphere);
        System.out.println("Area del CirculoY: " + circleY.calculateArea());
        System.out.println("Area del SphereY: " + circleY.calculateSphereVol());
    }
}


/**
 * Creates a circle for Area Circle or considering the same values a sphere Area
 * @author Alejandro AS
 * */
class Circle {
    private float val;
    private final String typeVal;

    /**
     * The simplest constructor just takes the default type which is radius
     * @param  val Value of the radius
     * @author Alejandro AS
     * */
    Circle(float val) {
        this.val = val;
        this.typeVal = "radius";
    }

    /**
     *  Constructor that includes de diameter type value in the class
     * @param val Value of the radius
     * @param typeVal The type of the value just accepts diameter or radius Default is radius
     * @author Alejandro AS
     *  */
    Circle(float val, String typeVal) {
        if (!typeVal.equals("radius") && !typeVal.equals("diameter")) {
            typeVal = "radius";
        }
        this.val = val;
        this.typeVal = typeVal;
    }

    /**
     * Returns the area of the class Circle, taking in consideration the typeVal
     * @return res the final area of the circle
     * @author Alejandro AS
     * */
    public float calculateArea() {
        float res = 0;
        switch (typeVal) {
            case "radius":
                res = (float) (Math.PI * Math.pow(val, 2));
                break;
            case "diameter":
                val /= 2;
                res = (float) (Math.PI * Math.pow(val, 2));
                break;
        }
        if(res == 0){
            System.out.println("May happened an error | you're using 0 value don't troll ");
        }
        return res;
    }

    /** Returns the area of sphere of the class Circle, taking in consideration the typeVal
     * @return res the final area of the sphere considering the same units
     * @author Alejandro AS
     * */
    public float calculateSphereVol(){
        float res = 0;
        switch (typeVal) {
            case "radius":
                res = (float) (4 * Math.PI * Math.pow(val, 2));
                break;
            case "diameter":
                val /= 2;
                res = (float) (4 * Math.PI * Math.pow(val, 2));
                break;
        }
        if(res == 0){
            System.out.println("May happened an error | you're using 0 value don't troll ");
        }
        return res;
    }
}
