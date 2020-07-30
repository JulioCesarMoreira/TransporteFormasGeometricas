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
public class Paralelepipedo extends FiguraGeo3D {
//sempre os atributos são privados para o acesso ser feito pelos getrs and seters

    private double larg;
    private double prof;

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        if (larg > 0) {
            this.larg = larg;
        } else {
            this.larg = 0.1;
        }
    }

    public double getProf() {
        return prof;
    }

    public void setProf(double prof) {
        if (prof > 0) {
            this.prof = prof;
        } else {
            this.prof = 0.1;
        }
    }

    public Paralelepipedo(double larg, double prof, double alt, Material material, String id) {
        setLarg(larg);
        setProf(prof);
        setAlt(alt);
        setMaterial(material);
        setId(id);
    }

    @Override
    public double getVolume() {
    return larg * prof * this.getAlt();
    }

}
