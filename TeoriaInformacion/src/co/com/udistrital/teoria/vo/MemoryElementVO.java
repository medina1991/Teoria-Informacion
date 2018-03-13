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
public class MemoryElementVO {
    
    private Integer state;
    private Integer nextState;

    public MemoryElementVO() {
    }

    public MemoryElementVO(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNextState() {
        return nextState;
    }

    public void setNextState(Integer nextState) {
        this.nextState = nextState;
    }
}
