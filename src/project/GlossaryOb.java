/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.Serializable;

/**
 *
 * @author x14470572
 */
public class GlossaryOb implements Serializable{
    private String Term;
    private String Explanation;
    private String Category;
    
    
    public GlossaryOb(){
        Term = new String();
        Explanation = new String();
        Category = new String();
    }

    public String getTerm() {
        return Term;
    }

    public void setTerm(String Term) {
        this.Term = Term;
    }

    public String getExplanation() {
        return Explanation;
    }

    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
    
    
}
