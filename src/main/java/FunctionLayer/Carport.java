package FunctionLayer;

/**
 *
 * @author Magnus West Madsen
 */
public class Carport {
    
    
    public Carport(boolean Hældning, int CarL, int CarB, int Tagtype, int Taghæld, int RedL, int RedB) {
        this.Hæld = Hældning;
        this.CarL = CarL;
        this.CarB = CarB;
        this.Tagtype = Tagtype;
        this.Taghæld = Taghæld;
        this.RedL = RedL;
        this.RedB = RedB;
    }
    
    
    private boolean Hæld;
    private int CarL;
    private int CarB;
    private int Tagtype;
    private int Taghæld;
    private int RedL;
    private int RedB;

    public boolean isHældning() {
        return Hæld;
    }

    public int getCarL() {
        return CarL;
    }

    public int getCarB() {
        return CarB;
    }

    public int getTagtype() {
        return Tagtype;
    }

    public int getTaghæld() {
        return Taghæld;
    }

    public int getRedL() {
        return RedL;
    }

    public int getRedB() {
        return RedB;
    }

    
    
    
}
