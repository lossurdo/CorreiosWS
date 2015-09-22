package com.senac.app;

import com.senac.wscorreios.CResultado;
import com.senac.wscorreios.CServico;
import com.senac.wscorreios.CalcPrecoPrazoWS;
import com.senac.wscorreios.CalcPrecoPrazoWSSoap;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        
        // 41106 - Via PAC
        // 40010 - Via SEDEX
        CalcPrecoPrazoWSSoap ws = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        CResultado retorno = ws.calcPrazo("40010", "90010340", "22470000");   
        
        List<CServico> lista = retorno.getServicos().getCServico();
        for (CServico cs : lista) {
            System.out.println(cs.getPrazoEntrega() + " dia(s)");
        }        
        
    }
    
}
