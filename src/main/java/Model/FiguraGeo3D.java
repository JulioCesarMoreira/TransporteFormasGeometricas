package Model;

/**
 * @author Julio Cesar Paes Moreira
 */
public abstract class FiguraGeo3D {

   // protected double alt;   ela manda o valor pela herança e não pelos geters and seters
    private double alt;
    private Material material;
    private String id;

    abstract public double getVolume();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!"".equals(id)) {
            this.id = id;
        } else {
            this.id = "não definido";
        }
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        if (alt > 0) {
            this.alt = alt;
        } else {
            this.alt = 0.1;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public double getPeso(){
        return this.getVolume() * this.material.getDensity();
    }

    @Override
    public String toString() {
        return  id;
    }
    
}
