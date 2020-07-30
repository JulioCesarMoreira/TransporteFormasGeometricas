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
public class Cone extends FiguraGeo3D {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            this.raio = 0.1;
        }
    }
    
    public Cone(double raio, double alt,  Material material, String id) {
        setAlt(alt);
        setRaio(raio);
        setMaterial(material);
        setId(id);
    }
   
    
    
    @Override
    public double getVolume() {
    return (Math.pow(raio,2) * Math.PI * this.getAlt())/3;
    }     
}

