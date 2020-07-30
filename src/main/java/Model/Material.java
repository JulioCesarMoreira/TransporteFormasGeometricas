/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author deinfo
 */
public class Material {
    private String matName;
    private double density;

    public Material(String matName, double density) {
        this.matName = matName;
        setDensity(density);
    }
    
    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        if (density > 0) this.density = density;
        else this.density = 0.1;
    }

    @Override
    public String toString() {
        return matName;
    }
}
