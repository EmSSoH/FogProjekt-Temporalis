package FunctionLayer;

/**
 *
 * @author Magnus West Madsen
 */
public class Carport {
    
    
    public Carport(int CarL, int CarB, int Tagtype, int Taghæld, int RedL, int RedB) {
        this.CarL = CarL;
        this.CarB = CarB;
        this.Tagtype = Tagtype;
        this.Taghæld = Taghæld;
        this.RedL = RedL;
        this.RedB = RedB;
    }

    public Carport(int predef_id, int CarL, int CarB, int Tagtype, int Taghæld, int RedL, int RedB) {
        this.predef_id = predef_id;
        this.CarL = CarL;
        this.CarB = CarB;
        this.Tagtype = Tagtype;
        this.Taghæld = Taghæld;
        this.RedL = RedL;
        this.RedB = RedB;
    }
    
    
    
    private int predef_id;
    private int CarL;
    private int CarB;
    private int Tagtype;
    private int Taghæld;
    private int RedL;
    private int RedB;
    

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

    public int getPredef_id() {
        return predef_id;
    }

    
    
    
}
