/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ak.Model;

/**
 *
 * @author Admin
 */
public class Data {
    private String name;
    private String weight;
    private String capity;
    private String type;

    public Data() {
    }

    public Data(String name, String weight, String capity, String type) {
        this.name = name;
        this.weight = weight;
        this.capity = capity;
        this.type = type;
    }

    public Data(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCapity() {
        return capity;
    }

    public void setCapity(String capity) {
        this.capity = capity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
