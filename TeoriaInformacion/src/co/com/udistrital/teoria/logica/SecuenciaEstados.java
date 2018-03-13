/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.logica;

import co.com.udistrital.teoria.vo.InputElementVO;
import co.com.udistrital.teoria.vo.MemoryElementVO;
import co.com.udistrital.teoria.vo.OutputElementVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mmedina
 */
public class SecuenciaEstados {

    private List<OutputElementVO> listOutput;
    private List<MemoryElementVO> listMemoryElement;

    public SecuenciaEstados() {
        listOutput = new ArrayList<>();
        listMemoryElement = new ArrayList<>();
    }

    public List<OutputElementVO> getListOutput() {
        return listOutput;
    }

    public void setListOutput(List<OutputElementVO> listOutput) {
        this.listOutput = listOutput;
    }

    public List<MemoryElementVO> getListMemoryElement() {
        return listMemoryElement;
    }

    public void setListMemoryElement(List<MemoryElementVO> listMemoryElement) {
        this.listMemoryElement = listMemoryElement;
    }

    public static void main(String[] args) {
        String input = "01";
        String responseHead = "E\t";
        String responseBody = "";
        SecuenciaEstados admin = new SecuenciaEstados();

        // Elemento de la maquina de estados
        InputElementVO inputs = new InputElementVO(new ArrayList<>());
        admin.getListMemoryElement().add(new MemoryElementVO(0));
        admin.getListMemoryElement().add(new MemoryElementVO(0));
//        admin.getListMemoryElement().add(new MemoryElementVO(0));

        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            inputs.getInputs().add(Integer.parseInt("" + aChar));
        }

        // Definiendo Cabecera
        for (int i = 0; i < admin.getListMemoryElement().size(); i++) {
            responseHead += "M" + (i + 1) + "\t";
        }
        for (int i = 0; i < admin.getListMemoryElement().size(); i++) {
            responseHead += "M" + (i + 1) + "+\t";
        }
        for (int i = 0; i < admin.getListMemoryElement().size(); i++) {
            responseHead += "S" + (i + 1) + "\t";
        }

        Integer numberStates = (int) Math.pow(2, admin.getListMemoryElement().size());
        System.out.println("States: " + numberStates);
        // Construyendo Maquina de Estados
        int cont = 0;
        for (int a = 0; a < numberStates; a++) {
            Integer in = inputs.getInputs().get(cont);
            responseBody += in + "\t";
            if (admin.getListMemoryElement().size() > 1) {
                Integer tam = admin.getListMemoryElement().size();
                admin.getListMemoryElement().get(0).setNextState(in);
                responseBody += admin.getListMemoryElement().get(0).getState() + "\t";
                responseBody += admin.getListMemoryElement().get(0).getNextState() + "\t";
                for (int i = 1; i < tam; i++) {
                    MemoryElementVO aux = admin.getListMemoryElement().get(i - 1);
                    admin.getListMemoryElement().get(i).setNextState(aux.getState());
                    responseBody += admin.getListMemoryElement().get(i).getState() + "\t";
                    responseBody += admin.getListMemoryElement().get(i).getNextState() + "\t";
                }
            } else {
                admin.getListMemoryElement().get(0).setNextState(in);
                responseBody += admin.getListMemoryElement().get(0).getState() + "\t";
                responseBody += admin.getListMemoryElement().get(0).getNextState() + "\t";
            }
            responseBody += "\n";
            char[] st = Integer.toBinaryString(a).toCharArray();
            if (cont < 1) {
                cont++;
            } else {
                cont = 0;
                for(int i=0; i< st.length;i++) {
                    Integer aux = Integer.parseInt(""+st[i]);
                    admin.getListMemoryElement().get(i).setState(aux);
                }
            }
        }

        System.out.println(responseHead);
        System.out.println(responseBody);
    }
}
