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
public class Piramede extends FiguraGeo3D {

    private double raio;
    private double tamlado;
    private int qtdlado;

    public int getQtdlado() {
        return qtdlado;
    }

    public void setQtdlado(int qtdlado) {
        if(qtdlado < 3)this.qtdlado = qtdlado;
        else this.qtdlado = 3;
    }

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
    
    public Piramede(double raio,double tamlado,int qtdlado, double alt,  Material material, String id) {
        setAlt(alt);
        setRaio(raio);
        setQtdlado(qtdlado);
        setTamlado(tamlado);
        setMaterial(material);
        setId(id);
    }

    public double getTamlado() {
        return tamlado;
    }

    public void setTamlado(double tamlado) {
        if(tamlado > 0) this.tamlado = tamlado;
        else this.tamlado = 0.1;
    }


    
    
    @Override
    public double getVolume() {
        if(qtdlado == 3){
        return (((raio*tamlado)/2)* this.getAlt())/3;       
        }else{    
        return ((((raio*tamlado)/2)*qtdlado)* this.getAlt())/3;
        }     
    }
}
