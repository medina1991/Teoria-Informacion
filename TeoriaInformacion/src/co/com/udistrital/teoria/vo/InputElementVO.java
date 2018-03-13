/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.vo;

import java.util.List;

/**
 *
 * @author mmedina
 */
public class InputElementVO {
    
    private List<Integer> inputs;

    public InputElementVO(List<Integer> inputs) {
        this.inputs = inputs;
    }

    public List<Integer> getInputs() {
        return inputs;
    }

    public void setInputs(List<Integer> inputs) {
        this.inputs = inputs;
    }
}
