/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.vo;

/**
 *
 * @author mmedina
 */
public class OutputElementVO {
    
    private Integer numberOne;
    private Integer numberTwo;

    public OutputElementVO(Integer numberOne, Integer numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    
    public Integer getXORResult() {
        return numberOne ^ numberTwo;
    }
}
