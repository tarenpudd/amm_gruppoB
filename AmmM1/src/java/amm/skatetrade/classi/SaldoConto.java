/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.skatetrade.classi;

/**
 *
 * @author alber
 */
public class SaldoConto {
    private Utente utente;
    private float conto;
    
    public SaldoConto() {
        utente = null;
        conto = 0;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public float getConto() {
        return conto;
    }

    public void setConto(float conto) {
        this.conto = conto;
    }   
}
