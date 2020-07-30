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
public class Esfera extends FiguraGeo3D {

    public Esfera(double alt, Material material, String id) {
        setAlt(alt);
        setMaterial(material);
        setId(id);
    }

    @Override
    public double getVolume() {
        return (4*Math.pow(this.getAlt()/2, 3) * Math.PI)/3;
    }
}
